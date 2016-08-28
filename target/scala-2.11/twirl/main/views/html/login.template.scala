
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.cyan-light_blue.min.css">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/login.css")),format.raw/*9.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/style.css")),format.raw/*10.98*/("""">
    <title>FFFF00</title>
</head>

<body>
    <div id="translucent-background"></div>
    <div class="mdl-layout mdl-js-layout">
        <div class="mdl-typography--display-4">
        <div class="mdl-logo title-logo">#ffff00</div>
        </div>
        <main class="mdl-layout__content">
            <div class="mdl-card__title mdl-color--primary mdl-color-text--white registration">
                <h4 class="mdl-card__title-text">Registration</h4>
            </div>
            <div class="mdl-card mdl-shadow--6dp login-window">
                <div class="mdl-card__supporting-text">
                    <p class="login-error-message">
                        """),_display_(/*27.26*/message),format.raw/*27.33*/("""
                    """),format.raw/*28.21*/("""</p>
                    <form action=""""),_display_(/*29.36*/routes/*29.42*/.LoginController.loginAttempt),format.raw/*29.71*/("""" class="login-form login-elements" method="post">
                        <i class="material-icons">person</i>

                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                            <input class="mdl-textfield__input" type="text" id="username" name="username"/>
                            <label class="mdl-textfield__label" for="username">Username</label>
                        </div>
                        <i class="material-icons">lock</i>
                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                            <input class="mdl-textfield__input" type="password" id="password" name="password"/>
                            <label class="mdl-textfield__label" for="password">Password</label>
                        </div>
                    </form>
                    <form action=""""),_display_(/*42.36*/routes/*42.42*/.LoginController.register),format.raw/*42.67*/("""" class="register-form registration" method="post">
                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                            <input class="mdl-textfield__input" type="text" id="username" name="username"/>
                            <label class="mdl-textfield__label" for="username">Username</label>
                        </div>
                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                            <input class="mdl-textfield__input" type="password" id="password" name="password"/>
                            <label class="mdl-textfield__label" for="password">Password</label>
                        </div>
                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label firstname">
                            <input class="mdl-textfield__input" type="text" id="fname" name="firstname"/>
                            <label class="mdl-textfield__label" for="fname">First Name</label>
                        </div>
                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label lastname">
                            <input class="mdl-textfield__input" type="text" id="lname" name="lastname"/>
                            <label class="mdl-textfield__label" for="lname">Last Name</label>
                        </div>
                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label emailaddress">
                            <input class="mdl-textfield__input" type="text" id="email" name="email"/>
                            <label class="mdl-textfield__label" for="email">Email Address</label>
                        </div>
                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label phonenumber">
                            <input class="mdl-textfield__input" type="text" pattern="[0-9]*" id="phone" name="phone"/>
                            <label class="mdl-textfield__label" for="phone">Phone</label>
                        </div>
                    </form>
                </div>
                <div class="mdl-card__actions mdl-card--border login-elements">
                    <div class="mdl-grid">
                        <div class="mdl-cell mdl-cell--6-col mdl-cell--4-col-tablet mdl-cell--2-col-phone">
                            <label class="mdl-checkbox mdl-js-checkbox" for="checkbox">
                                <input type="checkbox" id="checkbox" class="mdl-checkbox__input" checked>
                                <span class="mdl-checkbox__label">Remember me</span>
                            </label>
                        </div>
                        <div class="mdl-cell mdl-cell--6-col mdl-cell--4-col-tablet mdl-cell--2-col-phone login">
                            <a href="#"><button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect login-button">Log in</button></a>
                        </div>
                    </div>
                </div>
                <div class="mdl-card__actions mdl-card--border registration">
                    <div class="mdl-grid">
                        <div class="mdl-cell mdl-cell--6-col mdl-cell--4-col-tablet mdl-cell--2-col-phone">
                            <a href="/#"><button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect cancel-button">Cancel</button></a>
                        </div>
                        <div class="mdl-cell mdl-cell--6-col mdl-cell--4-col-tablet mdl-cell--2-col-phone">
                            <a href="#"><button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect register-button">Register</button></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="register login-elements">
                <a href="#">Create an account</a>
            </div>
        </main>
    </div>
    <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
    <script src=""""),_display_(/*99.19*/routes/*99.25*/.Assets.versioned("javascripts/typed.js")),format.raw/*99.66*/(""""></script>
    <script src=""""),_display_(/*100.19*/routes/*100.25*/.Assets.versioned("javascripts/login-registration.js")),format.raw/*100.79*/(""""></script>
    <script>
        $(function()"""),format.raw/*102.21*/("""{"""),format.raw/*102.22*/("""
            """),format.raw/*103.13*/("""$(".title-logo").typed("""),format.raw/*103.36*/("""{"""),format.raw/*103.37*/("""
                """),format.raw/*104.17*/("""strings: ["#ffff00 ^400", "Buy... ^400", "Sell... ^400", "Trade... ^400", "#ffff00"],
                typeSpeed: 70,
                backSpeed: 30,
                backDelay: 100
            """),format.raw/*108.13*/("""}"""),format.raw/*108.14*/(""");
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/(""");
    </script>
    <script src="https://code.getmdl.io/1.1.3/material.min.js"></script>
    
</body>


</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/login.scala.html
                  HASH: ad281198db930957e8fffda7483ca74df40f8868
                  MATRIX: 745->1|857->18|885->20|1327->436|1341->442|1403->484|1482->536|1497->542|1560->584|2259->1256|2287->1263|2336->1284|2403->1324|2418->1330|2468->1359|3402->2266|3417->2272|3463->2297|7681->6488|7696->6494|7758->6535|7816->6565|7832->6571|7908->6625|7982->6670|8012->6671|8054->6684|8106->6707|8136->6708|8182->6725|8402->6916|8432->6917|8471->6928|8501->6929
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|58->27|58->27|59->28|60->29|60->29|60->29|73->42|73->42|73->42|130->99|130->99|130->99|131->100|131->100|131->100|133->102|133->102|134->103|134->103|134->103|135->104|139->108|139->108|140->109|140->109
                  -- GENERATED --
              */
          