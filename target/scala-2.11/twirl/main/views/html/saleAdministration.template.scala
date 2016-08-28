
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object saleAdministration_Scope0 {
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

class saleAdministration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[User],User,Sale,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[User], currUser: User, sale: Sale):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""
"""),_display_(/*2.2*/main(title = "Administration")/*2.32*/ {_display_(Seq[Any](format.raw/*2.34*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/administration.css")),format.raw/*3.103*/("""">
<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.versioned("javascripts/share.js")),format.raw/*4.62*/(""""></script>

<h4 class="mdl-color-text--grey-600">Manage Sale</h4>
<div class="mdl-grid">
    <div class="mdl-cell mdl-cell--3-col">
        <div class="manage">
            <i class="material-icons" role="presentation">thumb_up</i><br />
            <a href="#" id="share">Share</a>
        </div>
    </div>
    <div class="mdl-cell mdl-cell--3-col">
        <div class="manage">
            <i class="material-icons">group</i> <br />
            <a href=""""),_display_(/*17.23*/routes/*17.29*/.SalesController.renderAddUserRolePage(Utils.getSaleId)),format.raw/*17.84*/("""">Add Role</a>
        </div>
    </div>
    <div class="mdl-cell mdl-cell--3-col">
        <div class="manage">
            <i class="material-icons">create</i> <br />
            <a href="">Update Sale</a>
        </div>
    </div>
    <div class="mdl-cell mdl-cell--3-col">
        <div class="manage">
            <i class="material-icons">delete</i> <br />
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.SalesController.closeSale(Utils.getSaleId)),format.raw/*29.72*/("""">Close Sale</a>
        </div>
    </div>
</div>

<h4 class="mdl-color-text--grey-600">View Roles</h4>
<table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp user-table">
    <thead>
    <tr>
        <th class="mdl-data-table__cell--non-numeric">Username</th>
        <th class="mdl-data-table__cell--non-numeric">Name</th>
        <th class="mdl-data-table__cell--non-numeric">Account Type</th>
    </tr>
    </thead>
    <tbody>
    """),_display_(/*44.6*/for(index <- 0 until users.size) yield /*44.38*/ {_display_(Seq[Any](format.raw/*44.40*/("""
        """),format.raw/*45.9*/("""<tr>
            <td class="mdl-data-table__cell--non-numeric">"""),_display_(/*46.60*/users/*46.65*/.get(index).getUserName),format.raw/*46.88*/("""</td>
            <td class="mdl-data-table__cell--non-numeric">"""),_display_(/*47.60*/users/*47.65*/.get(index).getFirstName),format.raw/*47.89*/(""" """),_display_(/*47.91*/users/*47.96*/.get(index).getLastName),format.raw/*47.119*/("""</td>
            <td>"""),_display_(/*48.18*/Role/*48.22*/.fetchBySaleIdAndUserId(sale.getId, users.get(index).getId).get(0).getRole),format.raw/*48.96*/("""</td>
            </label></td>
        </tr>
    """)))}),format.raw/*51.6*/("""

    """),format.raw/*53.5*/("""</tbody>
</table>
""")))}))
      }
    }
  }

  def render(users:List[User],currUser:User,sale:Sale): play.twirl.api.HtmlFormat.Appendable = apply(users,currUser,sale)

  def f:((List[User],User,Sale) => play.twirl.api.HtmlFormat.Appendable) = (users,currUser,sale) => apply(users,currUser,sale)

  def ref: this.type = this

}


}

/**/
object saleAdministration extends saleAdministration_Scope0.saleAdministration
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/saleAdministration.scala.html
                  HASH: d4683645f0ee3f3426075f3051f7476aa8642090
                  MATRIX: 785->1|927->48|954->50|992->80|1031->82|1058->83|1129->128|1143->134|1215->185|1258->202|1272->208|1333->249|1819->708|1834->714|1910->769|2321->1153|2336->1159|2400->1202|2871->1647|2919->1679|2959->1681|2995->1690|3086->1754|3100->1759|3144->1782|3236->1847|3250->1852|3295->1876|3324->1878|3338->1883|3383->1906|3433->1929|3446->1933|3541->2007|3622->2058|3655->2064
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|48->17|48->17|48->17|60->29|60->29|60->29|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|82->51|84->53
                  -- GENERATED --
              */
          