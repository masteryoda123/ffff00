
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object alltags_Scope0 {
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

class alltags extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Sale,List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sale: Sale)(items: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""
"""),_display_(/*2.2*/for(item <- items) yield /*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""
    """),_display_(/*3.6*/tag(user = user)/*3.22*/(sale= sale)/*3.34*/(item = item)),format.raw/*3.47*/("""
""")))}))
      }
    }
  }

  def render(user:User,sale:Sale,items:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(user)(sale)(items)

  def f:((User) => (Sale) => (List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sale) => (items) => apply(user)(sale)(items)

  def ref: this.type = this

}


}

/**/
object alltags extends alltags_Scope0.alltags
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:52 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/alltags.scala.html
                  HASH: 2f9070c7a6bb6bbcec0eb7bb89eb014dbb9e0ee3
                  MATRIX: 763->1|901->44|928->46|961->64|1000->66|1031->72|1055->88|1075->100|1108->113
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3
                  -- GENERATED --
              */
          