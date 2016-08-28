
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object allreceipts_Scope0 {
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

class allreceipts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,List[Receipt],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(receipts: List[Receipt]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*2.2*/main(title = "Receipts")/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""

"""),format.raw/*4.1*/("""<div class="demo-card-wide">
    <div class="mdl-card--border">
        <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp transactions-table">
            <thead>
            <tr>
                <th class="mdl-data-table__cell--non-numeric">Receipt</th>
                <th>Date</th>
                <th>Profit</th>
            </tr>
            </thead>
            <tbody>
            """),_display_(/*15.14*/for(receipt <- receipts) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
            """),format.raw/*16.13*/("""<tr class="transaction-row" >
                <td class="mdl-data-table__cell--non-numeric">
                    """),_display_(/*18.22*/receipt/*18.29*/.getId()),format.raw/*18.37*/("""
                """),format.raw/*19.17*/("""</td>
                <td class="mdl-data-table__cell--non-numeric">
                    """),_display_(/*21.22*/receipt/*21.29*/.getDate()),format.raw/*21.39*/("""
                """),format.raw/*22.17*/("""</td>
                <td class="mdl-data-table__cell">
                    $"""),_display_(/*24.23*/receipt/*24.30*/.getProfit()),format.raw/*24.42*/("""
                """),format.raw/*25.17*/("""</td>
                <td class="mdl-data-table__cell">
                    <a href=""""),_display_(/*27.31*/routes/*27.37*/.CatalogController.renderReceipt(receipt.getId)),format.raw/*27.84*/("""" class="mdl-button mdl-js-button mdl-button--accent">View</a>
                </td>
            </tr>
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""</tbody>
        </table>
    </div>
</div>

""")))}))
      }
    }
  }

  def render(user:User,receipts:List[Receipt]): play.twirl.api.HtmlFormat.Appendable = apply(user)(receipts)

  def f:((User) => (List[Receipt]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (receipts) => apply(user)(receipts)

  def ref: this.type = this

}


}

/**/
object allreceipts extends allreceipts_Scope0.allreceipts
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/allreceipts.scala.html
                  HASH: 8e3f99d6dd8bce13e6671766016f72a18c9ace97
                  MATRIX: 769->1|901->38|928->40|960->64|999->66|1027->68|1483->497|1523->521|1563->523|1604->536|1745->650|1761->657|1790->665|1835->682|1952->772|1968->779|1999->789|2044->806|2149->884|2165->891|2198->903|2243->920|2356->1006|2371->1012|2439->1059|2586->1175|2627->1188
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|46->15|46->15|46->15|47->16|49->18|49->18|49->18|50->19|52->21|52->21|52->21|53->22|55->24|55->24|55->24|56->25|58->27|58->27|58->27|61->30|62->31
                  -- GENERATED --
              */
          