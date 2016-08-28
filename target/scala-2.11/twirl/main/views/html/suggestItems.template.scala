
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object suggestItems_Scope0 {
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

class suggestItems extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[User,List[Map[String, String]],Sale,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(items: List[Map[String, String]])(sale: Sale)(suggestedPrice: String)(keyword: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.101*/("""
"""),_display_(/*2.2*/main(title = "Suggested Pricing")/*2.35*/ {_display_(Seq[Any](format.raw/*2.37*/("""

    """),format.raw/*4.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/salepage.css")),format.raw/*4.101*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/table.css")),format.raw/*5.98*/("""">
    <script src=""""),_display_(/*6.19*/routes/*6.25*/.Assets.versioned("javascripts/table.js")),format.raw/*6.66*/(""""></script>

    <h4 class="mdl-color-text--grey-600">Suggested Price: <strong>$"""),_display_(/*8.69*/suggestedPrice),format.raw/*8.83*/("""</strong></h4>

    """),format.raw/*10.31*/("""


        """),format.raw/*13.51*/("""
            """),format.raw/*14.66*/("""
                """),format.raw/*15.71*/("""

                """),format.raw/*17.27*/("""
            """),format.raw/*18.21*/("""
        """),format.raw/*19.19*/("""
    """),format.raw/*20.15*/("""

    """),format.raw/*22.5*/("""<h4 class="mdl-color-text--grey-600">Similar Items on eBay for item: """"),_display_(/*22.76*/keyword),format.raw/*22.83*/(""""</h4>
    <img src=""""),_display_(/*23.16*/routes/*23.22*/.Assets.versioned("images/ebay.png")),format.raw/*23.58*/("""">
    <a href=""""),_display_(/*24.15*/routes/*24.21*/.CatalogController.renderAddItemPage(sale.getId)),format.raw/*24.69*/("""" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">Back to Add Item</a></td>

    <div class="demo-card-wide">
        <div class="mdl-card--border">
            <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp sales-table">
                <thead>
                    <tr>
                        <th class="mdl-data-table__cell--non-numeric">Item Name</th>
                        <th class="mdl-data-table__cell--non-numeric">Price</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*36.22*/for(item <- items) yield /*36.40*/ {_display_(Seq[Any](format.raw/*36.42*/("""
                        """),format.raw/*37.25*/("""<tr>
                            <td class="mdl-data-table__cell--non-numeric">
                                """),_display_(/*39.34*/item/*39.38*/.get("title")),format.raw/*39.51*/("""
                            """),format.raw/*40.29*/("""</td>
                            <td class="mdl-data-table__cell--non-numeric">
                                """),_display_(/*42.34*/item/*42.38*/.get("price")),format.raw/*42.51*/("""
                            """),format.raw/*43.29*/("""</td>
                        </tr>
                          """),format.raw/*45.94*/("""
                                """),format.raw/*46.83*/("""
                                    """),format.raw/*47.107*/("""
                                        """),format.raw/*48.59*/("""
                                    """),format.raw/*49.45*/("""
                                """),format.raw/*50.42*/("""
                                """),format.raw/*51.65*/("""
                                """),format.raw/*52.41*/("""
                                    """),format.raw/*53.122*/("""
                                """),format.raw/*54.42*/("""
                                """),format.raw/*55.41*/("""
                                    """),format.raw/*56.55*/("""
                                """),format.raw/*57.42*/("""
                            """),format.raw/*58.38*/("""
                    """)))}),format.raw/*59.22*/("""
                    """),format.raw/*60.45*/("""
                            """),format.raw/*61.96*/("""
                                """),format.raw/*62.83*/("""
                                    """),format.raw/*63.107*/("""
                                        """),format.raw/*64.59*/("""
                                    """),format.raw/*65.45*/("""
                                """),format.raw/*66.42*/("""
                                """),format.raw/*67.65*/("""
                                """),format.raw/*68.41*/("""
                                    """),format.raw/*69.122*/("""
                                """),format.raw/*70.42*/("""
                                """),format.raw/*71.41*/("""
                                    """),format.raw/*72.55*/("""
                                """),format.raw/*73.42*/("""
                            """),format.raw/*74.38*/("""
                    """),format.raw/*75.26*/("""
                """),format.raw/*76.17*/("""</tbody>
            </table>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(user:User,items:List[Map[String, String]],sale:Sale,suggestedPrice:String,keyword:String): play.twirl.api.HtmlFormat.Appendable = apply(user)(items)(sale)(suggestedPrice)(keyword)

  def f:((User) => (List[Map[String, String]]) => (Sale) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (user) => (items) => (sale) => (suggestedPrice) => (keyword) => apply(user)(items)(sale)(suggestedPrice)(keyword)

  def ref: this.type = this

}


}

/**/
object suggestItems extends suggestItems_Scope0.suggestItems
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/suggestItems.scala.html
                  HASH: e237be2a17f30246a8943d5be5c0d5fc619eb7e9
                  MATRIX: 802->1|997->100|1024->102|1065->135|1104->137|1136->143|1207->188|1221->194|1287->239|1365->291|1379->297|1441->339|1488->360|1502->366|1563->407|1670->488|1704->502|1752->548|1791->601|1832->667|1877->738|1923->766|1964->787|2001->806|2034->821|2067->827|2165->898|2193->905|2242->927|2257->933|2314->969|2358->986|2373->992|2442->1040|3044->1615|3078->1633|3118->1635|3171->1660|3311->1773|3324->1777|3358->1790|3415->1819|3556->1933|3569->1937|3603->1950|3660->1979|3750->2108|3811->2191|3877->2298|3946->2357|4011->2402|4072->2444|4133->2509|4194->2550|4260->2672|4321->2714|4382->2755|4447->2810|4508->2852|4565->2890|4618->2912|4667->2957|4724->3053|4785->3136|4851->3243|4920->3302|4985->3347|5046->3389|5107->3454|5168->3495|5234->3617|5295->3659|5356->3700|5421->3755|5482->3797|5539->3835|5588->3861|5633->3878
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->8|39->8|41->10|44->13|45->14|46->15|48->17|49->18|50->19|51->20|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|73->42|73->42|73->42|74->43|76->45|77->46|78->47|79->48|80->49|81->50|82->51|83->52|84->53|85->54|86->55|87->56|88->57|89->58|90->59|91->60|92->61|93->62|94->63|95->64|96->65|97->66|98->67|99->68|100->69|101->70|102->71|103->72|104->73|105->74|106->75|107->76
                  -- GENERATED --
              */
          