
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object allsales_Scope0 {
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

class allsales extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,List[Sale],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sales: List[Sale]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),_display_(/*2.2*/main(title = "All sales that you do not own or manage")/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

    """),format.raw/*4.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/salepage.css")),format.raw/*4.101*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/table.css")),format.raw/*5.98*/("""">
    <script src=""""),_display_(/*6.19*/routes/*6.25*/.Assets.versioned("javascripts/table.js")),format.raw/*6.66*/(""""></script>

    <div class="demo-card-wide">
        <div class="mdl-card--border">
            <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp sales-table">
                <thead>
                    <tr>
                        <th class="mdl-data-table__cell--non-numeric">Sale Name</th>
                        <th>Location</th>
                        <th>Owners</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*19.22*/for(sale <- sales) yield /*19.40*/ {_display_(Seq[Any](format.raw/*19.42*/("""
                            """),format.raw/*20.29*/("""<tr onclick="window.location = $(this).find('a').attr('href')">
                                <td class="mdl-data-table__cell--non-numeric">
                                    <a href=""""),_display_(/*22.47*/routes/*22.53*/.CatalogController.renderCatalogReadOnlyPage(sale.getId)),format.raw/*22.109*/("""">
                                        """),_display_(/*23.42*/sale/*23.46*/.getName()),format.raw/*23.56*/("""
                                    """),format.raw/*24.37*/("""</a>
                                </td>
                                <td>"""),_display_(/*26.38*/sale/*26.42*/.getLocation()),format.raw/*26.56*/("""</td>
                                <td>"""),_display_(/*27.38*/{
                                    CatalogController.printOwners(sale);
                                    }),format.raw/*29.38*/("""
                                """),format.raw/*30.33*/("""</td>
                            </tr>
                    """)))}),format.raw/*32.22*/("""
                """),format.raw/*33.17*/("""</tbody>
            </table>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(user:User,sales:List[Sale]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sales)

  def f:((User) => (List[Sale]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sales) => apply(user)(sales)

  def ref: this.type = this

}


}

/**/
object allsales extends allsales_Scope0.allsales
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/allsales.scala.html
                  HASH: 395b6a871a353cd4f3aa3b27b9da34818e3d9bba
                  MATRIX: 760->1|886->32|913->34|976->89|1015->91|1047->97|1118->142|1132->148|1198->193|1276->245|1290->251|1352->293|1399->314|1413->320|1474->361|2014->874|2048->892|2088->894|2145->923|2361->1112|2376->1118|2454->1174|2525->1218|2538->1222|2569->1232|2634->1269|2741->1349|2754->1353|2789->1367|2859->1410|2992->1522|3053->1555|3145->1616|3190->1633
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|50->19|50->19|50->19|51->20|53->22|53->22|53->22|54->23|54->23|54->23|55->24|57->26|57->26|57->26|58->27|60->29|61->30|63->32|64->33
                  -- GENERATED --
              */
          