
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

     object profile_Scope1 {
import helper._

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""
"""),_display_(/*3.2*/main(title = "Hi " + user.getFirstName + "! Here's your profile.")/*3.68*/ {_display_(Seq[Any](format.raw/*3.70*/("""

"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.versioned("stylesheets/profile.css")),format.raw/*5.96*/("""">


<dialog class="mdl-dialog">
    <h4 class="mdl-dialog-title">Please enter your password.</h4>
    <div class="mdl-dialog__content">
            <input class="mdl-textfield__input" type="password" id="pword" name="password"/>
    </div>
    <div class="mdl-dialog__actions--full-width">
        <button type="button" class="mdl-button enter">Enter</button>
    </div>
</dialog>
<div class="mdl-grid picture">
    <div id="welcome-card" class="mdl-cell mdl-cell--3-col">
        <div class="mdl-card mdl-shadow--2dp">
            <!--            <div class="mdl-card__title profile-header">
                            <h2 class="mdl-card__title-text">Hi, """),_display_(/*21.67*/user/*21.71*/.getFirstName),format.raw/*21.84*/("""! Here's your profile.</h2>
                        </div>-->
                <div class="mdl-card__media" id="profile-picture" style='height:300;background:url("""),_display_(/*23.101*/routes/*23.107*/.Assets.versioned("data/user/" + user.getImageName)),format.raw/*23.158*/(""");background-size:cover;'>
                    <div id="form-wrapper">
                        """),_display_(/*25.26*/form(action = routes.Utils.uploadProfile, 'enctype -> "multipart/form-data", 'id -> "pictureForm")/*25.124*/ {_display_(Seq[Any](format.raw/*25.126*/("""

                        """),format.raw/*27.25*/("""<div style='height: 0px;width: 0px; overflow:hidden;'><input id="picupload" class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" type="file" name="picture"></div>
                        <p>Upload New Picture</p>
                        <div style='height: 0px;width: 0px; overflow:hidden;'>
                            <input class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" type="submit">
                        </div>

                        """)))}),format.raw/*33.26*/("""
                    """),format.raw/*34.21*/("""</div>
                </div>
            <script>
                $('#profile-picture').hover(
                    function() """),format.raw/*38.32*/("""{"""),format.raw/*38.33*/("""
                        """),format.raw/*39.25*/("""$('#form-wrapper').fadeIn();
                    """),format.raw/*40.21*/("""}"""),format.raw/*40.22*/(""",
                    function() """),format.raw/*41.32*/("""{"""),format.raw/*41.33*/("""
                        """),format.raw/*42.25*/("""$('#form-wrapper').fadeOut();
                    """),format.raw/*43.21*/("""}"""),format.raw/*43.22*/("""
                """),format.raw/*44.17*/(""");
                $('#form-wrapper').click(
                    function(e) """),format.raw/*46.33*/("""{"""),format.raw/*46.34*/("""
                        """),format.raw/*47.25*/("""e.stopImmediatePropagation();
                        $('#picupload').click();
                    """),format.raw/*49.21*/("""}"""),format.raw/*49.22*/("""
                """),format.raw/*50.17*/(""");
                $('#picupload').click(function(e) """),format.raw/*51.51*/("""{"""),format.raw/*51.52*/("""
                    """),format.raw/*52.21*/("""e.stopImmediatePropagation();
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/(""");
                $('#picupload').change( function() """),format.raw/*54.52*/("""{"""),format.raw/*54.53*/("""
                    """),format.raw/*55.21*/("""$('#pictureForm').submit();
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/(""");
            </script>

        <div class="mdl-card__supporting-text">
            <form action=""""),_display_(/*60.28*/routes/*60.34*/.ProfileController.updateProfile),format.raw/*60.66*/("""" class="update-form" method="post">
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label firstname">
                    <input class="mdl-textfield__input" value=""""),_display_(/*62.65*/user/*62.69*/.getFirstName),format.raw/*62.82*/("""" type="text" id="fname"
                           name="firstname"/>
                    <label class="mdl-textfield__label" for="fname">First Name</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label lastname">
                    <input class="mdl-textfield__input" value=""""),_display_(/*67.65*/user/*67.69*/.getLastName),format.raw/*67.81*/("""" type="text" id="lname"
                           name="lastname"/>
                    <label class="mdl-textfield__label" for="lname">Last Name</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label emailaddress">
                    <input class="mdl-textfield__input" value=""""),_display_(/*72.65*/user/*72.69*/.getEmail),format.raw/*72.78*/("""" type="text" id="emailid" name="email"/>
                    <label class="mdl-textfield__label" for="email">Email</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label phonenumber">
                    <input class="mdl-textfield__input" value=""""),_display_(/*76.65*/user/*76.69*/.getPhone),format.raw/*76.78*/("""" type="text" pattern="[0-9]*" id="phoneid"
                           name="phone"/>
                    <label class="mdl-textfield__label" for="phone">Phone</label>
                </div>
            </form>


        </div>
        <div class="mdl-card__actions mdl-card--border save">
            <div class="mdl-grid">
                <div class="mdl-cell mdl-cell--6-col mdl-cell--4-col-tablet mdl-cell--2-col-phone">
                </div>
                <div class="mdl-cell mdl-cell--6-col mdl-cell--4-col-tablet mdl-cell--2-col-phone">
                        <button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect saveButton">
                            Save Changes
                        </button>
                </div>
            </div>
        </div>
        </div>
    </div>

    """),format.raw/*98.64*/("""
        """),format.raw/*99.51*/("""
            """),format.raw/*100.107*/("""
                """),format.raw/*101.66*/("""
            """),format.raw/*102.23*/("""
        """),format.raw/*103.19*/("""
    """),format.raw/*104.15*/("""

"""),format.raw/*106.1*/("""</div>
<script>
    var dialog = document.querySelector('dialog');
    var saveButton = document.querySelector('.saveButton');
    if (! dialog.showModal) """),format.raw/*110.29*/("""{"""),format.raw/*110.30*/("""
        """),format.raw/*111.9*/("""dialogPolyfill.registerDialog(dialog);
    """),format.raw/*112.5*/("""}"""),format.raw/*112.6*/("""
    """),format.raw/*113.5*/("""saveButton.addEventListener('click', function() """),format.raw/*113.53*/("""{"""),format.raw/*113.54*/("""
        """),format.raw/*114.9*/("""dialog.showModal();
    """),format.raw/*115.5*/("""}"""),format.raw/*115.6*/(""");
    dialog.querySelector('.enter').addEventListener('click', function() """),format.raw/*116.73*/("""{"""),format.raw/*116.74*/("""
        """),format.raw/*117.9*/("""var enteredPassword = $('#pword').val();
        $.post('"""),_display_(/*118.18*/routes/*118.24*/.ProfileController.updateProfile),format.raw/*118.56*/("""',
        """),format.raw/*119.9*/("""{"""),format.raw/*119.10*/("""
            """),format.raw/*120.13*/("""firstName: $('#fname').val(),
            lastName: $('#lname').val(),
            email: $('#emailid').val(),
            phone: $('#phoneid').val(),
            verifypassword: enteredPassword
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/(""");
        dialog.close();
    """),format.raw/*127.5*/("""}"""),format.raw/*127.6*/(""");
