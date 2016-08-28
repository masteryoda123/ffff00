
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object transaction_Scope0 {
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

class transaction extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,Sale,List[Transaction],List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(transactions: List[Transaction])(items: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""
"""),_display_(/*2.2*/main(title = "Transaction")/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/transaction.css")),format.raw/*3.100*/("""">

<div class="mdl-grid">
    <div class="mdl-cell mdl-cell--8-col register">
        <h2>Register</h2>
        <div class="mdl-grid">
            """),_display_(/*9.14*/for(item <- items) yield /*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
            """),format.raw/*10.13*/("""<div class="mdl-cell mdl-cell--3-col">
                <a id=""""),_display_(/*11.25*/item/*11.29*/.getId),format.raw/*11.35*/("""">
                    <div class="mdl-card mdl-shadow--2dp">
                        <div class="mdl-card__title" style="background: url('"""),_display_(/*13.79*/routes/*13.85*/.Assets.versioned("data/" + item.getImageName)),format.raw/*13.131*/("""'); background-size: contain; background-repeat: no-repeat;">
                            <p id="name"""),_display_(/*14.41*/item/*14.45*/.getId),format.raw/*14.51*/("""">"""),_display_(/*14.54*/item/*14.58*/.getName),format.raw/*14.66*/("""</p>
                            <p id="price"""),_display_(/*15.42*/item/*15.46*/.getId),format.raw/*15.52*/("""">$"""),_display_(/*15.56*/item/*15.60*/.getPrice),format.raw/*15.69*/("""</p>
                            <p display="hidden" id="minimum"""),_display_(/*16.61*/item/*16.65*/.getId),format.raw/*16.71*/("""">"""),_display_(/*16.74*/item/*16.78*/.getMinimumPrice),format.raw/*16.94*/("""</p>
                        </div>
                    </div>
                </a>
            </div>
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""</div>
    </div>

    <div class="mdl-cell mdl-cell--4-col cart mdl-shadow--2dp">
        <h2>Cart</h2>
        <div class="mdl-grid">
            <div class="mdl-cell mdl-cell--8-col">
                <ul class="transactions">

                </ul>
            </div>
            <div class="mdl-cell mdl-cell--4-col">
                <ul class="price">

                </ul>
            </div>
        </div>

        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label emailReceipts">
            <input class="mdl-textfield__input" type="text" id="email">
            <label class="mdl-textfield__label" for="email">Email for Receipt</label>
        </div>
        <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent mdl-color-text--white confirm-button">
            Confirm
        </button>
    </div>
</div>

<dialog class="mdl-dialog">
    <h4 class="mdl-dialog__title">Transaction Details</h4>
    <div class="mdl-dialog__content">
        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label textfield">
            <input class="mdl-textfield__input" type="text" id="buyerName">
            <label class="mdl-textfield__label" for="buyerName">Buyer Name</label>
        </div>
        <h6>Quantity</h6>
        <input id="quantity" class="mdl-slider mdl-js-slider" type="range"
               min="0" max="10" value="1" tabindex="0" step="1">
        <h6>Method of Payment</h6>
        <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="option-1">
            <input type="radio" id="option-1" class="mdl-radio__button" name="payment" value="cash" checked>
            <span class="mdl-radio__label">Cash</span>
        </label>
        <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="option-2">
            <input type="radio" id="option-2" class="mdl-radio__button" name="payment" value="check">
            <span class="mdl-radio__label">Check</span>
        </label>
        <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="option-3">
            <input type="radio" id="option-3" class="mdl-radio__button" name="payment" value="credit">
            <span class="mdl-radio__label">Credit</span>
        </label>
        <br />
        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label textfield">
            <input class="mdl-textfield__input" type="number" step="0.01" id="priceAdjust">
            <label class="mdl-textfield__label" for="priceAdjust">Price Adjustment</label>
        </div>
    </div>
    <div class="mdl-dialog__actions">
        <button type="button" class="mdl-button submit">Confirm</button>
    </div>
</dialog>

<script src=""""),_display_(/*84.15*/routes/*84.21*/.Assets.versioned("javascripts/transaction.js")),format.raw/*84.68*/(""""></script>
    """),_display_(/*85.6*/for(item <- items) yield /*85.24*/ {_display_(Seq[Any](format.raw/*85.26*/("""
        """),format.raw/*86.9*/("""<script>
            bindAddItem("""),_display_(/*87.26*/item/*87.30*/.getId),format.raw/*87.36*/(""");
        </script>
    """)))}),format.raw/*89.6*/("""
"""),format.raw/*90.1*/("""<script>
    $('.confirm-button').click(function () """),format.raw/*91.44*/("""{"""),format.raw/*91.45*/("""
    """),format.raw/*92.5*/("""if (transArray.length == 0) """),format.raw/*92.33*/("""{"""),format.raw/*92.34*/("""
        """),format.raw/*93.9*/("""alert('No transactions were added.');
    """),format.raw/*94.5*/("""}"""),format.raw/*94.6*/(""" """),format.raw/*94.7*/("""else """),format.raw/*94.12*/("""{"""),format.raw/*94.13*/("""
        """),format.raw/*95.9*/("""transArray.unshift("""),format.raw/*95.28*/("""{"""),format.raw/*95.29*/(""""email": $('#email').val().toString()"""),format.raw/*95.66*/("""}"""),format.raw/*95.67*/(""");
        transArray.unshift("""),format.raw/*96.28*/("""{"""),format.raw/*96.29*/(""""saleId": """),_display_(/*96.40*/sale/*96.44*/.getId),format.raw/*96.50*/("""}"""),format.raw/*96.51*/(""");
        $.ajax("""),format.raw/*97.16*/("""{"""),format.raw/*97.17*/("""
            """),format.raw/*98.13*/("""url: '"""),_display_(/*98.20*/routes/*98.26*/.CatalogController.makeTransaction()),format.raw/*98.62*/("""',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(transArray),
            success: function () """),format.raw/*102.34*/("""{"""),format.raw/*102.35*/("""
            """),format.raw/*103.13*/("""}"""),format.raw/*103.14*/("""
        """),format.raw/*104.9*/("""}"""),format.raw/*104.10*/(""");
        alert("Transaction has been made!");
        location.reload();
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/("""
"""),format.raw/*108.1*/("""}"""),format.raw/*108.2*/(""");
</script>
""")))}))
      }
    }
  }

  def render(user:User,sale:Sale,transactions:List[Transaction],items:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(transactions)(items)

  def f:((User) => (Sale) => (List[Transaction]) => (List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (transactions) => (items) => apply(user)(sale)(transactions)(items)

  def ref: this.type = this

}


}

/**/
object transaction extends transaction_Scope0.transaction
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/transaction.scala.html
                  HASH: 741a1987ec32d8b37e0581282b02e38dc21ae9df
                  MATRIX: 789->1|960->77|987->79|1022->106|1061->108|1088->109|1159->154|1173->160|1242->208|1417->357|1450->375|1489->377|1530->390|1620->453|1633->457|1660->463|1827->603|1842->609|1910->655|2039->757|2052->761|2079->767|2109->770|2122->774|2151->782|2224->828|2237->832|2264->838|2295->842|2308->846|2338->855|2430->920|2443->924|2470->930|2500->933|2513->937|2550->953|2697->1069|2733->1078|5487->3805|5502->3811|5570->3858|5613->3875|5647->3893|5687->3895|5723->3904|5784->3938|5797->3942|5824->3948|5880->3974|5908->3975|5988->4027|6017->4028|6049->4033|6105->4061|6134->4062|6170->4071|6239->4113|6267->4114|6295->4115|6328->4120|6357->4121|6393->4130|6440->4149|6469->4150|6534->4187|6563->4188|6621->4218|6650->4219|6688->4230|6701->4234|6728->4240|6757->4241|6803->4259|6832->4260|6873->4273|6907->4280|6922->4286|6979->4322|7161->4475|7191->4476|7233->4489|7263->4490|7300->4499|7330->4500|7437->4579|7466->4580|7495->4581|7524->4582
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|40->9|40->9|40->9|41->10|42->11|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|52->21|53->22|115->84|115->84|115->84|116->85|116->85|116->85|117->86|118->87|118->87|118->87|120->89|121->90|122->91|122->91|123->92|123->92|123->92|124->93|125->94|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|127->96|127->96|128->97|128->97|129->98|129->98|129->98|129->98|133->102|133->102|134->103|134->103|135->104|135->104|138->107|138->107|139->108|139->108
                  -- GENERATED --
              */
          