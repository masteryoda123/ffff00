
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object administration_Scope0 {
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

class administration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[User], currUser: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
"""),_display_(/*2.2*/main(title = "Administration")/*2.32*/ {_display_(Seq[Any](format.raw/*2.34*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/administration.css")),format.raw/*3.103*/("""">

<h4 class="mdl-color-text--grey-600">Manage Users</h4>
<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp user-table">
    <thead>
    <tr>
        <th class="mdl-data-table__cell--non-numeric">Username</th>
        <th class="mdl-data-table__cell--non-numeric">Name</th>
        <th>Phone Number</th>
        <th class="mdl-data-table__cell--non-numeric">Email Address</th>
        <th class="mdl-data-table__cell--non-numeric">Account Type</th>
        <th class="mdl-data-table__cell--non-numeric">Locked</th>
    </tr>
    </thead>
    <tbody>
    """),_display_(/*18.6*/for(index <- 0 until users.size) yield /*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
        """),format.raw/*19.9*/("""<tr>
            <td class="mdl-data-table__cell--non-numeric">"""),_display_(/*20.60*/users/*20.65*/.get(index).getUserName),format.raw/*20.88*/("""</td>
            <td class="mdl-data-table__cell--non-numeric">"""),_display_(/*21.60*/users/*21.65*/.get(index).getFirstName),format.raw/*21.89*/(""" """),_display_(/*21.91*/users/*21.96*/.get(index).getLastName),format.raw/*21.119*/("""</td>
            <td>"""),_display_(/*22.18*/users/*22.23*/.get(index).getPhone),format.raw/*22.43*/("""</td>
            <td class="mdl-data-table__cell--non-numeric">"""),_display_(/*23.60*/users/*23.65*/.get(index).getEmail),format.raw/*23.85*/("""</td>
            <td>"""),_display_(/*24.18*/users/*24.23*/.get(index).getRole),format.raw/*24.42*/("""</td>
            <td><label class="mdl-switch mdl-js-switch mdl-js-ripple-effect" for="""),_display_(/*25.83*/index),format.raw/*25.88*/(""">
                """),_display_(/*26.18*/if(users.get(index).getIsLocked == false)/*26.59*/ {_display_(Seq[Any](format.raw/*26.61*/("""

                    """),format.raw/*28.21*/("""<input type="checkbox" id="""),_display_(/*28.48*/index),format.raw/*28.53*/(""" """),format.raw/*28.54*/("""class="mdl-switch__input" unchecked>
                    """),_display_(/*29.22*/if(currUser.getIsSuperUser && !users.get(index).getIsSuperUser)/*29.85*/ {_display_(Seq[Any](format.raw/*29.87*/("""
                        """),format.raw/*30.25*/("""<a href=""""),_display_(/*30.35*/routes/*30.41*/.AdministrationController.lock(users.get(index).getId)),format.raw/*30.95*/("""">
                            <button id="confirm-control" class="mdl-button mdl-js-button mdl-color-text--blue-300">
                                Change
                            </button>
                        </a>
                    """)))}),format.raw/*35.22*/("""
                """)))}/*36.19*/else/*36.24*/{_display_(Seq[Any](format.raw/*36.25*/("""
                    """),format.raw/*37.21*/("""<input type="checkbox" id="""),_display_(/*37.48*/index),format.raw/*37.53*/(""" """),format.raw/*37.54*/("""class="mdl-switch__input" checked>
                    """),_display_(/*38.22*/if(currUser.getIsSuperUser && !users.get(index).getIsSuperUser)/*38.85*/ {_display_(Seq[Any](format.raw/*38.87*/("""
                        """),format.raw/*39.25*/("""<a href=""""),_display_(/*39.35*/routes/*39.41*/.AdministrationController.unlock(users.get(index).getId)),format.raw/*39.97*/("""">
                            <button id="confirm-control" class="mdl-button mdl-js-button mdl-color-text--blue-300">
                                Change
                            </button>
                        </a>
                    """)))}),format.raw/*44.22*/("""
            """)))}),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""</label></td>
        </tr>
    """)))}),format.raw/*48.6*/("""

    """),format.raw/*50.5*/("""</tbody>
</table>

"""),format.raw/*53.41*/("""
        """),format.raw/*54.49*/("""
            """),format.raw/*55.75*/("""
                """),format.raw/*56.108*/("""
                    """),format.raw/*57.32*/("""
                """),format.raw/*58.30*/("""
            """),format.raw/*59.21*/("""
            """),format.raw/*60.103*/("""
                """),format.raw/*61.27*/("""
            """),format.raw/*62.26*/("""
        """),format.raw/*63.19*/("""
    """),format.raw/*64.10*/("""

"""),format.raw/*66.13*/("""
    """),format.raw/*67.32*/("""
        """),format.raw/*68.28*/("""
        """),format.raw/*69.30*/("""
        """),format.raw/*70.32*/("""
        """),format.raw/*71.88*/("""
        """),format.raw/*72.37*/("""
        """),format.raw/*73.68*/("""
    """),format.raw/*74.10*/("""
"""),format.raw/*75.14*/("""

""")))}))
      }
    }
  }

  def render(users:List[User],currUser:User): play.twirl.api.HtmlFormat.Appendable = apply(users,currUser)

  def f:((List[User],User) => play.twirl.api.HtmlFormat.Appendable) = (users,currUser) => apply(users,currUser)

  def ref: this.type = this

}


}

/**/
object administration extends administration_Scope0.administration
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/administration.scala.html
                  HASH: 851cbe18dc1e8a29efa2b920e935d535118c0cd6
                  MATRIX: 772->1|902->36|929->38|967->68|1006->70|1033->71|1104->116|1118->122|1190->173|1812->769|1860->801|1900->803|1936->812|2027->876|2041->881|2085->904|2177->969|2191->974|2236->998|2265->1000|2279->1005|2324->1028|2374->1051|2388->1056|2429->1076|2521->1141|2535->1146|2576->1166|2626->1189|2640->1194|2680->1213|2795->1301|2821->1306|2867->1325|2917->1366|2957->1368|3007->1390|3061->1417|3087->1422|3116->1423|3201->1481|3273->1544|3313->1546|3366->1571|3403->1581|3418->1587|3493->1641|3770->1887|3807->1906|3820->1911|3859->1912|3908->1933|3962->1960|3988->1965|4017->1966|4100->2022|4172->2085|4212->2087|4265->2112|4302->2122|4317->2128|4394->2184|4671->2430|4716->2444|4757->2457|4820->2490|4853->2496|4900->2555|4937->2604|4978->2679|5024->2787|5073->2819|5118->2849|5159->2870|5201->2973|5246->3000|5287->3026|5324->3045|5357->3055|5387->3069|5420->3101|5457->3129|5494->3159|5531->3191|5568->3279|5605->3316|5642->3384|5675->3394|5704->3408
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|75->44|76->45|77->46|79->48|81->50|84->53|85->54|86->55|87->56|88->57|89->58|90->59|91->60|92->61|93->62|94->63|95->64|97->66|98->67|99->68|100->69|101->70|102->71|103->72|104->73|105->74|106->75
                  -- GENERATED --
              */
          