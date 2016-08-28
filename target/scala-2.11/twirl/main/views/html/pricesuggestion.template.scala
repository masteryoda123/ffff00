
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pricesuggestion_Scope0 {
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

class pricesuggestion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,List[Sale],play.twirl.api.HtmlFormat.Appendable] {

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
object pricesuggestion extends pricesuggestion_Scope0.pricesuggestion
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/pricesuggestion.scala.html
                  HASH: 395b6a871a353cd4f3aa3b27b9da34818e3d9bba
                  MATRIX: 774->1|900->32|927->34|990->89|1029->91|1061->97|1132->142|1146->148|1212->193|1290->245|1304->251|1366->293|1413->314|1427->320|1488->361|2028->874|2062->892|2102->894|2159->923|2375->1112|2390->1118|2468->1174|2539->1218|2552->1222|2583->1232|2648->1269|2755->1349|2768->1353|2803->1367|2873->1410|3006->1522|3067->1555|3159->1616|3204->1633
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|50->19|50->19|50->19|51->20|53->22|53->22|53->22|54->23|54->23|54->23|55->24|57->26|57->26|57->26|58->27|60->29|61->30|63->32|64->33
                  -- GENERATED --
              */
          