
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object additem_Scope0 {
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

class additem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Sale,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""
"""),_display_(/*2.2*/main(title = "Add Item")/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""

      """),format.raw/*4.7*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.52*/routes/*4.58*/.Assets.versioned("stylesheets/createsale.css")),format.raw/*4.105*/("""">

      <div class="demo-card-wide">
          <div class="mdl-card mdl-card--border mdl-shadow--2dp mdl-card__supporting-text">
            <form action=""""),_display_(/*8.28*/routes/*8.34*/.CatalogController.addItem),format.raw/*8.60*/("""" class="update-form" method="post">
              <ul>
                <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" type="text" name="name" id="item-name"/>
                    <label class="mdl-textfield__label" for="item-name">Item Name</label>
                </li>
                <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" type="text" name="description" id="item-description"/>
                    <label class="mdl-textfield__label" for="item-description">Description</label>
                </li>
                  <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                      <input class="mdl-textfield__input" type="text" name="price" id="item-price"/>
                      <label class="mdl-textfield__label" for="item-price">Price</label>
                  </li>
                  <li class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                      <input class="mdl-textfield__input" type="text" name="quantity" id="item-quantity"/>
                      <label class="mdl-textfield__label" for="item-quantity">Quantity</label>
                  </li>
                  <input type="hidden" value=""""),_display_(/*26.48*/sale/*26.52*/.getId),format.raw/*26.58*/("""" name="saleId" />
              </ul>
                <button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" type="submit">
                    Add Item
                </button>
                <a href="/catalog?saleId="""),_display_(/*31.43*/sale/*31.47*/.getId),format.raw/*31.53*/("""">
                    <button class="mdl-button mdl-button--colored mdl-color-text--red mdl-js-button mdl-js-ripple-effect" type="button">
                        Cancel
                    </button>
                </a>
                """),format.raw/*36.59*/("""
                    """),format.raw/*37.21*/("""<button id="suggest-price-button" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" type="button">
                        Suggest Price
                    </button>
                """),format.raw/*40.25*/("""
            """),format.raw/*41.13*/("""</form>
        </div>
    </div>

    <script>
        $(document).ready(function() """),format.raw/*46.38*/("""{"""),format.raw/*46.39*/("""
            """),format.raw/*47.13*/("""$("#suggest-price-button").hide();

            $("#item-name").keyup(function() """),format.raw/*49.46*/("""{"""),format.raw/*49.47*/("""
                """),format.raw/*50.17*/("""if ($("#item-name").val() != '') """),format.raw/*50.50*/("""{"""),format.raw/*50.51*/("""
                    """),format.raw/*51.21*/("""$('#suggest-price-button').show();
                """),format.raw/*52.17*/("""}"""),format.raw/*52.18*/(""" """),format.raw/*52.19*/("""else """),format.raw/*52.24*/("""{"""),format.raw/*52.25*/("""
                    """),format.raw/*53.21*/("""$('#suggest-price-button').hide();
                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/("""
            """),format.raw/*55.13*/("""}"""),format.raw/*55.14*/(""");

            $("#suggest-price-button").click(function() """),format.raw/*57.57*/("""{"""),format.raw/*57.58*/("""
                """),format.raw/*58.17*/("""var keyword = $("#item-name").val();
                window.location.href = "/suggestprice?keyword=" + encodeURIComponent(keyword) + "&saleId="""),_display_(/*59.107*/sale/*59.111*/.getId),format.raw/*59.117*/("""";
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/(""");
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""");
    </script>

""")))}))
      }
    }
  }

  def render(user:User,sale:Sale): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)

  def f:((User) => (Sale) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => apply(user)(sale)

  def ref: this.type = this

}


}

/**/
object additem extends additem_Scope0.additem
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/additem.scala.html
                  HASH: 1f037a31d518ace3ba93775a237937f265256a08
                  MATRIX: 752->1|871->25|898->27|930->51|969->53|1003->61|1074->106|1088->112|1156->159|1340->317|1354->323|1400->349|2775->1697|2788->1701|2815->1707|3091->1956|3104->1960|3131->1966|3397->2246|3446->2267|3681->2482|3722->2495|3835->2580|3864->2581|3905->2594|4014->2675|4043->2676|4088->2693|4149->2726|4178->2727|4227->2748|4306->2799|4335->2800|4364->2801|4397->2806|4426->2807|4475->2828|4554->2879|4583->2880|4624->2893|4653->2894|4741->2954|4770->2955|4815->2972|4986->3115|5000->3119|5028->3125|5071->3140|5100->3141|5138->3152|5167->3153
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|39->8|39->8|39->8|57->26|57->26|57->26|62->31|62->31|62->31|67->36|68->37|71->40|72->41|77->46|77->46|78->47|80->49|80->49|81->50|81->50|81->50|82->51|83->52|83->52|83->52|83->52|83->52|84->53|85->54|85->54|86->55|86->55|88->57|88->57|89->58|90->59|90->59|90->59|91->60|91->60|92->61|92->61
                  -- GENERATED --
              */
          