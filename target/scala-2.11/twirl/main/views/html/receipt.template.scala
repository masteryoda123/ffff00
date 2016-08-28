
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object receipt_Scope0 {
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

class receipt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,Sale,Receipt,List[Transaction],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(receipt: Receipt)(transactions: List[Transaction]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*2.46*/routes/*2.52*/.Assets.versioned("stylesheets/receipt.css")),format.raw/*2.96*/("""">
<h3>Receipt for : """),_display_(/*3.20*/receipt/*3.27*/.getSale().getName()),format.raw/*3.47*/("""</h3>
<h3>Date : """),_display_(/*4.13*/receipt/*4.20*/.getDate()),format.raw/*4.30*/("""</h3>

<table>
    <thead>
        <tr>
            <th>Item</th>
            <th>#</th>
            <th>Buyer</th>
            <th>Charge</th>
            <th>Payment Method</th>
        </tr>
    </thead>
    <tbody>
        """),_display_(/*17.10*/for(transaction <- transactions) yield /*17.42*/ {_display_(Seq[Any](format.raw/*17.44*/("""
        """),format.raw/*18.9*/("""<tr>
            <td>
                """),_display_(/*20.18*/transaction/*20.29*/.getItem().getName()),format.raw/*20.49*/("""
            """),format.raw/*21.13*/("""</td>
            <td>
                """),_display_(/*23.18*/transaction/*23.29*/.getQuantity()),format.raw/*23.43*/("""
            """),format.raw/*24.13*/("""</td>
            <td>
                """),_display_(/*26.18*/transaction/*26.29*/.getBuyer()),format.raw/*26.40*/("""
            """),format.raw/*27.13*/("""</td>
            <td>
                """),_display_(/*29.18*/transaction/*29.29*/.getProfit()),format.raw/*29.41*/("""
            """),format.raw/*30.13*/("""</td>
            <td>
                """),_display_(/*32.18*/transaction/*32.29*/.getMethod()),format.raw/*32.41*/("""
            """),format.raw/*33.13*/("""</td>
        </tr>
    """)))}),format.raw/*35.6*/("""
    """),format.raw/*36.5*/("""</tbody>
</table>
<h3>Total Profit : $"""),_display_(/*38.22*/receipt/*38.29*/.getProfit()),format.raw/*38.41*/("""</h3>"""))
      }
    }
  }

  def render(user:User,sale:Sale,receipt:Receipt,transactions:List[Transaction]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(receipt)(transactions)

  def f:((User) => (Sale) => (Receipt) => (List[Transaction]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (receipt) => (transactions) => apply(user)(sale)(receipt)(transactions)

  def ref: this.type = this

}


}

/**/
object receipt extends receipt_Scope0.receipt
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/receipt.scala.html
                  HASH: e00c13dfc0470fd47bdaf8e47bccb06ce53bd39a
                  MATRIX: 778->1|948->76|975->77|1046->122|1060->128|1124->172|1172->194|1187->201|1227->221|1271->239|1286->246|1316->256|1571->484|1619->516|1659->518|1695->527|1761->566|1781->577|1822->597|1863->610|1930->650|1950->661|1985->675|2026->688|2093->728|2113->739|2145->750|2186->763|2253->803|2273->814|2306->826|2347->839|2414->879|2434->890|2467->902|2508->915|2563->940|2595->945|2661->984|2677->991|2710->1003
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|34->3|35->4|35->4|35->4|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|54->23|54->23|54->23|55->24|57->26|57->26|57->26|58->27|60->29|60->29|60->29|61->30|63->32|63->32|63->32|64->33|66->35|67->36|69->38|69->38|69->38
                  -- GENERATED --
              */
          