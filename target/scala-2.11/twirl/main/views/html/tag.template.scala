
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tag_Scope0 {
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

class tag extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Sale,Item,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(item: Item):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
<link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.cyan-light_blue.min.css">
<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.versioned("stylesheets/tag.css")),format.raw/*4.92*/("""">
<script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.versioned("javascripts/jquery.qrcode.min.js")),format.raw/*6.74*/(""""></script>


<div class="mdl-card mdl-shadow--2dp">
    <div class="mdl-card__title mdl-card__expand">
        <h2 class="mdl-card__title-text">"""),_display_(/*11.43*/item/*11.47*/.getName()),format.raw/*11.57*/("""</h2>
    </div>
    <div class="mdl-card__supporting-text">
        <p>id: """),_display_(/*14.17*/item/*14.21*/.getId()),format.raw/*14.29*/("""</p>
        <p>Description: """),_display_(/*15.26*/item/*15.30*/.getDescription()),format.raw/*15.47*/("""</p>
        <p>Price: """),_display_(/*16.20*/item/*16.24*/.getPrice()),format.raw/*16.35*/("""</p>
        <div class="qrBox" id=""""),_display_(/*17.33*/item/*17.37*/.getId),format.raw/*17.43*/(""" """),_display_(/*17.45*/sale/*17.49*/.getId),format.raw/*17.55*/(""""></div>
    </div>

</div>

<script>
    $('.qrBox').each(function() """),format.raw/*23.33*/("""{"""),format.raw/*23.34*/("""
        """),format.raw/*24.9*/("""if($(this).children().length == 0) """),format.raw/*24.44*/("""{"""),format.raw/*24.45*/("""
                """),format.raw/*25.17*/("""var url = document.location.origin + '"""),_display_(/*25.56*/routes/*25.62*/.CatalogController.qrTransaction(sale.getId, item.getId, user.getUserName, user.getPassword)),format.raw/*25.154*/("""';
                $(this).qrcode(url);
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
    """),format.raw/*28.5*/("""}"""),format.raw/*28.6*/(""");
</script>"""))
      }
    }
  }

  def render(user:User,sale:Sale,item:Item): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(item)

  def f:((User) => (Sale) => (Item) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (item) => apply(user)(sale)(item)

  def ref: this.type = this

}


}

/**/
object tag extends tag_Scope0.tag
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/tag.scala.html
                  HASH: 3ac117e84358d7bbb4b3e24129c3adfe4dd98cd4
                  MATRIX: 749->1|880->37|907->38|1216->321|1230->327|1290->367|1495->546|1509->552|1582->605|1755->751|1768->755|1799->765|1903->842|1916->846|1945->854|2002->884|2015->888|2053->905|2104->929|2117->933|2149->944|2213->981|2226->985|2253->991|2282->993|2295->997|2322->1003|2420->1073|2449->1074|2485->1083|2548->1118|2577->1119|2622->1136|2688->1175|2703->1181|2817->1273|2892->1321|2921->1322|2953->1327|2981->1328
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|37->6|37->6|37->6|42->11|42->11|42->11|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|58->27|58->27|59->28|59->28
                  -- GENERATED --
              */
          