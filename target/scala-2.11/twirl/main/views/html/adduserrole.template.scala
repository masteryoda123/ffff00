
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adduserrole_Scope0 {
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

class adduserrole extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Sale,List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(allUsers: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""
"""),_display_(/*2.2*/main(title = "Add User Role to sale '" + sale.getName + "'")/*2.62*/ {_display_(Seq[Any](format.raw/*2.64*/("""

  """),format.raw/*4.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.48*/routes/*4.54*/.Assets.versioned("stylesheets/createsale.css")),format.raw/*4.101*/("""">

  <div class="demo-card-wide">
      <div class="mdl-card mdl-card--border mdl-shadow--2dp mdl-card__supporting-text">
        <form action=""""),_display_(/*8.24*/routes/*8.30*/.SalesController.addRole()),format.raw/*8.56*/("""" class="update-form" method="post">
          <ul style="list-style: none;">
            <li>
            <select name="username" id="username">
                  """),_display_(/*12.20*/for(allUser <- allUsers) yield /*12.44*/ {_display_(Seq[Any](format.raw/*12.46*/("""
                      """),format.raw/*13.23*/("""<option value=""""),_display_(/*13.39*/allUser/*13.46*/.getUserName),format.raw/*13.58*/("""">"""),_display_(/*13.61*/allUser/*13.68*/.getUserName()),format.raw/*13.82*/("""</option>
                  """)))}),format.raw/*14.20*/("""
            """),format.raw/*15.13*/("""</select>
            </li>
            <li>
            <select name="role" id="role">
                <option value="saleadmin">Sale Administrator</option>
                <option value="seller">Seller</option>
                <option value="cashier">Cashier</option>
                <option value="clerk">Clerk</option>
                <option value="bookkeeper">Bookkeeper</option>
            </select>
            </li>
          </ul>
            <input type="hidden" name="saleId" value=""""),_display_(/*27.56*/sale/*27.60*/.getId),format.raw/*27.66*/(""""></input>
            <button class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" type="submit">
                Add
            </button>
        </form>
    </div>
</div>

""")))}))
      }
    }
  }

  def render(user:User,sale:Sale,allUsers:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(allUsers)

  def f:((User) => (Sale) => (List[User]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (allUsers) => apply(user)(sale)(allUsers)

  def ref: this.type = this

}


}

/**/
object adduserrole extends adduserrole_Scope0.adduserrole
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/adduserrole.scala.html
                  HASH: 23b93e011a23586a00869170ed7e6f4fe6c68c38
                  MATRIX: 771->1|912->47|939->49|1007->109|1046->111|1076->115|1147->160|1161->166|1229->213|1401->359|1415->365|1461->391|1653->556|1693->580|1733->582|1784->605|1827->621|1843->628|1876->640|1906->643|1922->650|1957->664|2017->693|2058->706|2582->1203|2595->1207|2622->1213
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|39->8|39->8|39->8|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|46->15|58->27|58->27|58->27
                  -- GENERATED --
              */
          