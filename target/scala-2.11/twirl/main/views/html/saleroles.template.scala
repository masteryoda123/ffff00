
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object saleroles_Scope0 {
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

class saleroles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[User,Sale,List[User],List[User],List[User],List[User],List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(saleadmins: List[User])(sellers: List[User])(cashiers: List[User])(clerks: List[User])(bookkeepers: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.138*/("""
"""),_display_(/*2.2*/main(title = "Roles for sales " + sale.getName())/*2.51*/ {_display_(Seq[Any](format.raw/*2.53*/("""

    """),format.raw/*4.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/style.css")),format.raw/*4.98*/("""">

    """),_display_(/*6.6*/if(saleadmins.contains(user))/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
        """),format.raw/*7.9*/("""<a href=""""),_display_(/*7.19*/routes/*7.25*/.SalesController.renderAddUserRolePage(sale.getId)),format.raw/*7.75*/("""" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect createsale-link">
            Add User
        </a>
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""<div class="demo-card-wide">
        <div class="mdl-card--border">
            <h5 class="list-header">Sale Administrators</h5>
            <ul class="demo-list-icon mdl-list">
                """),_display_(/*15.18*/for(saleadmin <- saleadmins) yield /*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/("""
                    """),format.raw/*16.21*/("""<li class="mdl-list__item">
                        <span class="mdl-list__item-primary-content">
                            <i class="material-icons mdl-list__item-icon">person</i>
                            """),_display_(/*19.30*/saleadmin/*19.39*/.getUserName),format.raw/*19.51*/("""
                        """),format.raw/*20.25*/("""</span>
                    </li>
                """)))}),format.raw/*22.18*/("""
            """),format.raw/*23.13*/("""</ul>

            <h5 class="list-header">Sellers</h5>
            <ul class="demo-list-icon mdl-list">
                """),_display_(/*27.18*/for(seller <- sellers) yield /*27.40*/ {_display_(Seq[Any](format.raw/*27.42*/("""
                    """),format.raw/*28.21*/("""<li class="mdl-list__item">
                        <span class="mdl-list__item-primary-content">
                            <i class="material-icons mdl-list__item-icon">person</i>
                            """),_display_(/*31.30*/seller/*31.36*/.getUserName),format.raw/*31.48*/("""
                        """),format.raw/*32.25*/("""</span>
                    </li>
                """)))}),format.raw/*34.18*/("""
            """),format.raw/*35.13*/("""</ul>

            <h5 class="list-header">Cashiers</h5>
            <ul class="demo-list-icon mdl-list">
                """),_display_(/*39.18*/for(cashier <- cashiers) yield /*39.42*/ {_display_(Seq[Any](format.raw/*39.44*/("""
                    """),format.raw/*40.21*/("""<li class="mdl-list__item">
                        <span class="mdl-list__item-primary-content">
                            <i class="material-icons mdl-list__item-icon">person</i>
                            """),_display_(/*43.30*/cashier/*43.37*/.getUserName()),format.raw/*43.51*/("""
                        """),format.raw/*44.25*/("""</span>
                    </li>
                """)))}),format.raw/*46.18*/("""
            """),format.raw/*47.13*/("""</ul>

            <h5 class="list-header">Clerks</h5>
            <ul class="demo-list-icon mdl-list">
                """),_display_(/*51.18*/for(clerk <- clerks) yield /*51.38*/ {_display_(Seq[Any](format.raw/*51.40*/("""
                    """),format.raw/*52.21*/("""<li class="mdl-list__item">
                        <span class="mdl-list__item-primary-content">
                            <i class="material-icons mdl-list__item-icon">person</i>
                            """),_display_(/*55.30*/clerk/*55.35*/.getUserName()),format.raw/*55.49*/("""
                        """),format.raw/*56.25*/("""</span>
                    </li>
                """)))}),format.raw/*58.18*/("""
            """),format.raw/*59.13*/("""</ul>

            <h5 class="list-header">Bookkeepers</h5>
            <ul class="demo-list-icon mdl-list">
                """),_display_(/*63.18*/for(bookkeeper <- bookkeepers) yield /*63.48*/ {_display_(Seq[Any](format.raw/*63.50*/("""
                    """),format.raw/*64.21*/("""<li class="mdl-list__item">
                        <span class="mdl-list__item-primary-content">
                            <i class="material-icons mdl-list__item-icon">person</i>
                            """),_display_(/*67.30*/bookkeeper/*67.40*/.getUserName()),format.raw/*67.54*/("""
                        """),format.raw/*68.25*/("""</span>
                    </li>
                """)))}),format.raw/*70.18*/("""
            """),format.raw/*71.13*/("""</ul>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(user:User,sale:Sale,saleadmins:List[User],sellers:List[User],cashiers:List[User],clerks:List[User],bookkeepers:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(saleadmins)(sellers)(cashiers)(clerks)(bookkeepers)

  def f:((User) => (Sale) => (List[User]) => (List[User]) => (List[User]) => (List[User]) => (List[User]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (saleadmins) => (sellers) => (cashiers) => (clerks) => (bookkeepers) => apply(user)(sale)(saleadmins)(sellers)(cashiers)(clerks)(bookkeepers)

  def ref: this.type = this

}


}

/**/
object saleroles extends saleroles_Scope0.saleroles
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/saleroles.scala.html
                  HASH: 15df2e8506cf82af4728e4d02d9771ab9abb8312
                  MATRIX: 811->1|1043->137|1070->139|1127->188|1166->190|1198->196|1269->241|1283->247|1345->289|1379->298|1416->327|1455->329|1490->338|1526->348|1540->354|1610->404|1772->536|1804->541|2026->736|2070->764|2110->766|2159->787|2398->999|2416->1008|2449->1020|2502->1045|2584->1096|2625->1109|2774->1231|2812->1253|2852->1255|2901->1276|3140->1488|3155->1494|3188->1506|3241->1531|3323->1582|3364->1595|3514->1718|3554->1742|3594->1744|3643->1765|3882->1977|3898->1984|3933->1998|3986->2023|4068->2074|4109->2087|4257->2208|4293->2228|4333->2230|4382->2251|4621->2463|4635->2468|4670->2482|4723->2507|4805->2558|4846->2571|4999->2697|5045->2727|5085->2729|5134->2750|5373->2962|5392->2972|5427->2986|5480->3011|5562->3062|5603->3075
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|41->10|42->11|46->15|46->15|46->15|47->16|50->19|50->19|50->19|51->20|53->22|54->23|58->27|58->27|58->27|59->28|62->31|62->31|62->31|63->32|65->34|66->35|70->39|70->39|70->39|71->40|74->43|74->43|74->43|75->44|77->46|78->47|82->51|82->51|82->51|83->52|86->55|86->55|86->55|87->56|89->58|90->59|94->63|94->63|94->63|95->64|98->67|98->67|98->67|99->68|101->70|102->71
                  -- GENERATED --
              */
          