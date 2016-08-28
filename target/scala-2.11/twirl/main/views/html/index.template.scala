
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main(title = "Home")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*2.46*/routes/*2.52*/.Assets.versioned("stylesheets/salepage.css")),format.raw/*2.97*/("""">
    <h4 class="mdl-color-text--grey-600">My Sales</h4>
    <div class="mdl-grid">
        """),_display_(/*5.10*/for(sale <- SalesController.getUserSales) yield /*5.51*/ {_display_(Seq[Any](format.raw/*5.53*/("""
            """),_display_(/*6.14*/if(sale.getStatus() == "Open")/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
            """),format.raw/*7.13*/("""<div class="mdl-cell mdl-cell--3-col">
                <a href=""""),_display_(/*8.27*/routes/*8.33*/.CatalogController.renderCatalogPage(sale.getId)),format.raw/*8.81*/("""">
                    <div class="mdl-card mdl-shadow--2dp">
                        <div class="mdl-card__title mdl-card--expand">
                            <h2 class="mdl-card__title-text">"""),_display_(/*11.63*/sale/*11.67*/.getName()),format.raw/*11.77*/("""</h2>
                        </div>
                        <div class="mdl-card__actions mdl-card--border">
                            <h4>Role</h4>
                            <p>"""),_display_(/*15.33*/{ Role.fetchBySaleIdAndUserId(sale.getId, Utils.getUserSession.getId).get(0).getRole().toString }),format.raw/*15.130*/("""</p>
                            <h4>Location</h4>
                            <p>"""),_display_(/*17.33*/sale/*17.37*/.getLocation()),format.raw/*17.51*/("""</p>
                        </div>
                    </div>
                </a>
            </div>
            """)))}),format.raw/*22.14*/("""
        """)))}),format.raw/*23.10*/("""

        """),format.raw/*25.9*/("""<div class="mdl-cell mdl-cell--3-col">
            <a href=""""),_display_(/*26.23*/routes/*26.29*/.SalesController.createSalePage),format.raw/*26.60*/("""">
                <div class="mdl-card mdl-shadow--2dp create-page">

                </div>
            </a>
        </div>
    </div>

    <h4 class="mdl-color-text--grey-600">Browse All Sales</h4>

    <div class="mdl-grid">
        """),_display_(/*37.10*/for(sale <- Sale.fetchAllSales()) yield /*37.43*/ {_display_(Seq[Any](format.raw/*37.45*/("""
            """),_display_(/*38.14*/if(sale.getStatus() == "Open")/*38.44*/ {_display_(Seq[Any](format.raw/*38.46*/("""
            """),format.raw/*39.13*/("""<div class="mdl-cell mdl-cell--3-col">
                <a href=""""),_display_(/*40.27*/routes/*40.33*/.CatalogController.renderCatalogReadOnlyPage(sale.getId)),format.raw/*40.89*/("""">
                    <div class="mdl-card mdl-shadow--2dp">
                        <div class="mdl-card__title mdl-card--expand">
                            <h2 class="mdl-card__title-text">"""),_display_(/*43.63*/sale/*43.67*/.getName()),format.raw/*43.77*/("""</h2>
                        </div>
                        <div class="mdl-card__actions mdl-card--border">
                            <h4>Owners</h4>
                            <p>"""),_display_(/*47.33*/{CatalogController.printOwners(sale);}),format.raw/*47.71*/("""</p>
                            <h4>Location</h4>
                            <p>"""),_display_(/*49.33*/sale/*49.37*/.getLocation()),format.raw/*49.51*/("""</p>
                        </div>
                    </div>
                </a>
            </div>
            """)))}),format.raw/*54.14*/("""
        """)))}),format.raw/*55.10*/("""
    """),format.raw/*56.5*/("""</div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/index.scala.html
                  HASH: 79607be8208aecbd8559b65c8c2003bc074250b4
                  MATRIX: 827->1|855->21|894->23|921->24|992->69|1006->75|1071->120|1191->214|1247->255|1286->257|1326->271|1364->301|1403->303|1443->316|1534->381|1548->387|1616->435|1838->630|1851->634|1882->644|2093->828|2212->925|2322->1008|2335->1012|2370->1026|2517->1142|2558->1152|2595->1162|2683->1223|2698->1229|2750->1260|3015->1498|3064->1531|3104->1533|3145->1547|3184->1577|3224->1579|3265->1592|3357->1657|3372->1663|3449->1719|3671->1914|3684->1918|3715->1928|3928->2114|3987->2152|4097->2235|4110->2239|4145->2253|4292->2369|4333->2379|4365->2384
                  LINES: 32->1|32->1|32->1|33->2|33->2|33->2|33->2|36->5|36->5|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|42->11|42->11|42->11|46->15|46->15|48->17|48->17|48->17|53->22|54->23|56->25|57->26|57->26|57->26|68->37|68->37|68->37|69->38|69->38|69->38|70->39|71->40|71->40|71->40|74->43|74->43|74->43|78->47|78->47|80->49|80->49|80->49|85->54|86->55|87->56
                  -- GENERATED --
              */
          