
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createsale_Scope0 {
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

class createsale extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main(title = "Create new Sale")/*2.33*/ {_display_(Seq[Any](format.raw/*2.35*/("""

  """),format.raw/*4.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.48*/routes/*4.54*/.Assets.versioned("stylesheets/createsale.css")),format.raw/*4.101*/("""">

  <div class="demo-card-wide">
      <div class="mdl-card mdl-card--border mdl-shadow--2dp mdl-card__supporting-text">
        <form action=""""),_display_(/*8.24*/routes/*8.30*/.SalesController.createSale),format.raw/*8.57*/("""" class="update-form" method="post">
          <ul>
            <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <input class="mdl-textfield__input" type="text" name="name" id="salename"/>
                <label class="mdl-textfield__label" for="salename">Title of Sale</label>
            </li>
            <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <input class="mdl-textfield__input" type="text" name="location" id="location"/>
                <label class="mdl-textfield__label" for="location">Location</label>
            </li>
            <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <input class="mdl-textfield__input" type="text" name="date" id="date"/>
                <label class="mdl-textfield__label" for="date">Date</label>
            </li>
          </ul>
            <button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" type="submit">
                Create
            </button>
        </form>
    </div>
</div>

      """),format.raw/*30.64*/("""
        """),format.raw/*31.35*/("""
          """),format.raw/*32.98*/("""
          """),format.raw/*33.21*/("""
          """),format.raw/*34.98*/("""
            """),format.raw/*35.112*/("""
              """),format.raw/*36.25*/("""
            """),format.raw/*37.26*/("""
          """),format.raw/*38.21*/("""
        """),format.raw/*39.19*/("""
      """),format.raw/*40.17*/("""

    """),format.raw/*42.17*/("""
            """),format.raw/*43.63*/("""
            """),format.raw/*44.74*/("""
            """),format.raw/*45.66*/("""
                """),format.raw/*46.61*/("""
                """),format.raw/*47.65*/("""
                        """),format.raw/*48.30*/("""
                            """),format.raw/*49.64*/("""
                            """),format.raw/*50.63*/("""
                        """),format.raw/*51.32*/("""
            """),format.raw/*52.20*/("""
    """),format.raw/*53.18*/("""

""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object createsale extends createsale_Scope0.createsale
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/createsale.scala.html
                  HASH: f961c6b409e09bf265d2b567b75d03fe8ad367e4
                  MATRIX: 753->1|860->13|887->15|926->46|965->48|995->52|1066->97|1080->103|1148->150|1320->296|1334->302|1381->329|2509->1486|2546->1521|2585->1619|2624->1640|2663->1738|2705->1850|2748->1875|2789->1901|2828->1922|2865->1941|2900->1958|2934->1976|2975->2039|3016->2113|3057->2179|3102->2240|3147->2305|3200->2335|3257->2399|3314->2462|3367->2494|3408->2514|3441->2532
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|39->8|39->8|39->8|61->30|62->31|63->32|64->33|65->34|66->35|67->36|68->37|69->38|70->39|71->40|73->42|74->43|75->44|76->45|77->46|78->47|79->48|80->49|81->50|82->51|83->52|84->53
                  -- GENERATED --
              */
          