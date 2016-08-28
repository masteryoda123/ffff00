package controllers;

import com.avaje.ebean.Model;
import com.google.inject.Inject;
import models.ProfileFormData;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import views.html.*;
import views.html.profile;

import play.Logger;

/**
 * Created by Douglas on 6/15/2016.
 * This controller handles changing profile information.
 */
public class ProfileController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * renders profile page.
     * @return profile page.
     */
    public Result view() {
        String user = session("connected");
        if (user != null) {
            List<User> listUsers = new Model.Finder(User.class).all();
            User displayUser = listUsers.get(listUsers.indexOf(new User(user, null)));
            if (displayUser != null) {
                return ok(profile.render(displayUser));
            }
        }
       return ok(login.render("must be logged in to continue."));
    }

    /**
     * changes user information
     * @return updated profile page.
     */
    public Result updateProfile() {
        Logger.debug("updateProfile called!");
        Form<ProfileFormData> profileForm = formFactory.form(ProfileFormData.class).bindFromRequest();
        String user = session("connected");
        ProfileFormData updatedUser = profileForm.get();
        User thisUser;
        if (user!= null) {
            List<User> listUsers = new Model.Finder(User.class).all();
            thisUser = listUsers.get(listUsers.indexOf(new User(user, null)));
            if (updatedUser.getVerifypassword().equals(thisUser.getPassword())) {
                thisUser.setFirstName(updatedUser.getFirstName());
                thisUser.setLastName(updatedUser.getLastName());
                thisUser.setEmail(updatedUser.getEmail());
                thisUser.setPhone(updatedUser.getPhone());
                thisUser.update();
            }
            return ok(profile.render(thisUser));
        }
        return ok(login.render("User not found."));
    }
//
//    public String getPhoto() {
//        User user = Utils.getUserSession();
//        if (user.getPicture() == null) {
//            return @routes.Assets.versioned("images/guest-icon.png")
//        } else {
//            return "images/guest-icon";
//        }
//    }
}
