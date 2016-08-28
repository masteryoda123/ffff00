
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object report_Scope0 {
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

class report extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[User,Sale,List[Receipt],List[Item],Map[User, List[Receipt]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(receiptsssss: List[Receipt])(items: List[Item])(userReceipts: Map[User, List[Receipt]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.114*/("""

"""),_display_(/*3.2*/main(title = "Financial Report for Sale" + sale.getName)/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/("""
    """),format.raw/*4.5*/("""<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    """),format.raw/*5.101*/("""
    """),format.raw/*6.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("stylesheets/report.css")),format.raw/*6.99*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("stylesheets/table.css")),format.raw/*7.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/style.css")),format.raw/*8.98*/("""">

"""),format.raw/*10.43*/("""
    """),format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<div class="demo-card-wide">
            <div class="mdl-card__title">
                <h3 class="mdl-card__title-text">Financial Report for Sale """"),_display_(/*14.78*/sale/*14.82*/.getName()),format.raw/*14.92*/(""""</h3>
            </div>
            """),_display_(/*16.14*/for((userReceipt, receipts) <- userReceipts) yield /*16.58*/ {_display_(Seq[Any](format.raw/*16.60*/("""
                """),format.raw/*17.17*/("""<h4 class="mdl-card__title-text">User: """),_display_(/*17.57*/userReceipt/*17.68*/.getUserName),format.raw/*17.80*/("""</h4>
                <div class="mdl-card--border">
                    <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp receipts-table">
                        <thead>
                        <tr>
                            <th class="mdl-data-table__cell tiny">Receipt ID</th>
                            <th class="mdl-data-table__cell medium">Date</th>
                            <th class="mdl-data-table__cell tiny">Profit</th>
                        </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*28.26*/for(receipt <- userReceipts.get(userReceipt)) yield /*28.71*/ {_display_(Seq[Any](format.raw/*28.73*/("""
                        """),format.raw/*29.25*/("""<tr>
                            <td class="mdl-data-table__cell">
                                """),_display_(/*31.34*/receipt/*31.41*/.getId()),format.raw/*31.49*/("""
                            """),format.raw/*32.29*/("""</td>
                            <td class="mdl-data-table__cell">
                                """),_display_(/*34.34*/receipt/*34.41*/.getDate()),format.raw/*34.51*/("""
                            """),format.raw/*35.29*/("""</td>
                            <td class="mdl-data-table__cell">
                                $"""),_display_(/*37.35*/Utils/*37.40*/.currToString(receipt.getProfit())),format.raw/*37.74*/("""
                            """),format.raw/*38.29*/("""</td>
                        </tr>
                        """)))}),format.raw/*40.26*/("""
                        """),format.raw/*41.25*/("""</tbody>
                        <tfoot>
                        <tr>
                            <td></td>
                            <td>Total Profit</td>
                            <td class="mdl-data-table__cell total">
                                $"""),_display_(/*47.35*/Utils/*47.40*/.currToString(Receipt.getTotalProfit(userReceipts.get(userReceipt)))),format.raw/*47.108*/("""
                            """),format.raw/*48.29*/("""</td>
                        </tr>
                        </tfoot>
                    </table>
                </div>

            """)))}),format.raw/*54.14*/("""

        """),format.raw/*56.9*/("""</div>
        <div class="demo-card-wide mdl-card mdl-shadow--2dp">
            <div class="mdl-card__title">
                <h3 class="mdl-card__title-text">Unsold Inventory</h3>
            </div>
            <div class="mdl-card--border">
                <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp items-table">
                    <thead>
                    <tr>
                        <th class="mdl-data-table__cell tiny">Item ID</th>
                        <th class="mdl-data-table__cell medium">Item Name</th>
                        <th class="mdl-data-table__cell tiny">Quantity</th>
                    </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*71.22*/for(item <- items) yield /*71.40*/ {_display_(Seq[Any](format.raw/*71.42*/("""
                    """),format.raw/*72.21*/("""<tr>
                        <td class="mdl-data-table__cell">
                            """),_display_(/*74.30*/item/*74.34*/.getId()),format.raw/*74.42*/("""
                        """),format.raw/*75.25*/("""</td>
                        <td class="mdl-data-table__cell">
                            """),_display_(/*77.30*/item/*77.34*/.getName()),format.raw/*77.44*/("""
                        """),format.raw/*78.25*/("""</td>
                        <td class="mdl-data-table__cell">
                            """),_display_(/*80.30*/item/*80.34*/.getQuantity()),format.raw/*80.48*/("""
                        """),format.raw/*81.25*/("""</td>
                    </tr>
                    """)))}),format.raw/*83.22*/("""
                    """),format.raw/*84.21*/("""</tbody>
                </table>
            </div>
        </div>
    """),format.raw/*88.16*/("""
"""),format.raw/*89.11*/("""
""")))}),format.raw/*90.2*/("""





"""))
      }
    }
  }

  def render(user:User,sale:Sale,receiptsssss:List[Receipt],items:List[Item],userReceipts:Map[User, List[Receipt]]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(receiptsssss)(items)(userReceipts)

  def f:((User) => (Sale) => (List[Receipt]) => (List[Item]) => (Map[User, List[Receipt]]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (receiptsssss) => (items) => (userReceipts) => apply(user)(sale)(receiptsssss)(items)(userReceipts)

  def ref: this.type = this

}


}

/**/
object report extends report_Scope0.report
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/report.scala.html
                  HASH: 98458cf8f2248ff709d7dd9ce450259871aa6664
                  MATRIX: 800->1|1008->113|1036->116|1100->172|1139->174|1170->179|1347->424|1378->429|1449->474|1463->480|1526->523|1604->575|1618->581|1680->623|1758->675|1772->681|1834->723|1866->769|1899->811|1935->820|2110->968|2123->972|2154->982|2220->1021|2280->1065|2320->1067|2365->1084|2432->1124|2452->1135|2485->1147|3084->1719|3145->1764|3185->1766|3238->1791|3365->1891|3381->1898|3410->1906|3467->1935|3595->2036|3611->2043|3642->2053|3699->2082|3828->2184|3842->2189|3897->2223|3954->2252|4046->2313|4099->2338|4386->2598|4400->2603|4490->2671|4547->2700|4713->2835|4750->2845|5501->3569|5535->3587|5575->3589|5624->3610|5743->3702|5756->3706|5785->3714|5838->3739|5958->3832|5971->3836|6002->3846|6055->3871|6175->3964|6188->3968|6223->3982|6276->4007|6360->4060|6409->4081|6509->4164|6538->4175|6570->4177
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|41->10|42->11|43->12|45->14|45->14|45->14|47->16|47->16|47->16|48->17|48->17|48->17|48->17|59->28|59->28|59->28|60->29|62->31|62->31|62->31|63->32|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|71->40|72->41|78->47|78->47|78->47|79->48|85->54|87->56|102->71|102->71|102->71|103->72|105->74|105->74|105->74|106->75|108->77|108->77|108->77|109->78|111->80|111->80|111->80|112->81|114->83|115->84|119->88|120->89|121->90
                  -- GENERATED --
              */
          