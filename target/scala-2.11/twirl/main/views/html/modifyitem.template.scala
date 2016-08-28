
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modifyitem_Scope0 {
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

     object modifyitem_Scope1 {
import helper._

class modifyitem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Sale,Item,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(sale: Sale)(item: Item):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.38*/("""
"""),_display_(/*3.2*/main(title = "Modify Item")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""


      """),format.raw/*6.7*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.52*/routes/*6.58*/.Assets.versioned("stylesheets/createsale.css")),format.raw/*6.105*/("""">

      <div class="demo-card-wide">
          <div class="mdl-card mdl-card--border mdl-shadow--2dp mdl-card__supporting-text">
                <img src=""""),_display_(/*10.28*/routes/*10.34*/.Assets.versioned("data/" + item.getImageName)),format.raw/*10.80*/("""">
          </div>
          <div class="mdl-card mdl-card--border mdl-shadow--2dp mdl-card__supporting-text">
              <button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" id="uploadPhoto">
                  Upload Photo
                  </button>
                  """),_display_(/*16.20*/form(action = routes.Utils.upload, 'enctype -> "multipart/form-data", 'id -> "pictureForm")/*16.111*/ {_display_(Seq[Any](format.raw/*16.113*/("""

                  """),format.raw/*18.19*/("""<div style='height: 0px;width: 0px; overflow:hidden;'><input id="picupload" type="file" name="picture"></div>
                  <input type="hidden" value=""""),_display_(/*19.48*/item/*19.52*/.getId),format.raw/*19.58*/("""" name="itemId">
                  <input type="hidden" value=""""),_display_(/*20.48*/sale/*20.52*/.getId),format.raw/*20.58*/("""" name="saleId">
                  <div style='height: 0px;width: 0px; overflow:hidden;'><input type="submit"></div>

                  """)))}),format.raw/*23.20*/("""
              """),format.raw/*24.15*/("""<script>
                $('#uploadPhoto').click(
                    function(e) """),format.raw/*26.33*/("""{"""),format.raw/*26.34*/("""
                        """),format.raw/*27.25*/("""e.stopImmediatePropagation();
                        $('#picupload').click();
                    """),format.raw/*29.21*/("""}"""),format.raw/*29.22*/("""
                """),format.raw/*30.17*/(""");
                $('#picupload').click(function(e) """),format.raw/*31.51*/("""{"""),format.raw/*31.52*/("""
                    """),format.raw/*32.21*/("""e.stopImmediatePropagation();
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/(""");
                $('#picupload').change( function() """),format.raw/*34.52*/("""{"""),format.raw/*34.53*/("""
                    """),format.raw/*35.21*/("""$('#pictureForm').submit();
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/(""");
              </script>
            <form action=""""),_display_(/*38.28*/routes/*38.34*/.CatalogController.modifyItem),format.raw/*38.63*/("""" class="update-form" method="post">
              <ul>
                <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" type="text" name="name" id="item-name" value=""""),_display_(/*41.104*/item/*41.108*/.getName),format.raw/*41.116*/("""" />
                    <label class="mdl-textfield__label" for="item-name">Item Name</label>
                </li>
                <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" type="text" name="description" id="item-description" value=""""),_display_(/*45.118*/item/*45.122*/.getDescription),format.raw/*45.137*/("""" />
                    <label class="mdl-textfield__label" for="item-description">Description</label>
                </li>
                  <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                      <input class="mdl-textfield__input" type="text" name="price" id="item-price" value=""""),_display_(/*49.108*/item/*49.112*/.getPrice),format.raw/*49.121*/(""""/>
                      <label class="mdl-textfield__label" for="item-price">Price</label>
                  </li>
                  <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                      <input class="mdl-textfield__input" type="text" name="minimumPrice" id="item-min-price" value=""""),_display_(/*53.119*/item/*53.123*/.getMinimumPrice),format.raw/*53.139*/(""""/>
                      <label class="mdl-textfield__label" for="item-min-price">Minimum Price</label>
                  </li>
                  <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                      <input class="mdl-textfield__input" type="text" name="quantity" id="item-quantity" value=""""),_display_(/*57.114*/item/*57.118*/.getQuantity),format.raw/*57.130*/(""""/>
                      <label class="mdl-textfield__label" for="item-quantity">Quantity</label>
                  </li>
                  <input type="hidden" value=""""),_display_(/*60.48*/sale/*60.52*/.getId),format.raw/*60.58*/("""" name="saleId" />
                  <input type="hidden" value=""""),_display_(/*61.48*/item/*61.52*/.getId),format.raw/*61.58*/("""" name="itemId" />
              </ul>
                <button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" type="submit">
                    Update Item
                </button>
                <a href=""""),_display_(/*66.27*/routes/*66.33*/.CatalogController.renderCatalogPage(sale.getId)),format.raw/*66.81*/("""">
                    <button class="mdl-button mdl-button--colored mdl-color-text--red mdl-js-button mdl-js-ripple-effect" type="button">
                        Cancel
                    </button>
                </a>
            </form>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(user:User,sale:Sale,item:Item): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(item)

  def f:((User) => (Sale) => (Item) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (item) => apply(user)(sale)(item)

  def ref: this.type = this

}


}
}

/**/
object modifyitem extends modifyitem_Scope0.modifyitem_Scope1.modifyitem
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/modifyitem.scala.html
                  HASH: 104d8961f96a84e6024e2626495dc9b796475341
                  MATRIX: 812->18|943->54|970->56|1005->83|1044->85|1079->94|1150->139|1164->145|1232->192|1417->350|1432->356|1499->402|1830->706|1931->797|1972->799|2020->819|2204->976|2217->980|2244->986|2335->1050|2348->1054|2375->1060|2543->1197|2586->1212|2696->1294|2725->1295|2778->1320|2905->1419|2934->1420|2979->1437|3060->1490|3089->1491|3138->1512|3212->1558|3241->1559|3323->1613|3352->1614|3401->1635|3473->1679|3502->1680|3583->1734|3598->1740|3648->1769|3925->2018|3939->2022|3969->2030|4321->2354|4335->2358|4372->2373|4725->2698|4739->2702|4770->2711|5125->3038|5139->3042|5177->3058|5539->3392|5553->3396|5587->3408|5784->3578|5797->3582|5824->3588|5917->3654|5930->3658|5957->3664|6220->3900|6235->3906|6304->3954
                  LINES: 30->2|35->2|36->3|36->3|36->3|39->6|39->6|39->6|39->6|43->10|43->10|43->10|49->16|49->16|49->16|51->18|52->19|52->19|52->19|53->20|53->20|53->20|56->23|57->24|59->26|59->26|60->27|62->29|62->29|63->30|64->31|64->31|65->32|66->33|66->33|67->34|67->34|68->35|69->36|69->36|71->38|71->38|71->38|74->41|74->41|74->41|78->45|78->45|78->45|82->49|82->49|82->49|86->53|86->53|86->53|90->57|90->57|90->57|93->60|93->60|93->60|94->61|94->61|94->61|99->66|99->66|99->66
                  -- GENERATED --
              */
          