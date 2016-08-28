
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object catalogreadonly_Scope0 {
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

class catalogreadonly extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Sale,List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(items: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""
"""),_display_(/*2.2*/main(title = "Catalog of Sale \"" + sale.getName() + "\"")/*2.60*/ {_display_(Seq[Any](format.raw/*2.62*/("""

    """),format.raw/*4.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/createsale.css")),format.raw/*4.103*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/table.css")),format.raw/*5.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("stylesheets/catalog.css")),format.raw/*6.100*/("""">

    <div class="mdl-grid">
        """),_display_(/*9.10*/for(item <- items) yield /*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
        """),format.raw/*10.9*/("""<div class="mdl-cell mdl-cell--6-col">
            <div class="mdl-shadow--2dp">
                <div class="mdl-grid">
                    <div class="mdl-cell--6-col mdl-card__left">
                        <h2 class="mdl-card__title-text">"""),_display_(/*14.59*/item/*14.63*/.getName()),format.raw/*14.73*/("""</h2>
                    </div>
                    <div class="mdl-cell--6-col mdl-card__right">
                        <h4>Price</h4>
                        <p>$"""),_display_(/*18.30*/item/*18.34*/.getPrice()),format.raw/*18.45*/("""</p>
                        <h4>Description</h4>
                        <p>"""),_display_(/*20.29*/item/*20.33*/.getDescription()),format.raw/*20.50*/("""</p>
                    </div>
                </div>
            </div>
        </div>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</div>

    """),_display_(/*28.6*/if(!sale.isOpen)/*28.22*/ {_display_(Seq[Any](format.raw/*28.24*/("""
        """),format.raw/*29.9*/("""<h4 class="mdl-color-text--grey-600">Unsold Items for closed sale """"),_display_(/*29.77*/sale/*29.81*/.getName),format.raw/*29.89*/("""":</h4>
        """),format.raw/*30.180*/("""
        """),format.raw/*31.9*/("""<a href="https://my.freecycle.org/home/posts" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
            DONATE
        </a>

        <div class="demo-card-wide">
            <div class="mdl-card--border">
                <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp sales-table">
                    <thead>
                        <tr>
                            <th class="mdl-data-table__cell--non-numeric">Item Name</th>
                            <th>Description</th>
                            """),format.raw/*42.47*/("""
                            """),format.raw/*43.29*/("""<th>Quantity</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*47.22*/for(item <- items) yield /*47.40*/ {_display_(Seq[Any](format.raw/*47.42*/("""
                        """),format.raw/*48.25*/("""<tr class="item-row" >
                            <td class="mdl-data-table__cell--non-numeric">
                            """),_display_(/*50.30*/item/*50.34*/.getName),format.raw/*50.42*/("""
                            """),format.raw/*51.29*/("""</td>
                            <td class="mdl-data-table__cell">"""),_display_(/*52.63*/item/*52.67*/.getDescription()),format.raw/*52.84*/("""</td>
                            """),format.raw/*53.87*/("""
                            """),format.raw/*54.29*/("""<td class="mdl-data-table__cell">"""),_display_(/*54.63*/item/*54.67*/.getQuantity()),format.raw/*54.81*/("""</td>
                        </tr>
                    """)))}),format.raw/*56.22*/("""
                    """),format.raw/*57.21*/("""</tbody>
                </table>
            </div>
        </div>
    """)))}),format.raw/*61.6*/("""
""")))}))
      }
    }
  }

  def render(user:User,sale:Sale,items:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(items)

  def f:((User) => (Sale) => (List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (items) => apply(user)(sale)(items)

  def ref: this.type = this

}


}

/**/
object catalogreadonly extends catalogreadonly_Scope0.catalogreadonly
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/catalogreadonly.scala.html
                  HASH: 6b4376786aeb5c2967c90be5db35365235f14b39
                  MATRIX: 779->1|917->44|944->46|1010->104|1049->106|1081->112|1152->157|1166->163|1234->210|1312->262|1326->268|1388->310|1466->362|1480->368|1545->412|1611->452|1644->470|1683->472|1719->481|1989->724|2002->728|2033->738|2227->905|2240->909|2272->920|2377->998|2390->1002|2428->1019|2557->1117|2589->1122|2628->1135|2653->1151|2693->1153|2729->1162|2824->1230|2837->1234|2866->1242|2911->1429|2947->1438|3525->2006|3582->2035|3735->2161|3769->2179|3809->2181|3862->2206|4016->2333|4029->2337|4058->2345|4115->2374|4210->2442|4223->2446|4261->2463|4323->2555|4380->2584|4441->2618|4454->2622|4489->2636|4577->2693|4626->2714|4729->2787
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|40->9|40->9|40->9|41->10|45->14|45->14|45->14|49->18|49->18|49->18|51->20|51->20|51->20|56->25|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|62->31|73->42|74->43|78->47|78->47|78->47|79->48|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|85->54|85->54|85->54|85->54|87->56|88->57|92->61
                  -- GENERATED --
              */
          