
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
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

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[org.models.Doctor,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*6.2*/(message: org.models.Doctor):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.30*/("""

"""),format.raw/*8.1*/("""<html lang="en">
    <body>
        """),format.raw/*11.32*/("""
        """),_display_(/*12.10*/message/*12.17*/.getName()),format.raw/*12.27*/("""
        
    """),format.raw/*14.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(message:org.models.Doctor): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((org.models.Doctor) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 22:43:52 IST 2017
                  SOURCE: /Users/nitinmaheshwari/workspace/pharm-assignment/app/views/test.scala.html
                  HASH: 00eb831a03715a50079b0314078bec982d60d9ae
                  MATRIX: 843->96|966->124|994->126|1058->252|1095->262|1111->269|1142->279|1183->293
                  LINES: 30->6|35->6|37->8|39->11|40->12|40->12|40->12|42->14
                  -- GENERATED --
              */
          