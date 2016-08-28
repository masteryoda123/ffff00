
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="CS2340 Project">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>FFFF00</title>

    <link rel="shortcut icon" href=""""),_display_(/*11.38*/routes/*11.44*/.Assets.versioned("images/favicon.png")),format.raw/*11.83*/("""">

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.cyan-light_blue.min.css">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.97*/("""">
    <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
    <script src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.versioned("javascripts/cards.js")),format.raw/*18.66*/(""""></script>
    <script>
      window.fbAsyncInit = function() """),format.raw/*20.39*/("""{"""),format.raw/*20.40*/("""
        """),format.raw/*21.9*/("""FB.init("""),format.raw/*21.17*/("""{"""),format.raw/*21.18*/("""
          """),format.raw/*22.11*/("""appId      : '1477097085641171',
          xfbml      : true,
          version    : 'v2.7'
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""");
      """),format.raw/*26.7*/("""}"""),format.raw/*26.8*/(""";

      (function(d, s, id) """),format.raw/*28.27*/("""{"""),format.raw/*28.28*/("""
	  """),format.raw/*29.4*/("""var js, fjs = d.getElementsByTagName(s)[0];
	  if (d.getElementById(id)) return;
	  js = d.createElement(s); js.id = id;
	  js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.5";
	  fjs.parentNode.insertBefore(js, fjs);
	"""),format.raw/*34.2*/("""}"""),format.raw/*34.3*/("""(document, 'script', 'facebook-jssdk'));
    </script>
    <script src="https://code.getmdl.io/1.1.3/material.min.js"></script>
  </head>
  <body>
    <div class="layout mdl-layout mdl-js-layout mdl-layout--fixed-drawer">
      <div class="header">
        <div class="mdl-layout--fixed-header-transparent">
          <div class="mdl-layout__header-row mdl-color-text--grey-600">
            <span class="mdl-layout-title">"""),_display_(/*43.45*/title),format.raw/*43.50*/("""</span>
            <div class="mdl-layout-spacer"></div>
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable">
              <label class="mdl-button mdl-js-button mdl-button--icon" for="search">
                <i class="material-icons">search</i>
              </label>
              <div class="mdl-textfield__expandable-holder">
                <input class="mdl-textfield__input" type="text" id="search">
                <label class="mdl-textfield__label" for="search">Enter your query...</label>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="drawer mdl-layout__drawer mdl-color-text--blue-grey-50">
        <header class="drawer-header">
          <img src=""""),_display_(/*60.22*/routes/*60.28*/.Assets.versioned("data/user/" + Utils.getUserSession.getImageName)),format.raw/*60.95*/("""" class="user">
          <div class="user-dropdown">
            <p class="user-text">Welcome """),_display_(/*62.43*/Utils/*62.48*/.getUsername),format.raw/*62.60*/("""!</p>
            <div class="mdl-layout-spacer"></div>
            <button id="accbtn" class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon user-text">
              <i class="material-icons" role="presentation">arrow_drop_down</i>
              <span class="visuallyhidden">Accounts</span>
            </button>
            <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect" for="accbtn">
              <li class="mdl-menu__item"><i class="material-icons">settings</i><a href=""""),_display_(/*69.90*/routes/*69.96*/.ProfileController.view()),format.raw/*69.121*/("""">Profile</a></li>
              <li class="mdl-menu__item"><i class="material-icons">cached</i><a href=""""),_display_(/*70.88*/routes/*70.94*/.SalesController.getSales()),format.raw/*70.121*/("""">Switch Sale</a></li>
              <li class="mdl-menu__item"><i class="material-icons">person</i><a href=""""),_display_(/*71.88*/routes/*71.94*/.Application.logout()),format.raw/*71.115*/("""">Logout</a></li>
            </ul>
          </div>
          """),_display_(/*74.12*/if(Utils.getSaleId != -1)/*74.37*/ {_display_(Seq[Any](format.raw/*74.39*/("""
            """),format.raw/*75.13*/("""<p class="current-sale">"""),_display_(/*75.38*/Utils/*75.43*/.getSaleName),format.raw/*75.55*/(""" """),format.raw/*75.56*/("""- """),_display_(/*75.59*/{ Role.fetchBySaleIdAndUserId(Utils.getSaleId(), Utils.getUserSession.getId).get(0).getRole().toString }),format.raw/*75.163*/("""</p>
          """)))}),format.raw/*76.12*/("""
        """),format.raw/*77.9*/("""</header>

        <nav class="navigation mdl-navigation mdl-color--white">
          <a class="mdl-navigation__link" href=""""),_display_(/*80.50*/routes/*80.56*/.Application.index()),format.raw/*80.76*/(""""><i class="material-icons" role="presentation">home</i>Home</a>
          <a class="mdl-navigation__link" href=""""),_display_(/*81.50*/routes/*81.56*/.Application.map()),format.raw/*81.74*/(""""><i class="material-icons" role="presentation">language</i>Map</a>
          """),_display_(/*82.12*/if(Utils.getSaleId != -1)/*82.37*/ {_display_(Seq[Any](format.raw/*82.39*/("""
            """),format.raw/*83.13*/("""<a class="mdl-navigation__link" href=""""),_display_(/*83.52*/routes/*83.58*/.CatalogController.renderCatalogPage(Utils.getSaleId)),format.raw/*83.111*/(""""><i class="material-icons" role="presentation">inbox</i>Catalog</a>
            """),_display_(/*84.14*/if(Role.fetchBySaleIdAndUserId(Utils.getSaleId(), Utils.getUserSession.getId).get(0).getRole().equals(Role.RoleEnum.saleAdmin))/*84.141*/ {_display_(Seq[Any](format.raw/*84.143*/("""
              """),format.raw/*85.15*/("""<a class="mdl-navigation__link" href=""""),_display_(/*85.54*/routes/*85.60*/.TransactionController.renderTransactionPage(Utils.getSaleId)),format.raw/*85.121*/(""""><i class="material-icons" role="presentation">shopping_cart</i>Transaction</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*86.54*/routes/*86.60*/.CatalogController.renderAllTags(Utils.getSaleId)),format.raw/*86.109*/(""""><i class="material-icons" role="presentation">local_offer</i>Print Tags</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*87.54*/routes/*87.60*/.CatalogController.renderReport(Utils.getSaleId)),format.raw/*87.108*/(""""><i class="material-icons" role="presentation">account_balance</i>Reports</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*88.54*/routes/*88.60*/.CatalogController.allReceipts(Utils.getSaleId)),format.raw/*88.107*/(""""><i class="material-icons" role="presentation">monetization_on</i>Receipts</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*89.54*/routes/*89.60*/.AdministrationController.saleAdministration(Utils.getSaleId)),format.raw/*89.121*/(""""><i class="material-icons" role="presentation">people</i>Administration</a>
            """)))}),format.raw/*90.14*/("""
            """),_display_(/*91.14*/if(Role.fetchBySaleIdAndUserId(Utils.getSaleId(), Utils.getUserSession.getId).get(0).getRole().equals(Role.RoleEnum.seller))/*91.138*/ {_display_(Seq[Any](format.raw/*91.140*/("""
              """),format.raw/*92.15*/("""<a class="mdl-navigation__link" href=""""),_display_(/*92.54*/routes/*92.60*/.TransactionController.renderTransactionPage(Utils.getSaleId)),format.raw/*92.121*/(""""><i class="material-icons" role="presentation">shopping_cart</i>Transaction</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*93.54*/routes/*93.60*/.CatalogController.renderAllTags(Utils.getSaleId)),format.raw/*93.109*/(""""><i class="material-icons" role="presentation">local_offer</i>Print Tags</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*94.54*/routes/*94.60*/.CatalogController.renderReport(Utils.getSaleId)),format.raw/*94.108*/(""""><i class="material-icons" role="presentation">account_balance</i>Reports</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*95.54*/routes/*95.60*/.CatalogController.allReceipts(Utils.getSaleId)),format.raw/*95.107*/(""""><i class="material-icons" role="presentation">monetization_on</i>Receipts</a>
            """)))}),format.raw/*96.14*/("""
            """),_display_(/*97.14*/if(Role.fetchBySaleIdAndUserId(Utils.getSaleId(), Utils.getUserSession.getId).get(0).getRole().equals(Role.RoleEnum.clerk))/*97.137*/ {_display_(Seq[Any](format.raw/*97.139*/("""
              """),format.raw/*98.15*/("""<a class="mdl-navigation__link" href=""""),_display_(/*98.54*/routes/*98.60*/.TransactionController.renderTransactionPage(Utils.getSaleId)),format.raw/*98.121*/(""""><i class="material-icons" role="presentation">shopping_cart</i>Transaction</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*99.54*/routes/*99.60*/.CatalogController.renderAllTags(Utils.getSaleId)),format.raw/*99.109*/(""""><i class="material-icons" role="presentation">local_offer</i>Print Tags</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*100.54*/routes/*100.60*/.CatalogController.renderReport(Utils.getSaleId)),format.raw/*100.108*/(""""><i class="material-icons" role="presentation">account_balance</i>Reports</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*101.54*/routes/*101.60*/.CatalogController.allReceipts(Utils.getSaleId)),format.raw/*101.107*/(""""><i class="material-icons" role="presentation">monetization_on</i>Receipts</a>
            """)))}),format.raw/*102.14*/("""
            """),_display_(/*103.14*/if(Role.fetchBySaleIdAndUserId(Utils.getSaleId(), Utils.getUserSession.getId).get(0).getRole().equals(Role.RoleEnum.cashier))/*103.139*/ {_display_(Seq[Any](format.raw/*103.141*/("""
              """),format.raw/*104.15*/("""<a class="mdl-navigation__link" href=""""),_display_(/*104.54*/routes/*104.60*/.TransactionController.renderTransactionPage(Utils.getSaleId)),format.raw/*104.121*/(""""><i class="material-icons" role="presentation">shopping_cart</i>Transaction</a>
              <a class="mdl-navigation__link" href=""""),_display_(/*105.54*/routes/*105.60*/.CatalogController.allReceipts(Utils.getSaleId)),format.raw/*105.107*/(""""><i class="material-icons" role="presentation">monetization_on</i>Receipts</a>
            """)))}),format.raw/*106.14*/("""
            """),_display_(/*107.14*/if(Role.fetchBySaleIdAndUserId(Utils.getSaleId(), Utils.getUserSession.getId).get(0).getRole().equals(Role.RoleEnum.bookkeeper))/*107.142*/ {_display_(Seq[Any](format.raw/*107.144*/("""
              """),format.raw/*108.15*/("""<a class="mdl-navigation__link" href=""""),_display_(/*108.54*/routes/*108.60*/.CatalogController.renderReport(Utils.getSaleId)),format.raw/*108.108*/(""""><i class="material-icons" role="presentation">account_balance</i>Reports</a>
            """)))}),format.raw/*109.14*/("""
          """)))}),format.raw/*110.12*/("""
        """),format.raw/*111.9*/("""</nav>
      </div>

      <main class="mdl-layout__content mdl-color--grey-50">
        <div class="content">
          """),_display_(/*116.12*/content),format.raw/*116.19*/("""
        """),format.raw/*117.9*/("""</div>

        <div class="mdl-layout-spacer"></div>

        <footer class="mdl-mini-footer">
          <div class="mdl-mini-footer__left-section">
            <ul class="mdl-mini-footer__link-list">
              <li><a href="#">Home</a></li>
              <li><a href="#">About</a></li>
              <li><a href="#">Contact</a></li>
              <li><a href="#">Privacy</a></li>
            </ul>
          </div>
          <div class="mdl-mini-footer__right-section">
            <div class="mdl-logo">Build - version 1.0.0</div>
          </div>
        </footer>
      </main>
    </div>
  </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/main.scala.html
                  HASH: 541a74d375038fd4577196695c9f6e83a3547897
                  MATRIX: 748->1|873->31|901->33|1252->357|1267->363|1327->402|1744->792|1759->798|1821->839|2029->1020|2044->1026|2106->1067|2197->1130|2226->1131|2262->1140|2298->1148|2327->1149|2366->1160|2493->1260|2522->1261|2558->1270|2586->1271|2643->1300|2672->1301|2703->1305|2965->1540|2993->1541|3444->1965|3470->1970|4251->2724|4266->2730|4354->2797|4477->2893|4491->2898|4524->2910|5074->3433|5089->3439|5136->3464|5269->3570|5284->3576|5333->3603|5470->3713|5485->3719|5528->3740|5619->3804|5653->3829|5693->3831|5734->3844|5786->3869|5800->3874|5833->3886|5862->3887|5892->3890|6018->3994|6065->4010|6101->4019|6253->4144|6268->4150|6309->4170|6450->4284|6465->4290|6504->4308|6610->4387|6644->4412|6684->4414|6725->4427|6791->4466|6806->4472|6881->4525|6990->4607|7127->4734|7168->4736|7211->4751|7277->4790|7292->4796|7375->4857|7536->4991|7551->4997|7622->5046|7780->5177|7795->5183|7865->5231|8024->5363|8039->5369|8108->5416|8268->5549|8283->5555|8366->5616|8487->5706|8528->5720|8662->5844|8703->5846|8746->5861|8812->5900|8827->5906|8910->5967|9071->6101|9086->6107|9157->6156|9315->6287|9330->6293|9400->6341|9559->6473|9574->6479|9643->6526|9767->6619|9808->6633|9941->6756|9982->6758|10025->6773|10091->6812|10106->6818|10189->6879|10350->7013|10365->7019|10436->7068|10595->7199|10611->7205|10682->7253|10842->7385|10858->7391|10928->7438|11053->7531|11095->7545|11231->7670|11273->7672|11317->7687|11384->7726|11400->7732|11484->7793|11646->7927|11662->7933|11732->7980|11857->8073|11899->8087|12038->8215|12080->8217|12124->8232|12191->8271|12207->8277|12278->8325|12402->8417|12446->8429|12483->8438|12633->8560|12662->8567|12699->8576
                  LINES: 27->1|32->1|34->3|42->11|42->11|42->11|47->16|47->16|47->16|49->18|49->18|49->18|51->20|51->20|52->21|52->21|52->21|53->22|56->25|56->25|57->26|57->26|59->28|59->28|60->29|65->34|65->34|74->43|74->43|91->60|91->60|91->60|93->62|93->62|93->62|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|106->75|107->76|108->77|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|122->91|122->91|122->91|123->92|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|127->96|128->97|128->97|128->97|129->98|129->98|129->98|129->98|130->99|130->99|130->99|131->100|131->100|131->100|132->101|132->101|132->101|133->102|134->103|134->103|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|137->106|138->107|138->107|138->107|139->108|139->108|139->108|139->108|140->109|141->110|142->111|147->116|147->116|148->117
                  -- GENERATED --
              */
          