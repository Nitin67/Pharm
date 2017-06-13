
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html data-ng-app="app" data-ng-controller="AppCtrl">
<head>
	<meta charset="UTF-8">
	<title>The Eventual PlayFramework-AngularJS-MongoDB Seed Project</title>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*12.47*/routes/*12.53*/.Assets.versioned("third/bootstrap/css/bootstrap.min.css")),format.raw/*12.111*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*13.47*/routes/*13.53*/.Assets.versioned("third/bootstrap/css/bootstrap-theme.min.css")),format.raw/*13.117*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*14.47*/routes/*14.53*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.94*/("""">
	<link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.52*/routes/*15.58*/.Assets.versioned("images/favicon.png")),format.raw/*15.97*/("""">
</head>
<body>
	<div role="main" class="container">
		<div class="row">
			<div class="span12">
				<h2>Pharma</h2>
				<!-- as the route changes, the AngularJS view will be dynamically rendered and populated -->
				<div data-ng-view></div>
			</div>
		</div>
	</div>
	
	
	<script src=""""),_display_(/*29.16*/routes/*29.22*/.Assets.versioned("third/jquery/jquery-1.11.2.min.js")),format.raw/*29.76*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*30.16*/routes/*30.22*/.Assets.versioned("third/bootstrap/js/bootstrap.min.js")),format.raw/*30.78*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*31.16*/routes/*31.22*/.Assets.versioned("third/angularjs/angular.min.js")),format.raw/*31.73*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*32.16*/routes/*32.22*/.Assets.versioned("third/angularjs/angular-resource.min.js")),format.raw/*32.82*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*33.16*/routes/*33.22*/.Assets.versioned("third/angularjs/angular-route.min.js")),format.raw/*33.79*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*34.16*/routes/*34.22*/.Assets.versioned("javascripts/main.js")),format.raw/*34.62*/("""" type="text/javascript"></script>
</body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 22:43:52 IST 2017
                  SOURCE: /Users/nitinmaheshwari/workspace/pharm-assignment/app/views/index.scala.html
                  HASH: 47ee6077333cbaf68062997f0b039eb6706ad680
                  MATRIX: 834->95|946->112|974->114|1222->335|1237->341|1317->399|1393->448|1408->454|1494->518|1570->567|1585->573|1647->614|1728->668|1743->674|1803->713|2121->1004|2136->1010|2211->1064|2288->1114|2303->1120|2380->1176|2457->1226|2472->1232|2544->1283|2621->1333|2636->1339|2717->1399|2794->1449|2809->1455|2887->1512|2964->1562|2979->1568|3040->1608
                  LINES: 30->5|35->5|37->7|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34
                  -- GENERATED --
              */
          