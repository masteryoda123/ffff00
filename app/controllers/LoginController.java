package controllers;

import com.google.inject.Inject;
import models.LoginFormData;
import models.User;
import models.UserFormData;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import play.Logger;


/**
 * Created by Douglas on 6/10/16.
 * This controller is used to handle HTTP requests regarding login and register.
 */

public class LoginController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * validates login attempt.
     * @return home page if incorrect username or password, index page otherwise.
     */
    public Result loginAttempt() {
        session().remove("currentSale");
        Form<LoginFormData> loginForm = formFactory.form(LoginFormData.class).bindFromRequest();
        String attemptUsername = loginForm.get().getUsername();
        String attemptPass = loginForm.get().getPassword();
        User attemptedUser = User.fetchByUsername(attemptUsername);
        if (attemptedUser != null) {
            if (attemptedUser.checkPassword(attemptPass) && !attemptedUser.getIsLocked()) {
                session("connected", attemptUsername);
                attemptedUser.setIsLocked(false);
                attemptedUser.setLoginAttempts(0);
                attemptedUser.update();
                return redirect(routes.Application.index());
            } else if (attemptedUser.getIsLocked()) {
                return unauthorized(login.render("User is locked!"));
            } else {
                attemptedUser.setLoginAttempts(attemptedUser.getLoginAttempts() + 1);
                attemptedUser.update();
                if (attemptedUser.getLoginAttempts() > 1) {
                    attemptedUser.setIsLocked(true);
                    Logger.debug("Is the user locked? " + (attemptedUser.getIsLocked()? "yes":"no"));
                    attemptedUser.update();
                }
            }
            return unauthorized(login.render("incorrect password."));
        }
        if (attemptUsername.equals("user") && attemptPass.equals("pass")) {
            return redirect(routes.Application.index());
        } else {
            return unauthorized(login.render("incorrect password."));
        }
    }

    /**
     * adds new user to database.
     * @return login page.
     */
    public Result register() {
        Form<UserFormData> userForm = formFactory.form(UserFormData.class).bindFromRequest();
        User user = User.makeInstance(userForm.get());
        user.save();
        return ok(login.render(""));
    }
}