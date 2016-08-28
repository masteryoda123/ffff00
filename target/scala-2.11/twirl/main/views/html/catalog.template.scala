
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object catalog_Scope0 {
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

class catalog extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,Sale,Role.RoleEnum,List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(role: Role.RoleEnum)(items: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""
"""),_display_(/*2.2*/main(title = "Catalog of Sale \"" + sale.getName() + "\"")/*2.60*/ {_display_(Seq[Any](format.raw/*2.62*/("""

    """),format.raw/*4.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/createsale.css")),format.raw/*4.103*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/table.css")),format.raw/*5.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("stylesheets/catalog.css")),format.raw/*6.100*/("""">

        <h4 class="mdl-color-text--grey-600">Catalog</h4>

        <div class="mdl-grid">
            """),_display_(/*11.14*/for(item <- items) yield /*11.32*/ {_display_(Seq[Any](format.raw/*11.34*/("""
                """),format.raw/*12.17*/("""<div class="mdl-cell mdl-cell--4-col">
                    """),_display_(/*13.22*/if(role.equals(Role.RoleEnum.saleAdmin)
                    || role.equals(Role.RoleEnum.seller))/*14.58*/ {_display_(Seq[Any](format.raw/*14.60*/("""
                        """),format.raw/*15.25*/("""<a href=""""),_display_(/*15.35*/routes/*15.41*/.CatalogController.renderModifyItemPage(sale.getId, item.getId)),format.raw/*15.104*/("""">
                    """)))}/*16.23*/else/*16.28*/{_display_(Seq[Any](format.raw/*16.29*/("""
                        """),format.raw/*17.25*/("""<a href="">
                    """)))}),format.raw/*18.22*/("""
                        """),format.raw/*19.25*/("""<div class="mdl-shadow--2dp">
                            <div class="mdl-grid">
                                <div class="mdl-cell--5-col mdl-card__left" style="background: url('"""),_display_(/*21.102*/routes/*21.108*/.Assets.versioned("data/" + item.getImageName)),format.raw/*21.154*/("""'); background-size: cover; background-repeat: no-repeat;">
                                    <h2 class="mdl-card__title-text item-name">"""),_display_(/*22.81*/item/*22.85*/.getName()),format.raw/*22.95*/("""</h2>
                                </div>
                                <div class="mdl-cell--5-col mdl-card__right">
                                    <h4>Price</h4>
                                    <p>$"""),_display_(/*26.42*/item/*26.46*/.getPrice()),format.raw/*26.57*/("""</p>
                                    <h4>Description</h4>
                                    <p>"""),_display_(/*28.41*/item/*28.45*/.getDescription()),format.raw/*28.62*/("""</p>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
            """)))}),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""</div>
        """),_display_(/*36.10*/if(role.equals(Role.RoleEnum.saleAdmin)
        || role.equals(Role.RoleEnum.seller))/*37.46*/ {_display_(Seq[Any](format.raw/*37.48*/("""
        """),format.raw/*38.9*/("""<a href=""""),_display_(/*38.19*/routes/*38.25*/.CatalogController.renderAddItemPage(sale.getId)),format.raw/*38.73*/("""" class="mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect mdl-button--colored mdl-color-text--white add-item">
            <i class="material-icons">add</i>
        </a>
        """)))}),format.raw/*41.10*/("""

        """),format.raw/*43.9*/("""<h4 class="mdl-color-text--grey-600">Inventory</h4>

        <div class="demo-card-wide">
            <div class="mdl-card--border">
                <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp sales-table">
                    <thead>
                        <tr>
                            <th class="mdl-data-table__cell--non-numeric">Item Name</th>
                            <th>Description</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            """),_display_(/*54.30*/if(role.equals(Role.RoleEnum.saleAdmin)
                            || role.equals(Role.RoleEnum.seller)
                            || role.equals(Role.RoleEnum.clerk))/*56.65*/ {_display_(Seq[Any](format.raw/*56.67*/("""
                                """),format.raw/*57.33*/("""<th>Item Tag</th>
                            """)))}),format.raw/*58.30*/("""
                        """),format.raw/*59.25*/("""</tr>
                    </thead>
                    <tbody>
                    """),_display_(/*62.22*/for(item <- items) yield /*62.40*/ {_display_(Seq[Any](format.raw/*62.42*/("""
                        """),format.raw/*63.25*/("""<tr class="item-row" >
                            <td class="mdl-data-table__cell--non-numeric">
                                """),_display_(/*65.34*/if(role.equals(Role.RoleEnum.saleAdmin)
                                || role.equals(Role.RoleEnum.seller))/*66.70*/ {_display_(Seq[Any](format.raw/*66.72*/("""
                                    """),format.raw/*67.37*/("""<a href=""""),_display_(/*67.47*/routes/*67.53*/.CatalogController.renderModifyItemPage(sale.getId, item.getId)),format.raw/*67.116*/("""">"""),_display_(/*67.119*/item/*67.123*/.getName()),format.raw/*67.133*/("""</a>
                                """)))}/*68.35*/else/*68.40*/{_display_(Seq[Any](format.raw/*68.41*/("""
                                    """),format.raw/*69.37*/("""<a href="">"""),_display_(/*69.49*/item/*69.53*/.getName()),format.raw/*69.63*/("""</a>
                                """)))}),format.raw/*70.34*/("""
                            """),format.raw/*71.29*/("""</td>
                            <td class="mdl-data-table__cell" onClick="window.location = $(this).parent().find('a').attr('href');">"""),_display_(/*72.132*/item/*72.136*/.getDescription()),format.raw/*72.153*/("""</td>
                            <td class="mdl-data-table__cell" onClick="window.location = $(this).parent().find('a').attr('href');">"""),_display_(/*73.132*/item/*73.136*/.getPrice()),format.raw/*73.147*/("""</td>
                            <td class="mdl-data-table__cell" onClick="window.location = $(this)
                            parent().find('a').attr('href');">"""),_display_(/*75.64*/item/*75.68*/.getQuantity()),format.raw/*75.82*/("""</td>
                            """),_display_(/*76.30*/if(role.equals(Role.RoleEnum.saleAdmin)
                            || role.equals(Role.RoleEnum.seller)
                            || role.equals(Role.RoleEnum.clerk))/*78.65*/ {_display_(Seq[Any](format.raw/*78.67*/("""
                                """),format.raw/*79.33*/("""<td class="mdl-data-table__cell"><a href=""""),_display_(/*79.76*/routes/*79.82*/.CatalogController.renderTag(sale.getId, item.getId)),format.raw/*79.134*/("""" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">TAG</a></td>
                            """)))}),format.raw/*80.30*/("""
                        """),format.raw/*81.25*/("""</tr>
                    """)))}),format.raw/*82.22*/("""
                    """),format.raw/*83.21*/("""</tbody>
                </table>
            </div>
        </div>
""")))}))
      }
    }
  }

  def render(user:User,sale:Sale,role:Role.RoleEnum,items:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(role)(items)

  def f:((User) => (Sale) => (Role.RoleEnum) => (List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (role) => (items) => apply(user)(sale)(role)(items)

  def ref: this.type = this

}


}

/**/
object catalog extends catalog_Scope0.catalog
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/catalog.scala.html
                  HASH: 25ded55005b88371b6d781a22f509f6156339355
                  MATRIX: 777->1|936->65|963->67|1029->125|1068->127|1100->133|1171->178|1185->184|1253->231|1331->283|1345->289|1407->331|1485->383|1499->389|1564->433|1698->540|1732->558|1772->560|1817->577|1904->637|2010->734|2050->736|2103->761|2140->771|2155->777|2240->840|2283->865|2296->870|2335->871|2388->896|2452->929|2505->954|2715->1136|2731->1142|2799->1188|2966->1328|2979->1332|3010->1342|3252->1557|3265->1561|3297->1572|3426->1674|3439->1678|3477->1695|3679->1866|3715->1875|3758->1891|3852->1976|3892->1978|3928->1987|3965->1997|3980->2003|4049->2051|4272->2243|4309->2253|4875->2792|5053->2961|5093->2963|5154->2996|5232->3043|5285->3068|5396->3152|5430->3170|5470->3172|5523->3197|5681->3328|5799->3437|5839->3439|5904->3476|5941->3486|5956->3492|6041->3555|6072->3558|6086->3562|6118->3572|6175->3611|6188->3616|6227->3617|6292->3654|6331->3666|6344->3670|6375->3680|6444->3718|6501->3747|6666->3884|6680->3888|6719->3905|6884->4042|6898->4046|6931->4057|7123->4222|7136->4226|7171->4240|7233->4275|7411->4444|7451->4446|7512->4479|7582->4522|7597->4528|7671->4580|7820->4698|7873->4723|7931->4750|7980->4771
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|46->15|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|50->19|52->21|52->21|52->21|53->22|53->22|53->22|57->26|57->26|57->26|59->28|59->28|59->28|65->34|66->35|67->36|68->37|68->37|69->38|69->38|69->38|69->38|72->41|74->43|85->54|87->56|87->56|88->57|89->58|90->59|93->62|93->62|93->62|94->63|96->65|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|102->71|103->72|103->72|103->72|104->73|104->73|104->73|106->75|106->75|106->75|107->76|109->78|109->78|110->79|110->79|110->79|110->79|111->80|112->81|113->82|114->83
                  -- GENERATED --
              */
          