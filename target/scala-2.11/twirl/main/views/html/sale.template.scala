
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sale_Scope0 {
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

class sale extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,List[Sale],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sales: List[Sale]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),_display_(/*2.2*/main(title = "My Sales")/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""

    """),format.raw/*4.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/salepage.css")),format.raw/*4.101*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/table.css")),format.raw/*5.98*/("""">
    <script src=""""),_display_(/*6.19*/routes/*6.25*/.Assets.versioned("javascripts/table.js")),format.raw/*6.66*/(""""></script>

    <h4 class="mdl-color-text--grey-600">Current Sales</h4>

    <div class="mdl-grid">
        """),_display_(/*11.10*/for(sale <- sales) yield /*11.28*/ {_display_(Seq[Any](format.raw/*11.30*/("""
            """),_display_(/*12.14*/if(sale.getStatus() == "Open")/*12.44*/ {_display_(Seq[Any](format.raw/*12.46*/("""
                """),format.raw/*13.17*/("""<div class="mdl-cell mdl-cell--3-col">
                    <a href=""""),_display_(/*14.31*/routes/*14.37*/.CatalogController.renderCatalogPage(sale.getId)),format.raw/*14.85*/("""">
                        <div class="mdl-card mdl-shadow--2dp">
                            <div class="mdl-card__title mdl-card--expand">
                                <h2 class="mdl-card__title-text">"""),_display_(/*17.67*/sale/*17.71*/.getName()),format.raw/*17.81*/("""</h2>
                            </div>
                            <div class="mdl-card__actions mdl-card--border">
                                <h4>Role</h4>
                                <p>"""),_display_(/*21.37*/{ Role.fetchBySaleIdAndUserId(sale.getId, user.getId).get(0).getRole().toString }),format.raw/*21.118*/("""</p>
                                <h4>Location</h4>
                                <p>"""),_display_(/*23.37*/sale/*23.41*/.getLocation()),format.raw/*23.55*/("""</p>
                            </div>
                        </div>
                    </a>
                </div>
            """)))}),format.raw/*28.14*/("""
        """)))}),format.raw/*29.10*/("""

        """),format.raw/*31.9*/("""<div class="mdl-cell mdl-cell--3-col">
            <a href=""""),_display_(/*32.23*/routes/*32.29*/.SalesController.createSalePage),format.raw/*32.60*/("""">
                <div class="mdl-card mdl-shadow--2dp create-page">

                </div>
            </a>
        </div>
    </div>

    <h4 class="mdl-color-text--grey-600">All Sales</h4>

    <div class="demo-card-wide">
        <div class="mdl-card--border">
            <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp sales-table">
                <thead>
                    <tr>
                        <th class="mdl-data-table__cell--non-numeric">Sale Name</th>
                        <th>Location</th>
                        <th>Your Role</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*54.22*/for(sale <- sales) yield /*54.40*/ {_display_(Seq[Any](format.raw/*54.42*/("""
                            """),format.raw/*55.29*/("""<tr onclick="window.location = $(this).find('a').attr('href')">
                                <td class="mdl-data-table__cell--non-numeric">
                                    <a href=""""),_display_(/*57.47*/routes/*57.53*/.CatalogController.renderCatalogPage(sale.getId)),format.raw/*57.101*/("""">
                                        """),_display_(/*58.42*/sale/*58.46*/.getName()),format.raw/*58.56*/("""
                                    """),format.raw/*59.37*/("""</a>
                                </td>
                                <td>"""),_display_(/*61.38*/sale/*61.42*/.getLocation()),format.raw/*61.56*/("""</td>
                                <td>
                                    """),_display_(/*63.38*/{ Role.fetchBySaleIdAndUserId(sale.getId, user.getId).get(0).getRole().toString }),format.raw/*63.119*/("""
                                """),format.raw/*64.33*/("""</td>
                                <td>
                                    """),_display_(/*66.38*/sale/*66.42*/.getStatus),format.raw/*66.52*/("""
                                """),format.raw/*67.33*/("""</td>
                            </tr>
                    """)))}),format.raw/*69.22*/("""
                """),format.raw/*70.17*/("""</tbody>
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
object sale extends sale_Scope0.sale
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/sale.scala.html
                  HASH: 6fed78f07a5a95b4a9d3e16329a52d1cb4f31097
                  MATRIX: 752->1|878->32|905->34|937->58|976->60|1008->66|1079->111|1093->117|1159->162|1237->214|1251->220|1313->262|1360->283|1374->289|1435->330|1572->440|1606->458|1646->460|1687->474|1726->504|1766->506|1811->523|1907->592|1922->598|1991->646|2225->853|2238->857|2269->867|2496->1067|2599->1148|2717->1239|2730->1243|2765->1257|2928->1389|2969->1399|3006->1409|3094->1470|3109->1476|3161->1507|3926->2245|3960->2263|4000->2265|4057->2294|4273->2483|4288->2489|4358->2537|4429->2581|4442->2585|4473->2595|4538->2632|4645->2712|4658->2716|4693->2730|4800->2810|4903->2891|4964->2924|5071->3004|5084->3008|5115->3018|5176->3051|5268->3112|5313->3129
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|45->14|45->14|48->17|48->17|48->17|52->21|52->21|54->23|54->23|54->23|59->28|60->29|62->31|63->32|63->32|63->32|85->54|85->54|85->54|86->55|88->57|88->57|88->57|89->58|89->58|89->58|90->59|92->61|92->61|92->61|94->63|94->63|95->64|97->66|97->66|97->66|98->67|100->69|101->70
                  -- GENERATED --
              */
          