</script>

""")))}),format.raw/*130.2*/("""
"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}
}

/**/
object profile extends profile_Scope0.profile_Scope1.profile
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/profile.scala.html
                  HASH: 442f9e72d06b136110528c050ccb051140a49d35
                  MATRIX: 793->18|900->30|927->32|1001->98|1040->100|1068->102|1139->147|1153->153|1217->197|1904->857|1917->861|1951->874|2141->1036|2157->1042|2230->1093|2353->1189|2461->1287|2502->1289|2556->1315|3079->1807|3128->1828|3283->1955|3312->1956|3365->1981|3442->2030|3471->2031|3532->2064|3561->2065|3614->2090|3692->2140|3721->2141|3766->2158|3871->2235|3900->2236|3953->2261|4080->2360|4109->2361|4154->2378|4235->2431|4264->2432|4313->2453|4387->2499|4416->2500|4498->2554|4527->2555|4576->2576|4648->2620|4677->2621|4805->2722|4820->2728|4873->2760|5102->2962|5115->2966|5149->2979|5521->3324|5534->3328|5567->3340|5941->3687|5954->3691|5984->3700|6325->4014|6338->4018|6368->4027|7225->4915|7262->4966|7305->5073|7351->5139|7393->5162|7431->5181|7465->5196|7495->5198|7679->5353|7709->5354|7746->5363|7817->5406|7846->5407|7879->5412|7956->5460|7986->5461|8023->5470|8075->5494|8104->5495|8208->5570|8238->5571|8275->5580|8361->5638|8377->5644|8431->5676|8470->5687|8500->5688|8542->5701|8773->5904|8803->5905|8862->5936|8891->5937|8937->5952
                  LINES: 30->2|35->2|36->3|36->3|36->3|38->5|38->5|38->5|38->5|54->21|54->21|54->21|56->23|56->23|56->23|58->25|58->25|58->25|60->27|66->33|67->34|71->38|71->38|72->39|73->40|73->40|74->41|74->41|75->42|76->43|76->43|77->44|79->46|79->46|80->47|82->49|82->49|83->50|84->51|84->51|85->52|86->53|86->53|87->54|87->54|88->55|89->56|89->56|93->60|93->60|93->60|95->62|95->62|95->62|100->67|100->67|100->67|105->72|105->72|105->72|109->76|109->76|109->76|131->98|132->99|133->100|134->101|135->102|136->103|137->104|139->106|143->110|143->110|144->111|145->112|145->112|146->113|146->113|146->113|147->114|148->115|148->115|149->116|149->116|150->117|151->118|151->118|151->118|152->119|152->119|153->120|158->125|158->125|160->127|160->127|163->130
                  -- GENERATED --
              */
          