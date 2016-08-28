
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object map_Scope0 {
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

class map extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main(title = "Nearby Sales")/*1.30*/ {_display_(Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*2.46*/routes/*2.52*/.Assets.versioned("stylesheets/map.css")),format.raw/*2.92*/("""">
<h4 class="mdl-color-text--grey-600">All Sales</h4>
<div class="mdl-grid">

    <div id="map"></div>
    <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCbiRcuawUFSYvYhvapCRqr5A-T6mKmRlA&libraries=places&callback=initMap">
    </script>
    <script>
        var pos;
        var currentSaleID;
        var currentSaleName;
        var activeInfoWindow;
        function initMap() """),format.raw/*15.28*/("""{"""),format.raw/*15.29*/("""
        """),format.raw/*16.9*/("""var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*16.71*/("""{"""),format.raw/*16.72*/("""
          """),format.raw/*17.11*/("""center: """),format.raw/*17.19*/("""{"""),format.raw/*17.20*/("""lat: -34.397, lng: 150.644"""),format.raw/*17.46*/("""}"""),format.raw/*17.47*/(""",
          zoom: 15
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/(""");
        var infoWindow = new google.maps.InfoWindow("""),format.raw/*20.53*/("""{"""),format.raw/*20.54*/("""map: map"""),format.raw/*20.62*/("""}"""),format.raw/*20.63*/(""");

        // Try HTML5 geolocation.
        if (navigator.geolocation) """),format.raw/*23.36*/("""{"""),format.raw/*23.37*/("""
          """),format.raw/*24.11*/("""navigator.geolocation.getCurrentPosition(function(position) """),format.raw/*24.71*/("""{"""),format.raw/*24.72*/("""
            """),format.raw/*25.13*/("""pos = """),format.raw/*25.19*/("""{"""),format.raw/*25.20*/("""
              """),format.raw/*26.15*/("""lat: position.coords.latitude,
              lng: position.coords.longitude
            """),format.raw/*28.13*/("""}"""),format.raw/*28.14*/(""";
            map.setCenter(pos);
            createSelfMarker(pos);
            """),_display_(/*31.14*/for(sale <- SalesController.getAllSales) yield /*31.54*/ {_display_(Seq[Any](format.raw/*31.56*/("""
            """),format.raw/*32.13*/("""console.log('"""),_display_(/*32.27*/sale/*32.31*/.getName),format.raw/*32.39*/("""');
            var id"""),_display_(/*33.20*/sale/*33.24*/.getId),format.raw/*33.30*/(""" """),format.raw/*33.31*/("""= """),_display_(/*33.34*/sale/*33.38*/.getId),format.raw/*33.44*/("""
            """),format.raw/*34.13*/("""var name"""),_display_(/*34.22*/sale/*34.26*/.getId),format.raw/*34.32*/(""" """),format.raw/*34.33*/("""= '"""),_display_(/*34.37*/sale/*34.41*/.getName),format.raw/*34.49*/("""'
            service.nearbySearch("""),format.raw/*35.34*/("""{"""),format.raw/*35.35*/("""
                """),format.raw/*36.17*/("""location: pos,
                radius: 5000,
                keyword: '"""),_display_(/*38.28*/sale/*38.32*/.getLocation),format.raw/*38.44*/("""'
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/(""",function(results, status) """),format.raw/*39.41*/("""{"""),format.raw/*39.42*/("""
                """),format.raw/*40.17*/("""callback(results, status, id"""),_display_(/*40.46*/sale/*40.50*/.getId),format.raw/*40.56*/(""", name"""),_display_(/*40.63*/sale/*40.67*/.getId),format.raw/*40.73*/(""");
            """),format.raw/*41.13*/("""}"""),format.raw/*41.14*/(""");
        """)))}),format.raw/*42.10*/("""
          """),format.raw/*43.11*/("""}"""),format.raw/*43.12*/(""", function() """),format.raw/*43.25*/("""{"""),format.raw/*43.26*/("""
            """),format.raw/*44.13*/("""handleLocationError(true, infoWindow, map.getCenter());
          """),format.raw/*45.11*/("""}"""),format.raw/*45.12*/(""");
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/(""" """),format.raw/*46.11*/("""else """),format.raw/*46.16*/("""{"""),format.raw/*46.17*/("""
          """),format.raw/*47.11*/("""// Browser doesn't support Geolocation
          handleLocationError(false, infoWindow, map.getCenter());
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""

        """),format.raw/*51.9*/("""var service = new google.maps.places.PlacesService(map);


        function callback(results, status, id, name) """),format.raw/*54.54*/("""{"""),format.raw/*54.55*/("""
            """),format.raw/*55.13*/("""console.log(results);
            if (status === google.maps.places.PlacesServiceStatus.OK) """),format.raw/*56.71*/("""{"""),format.raw/*56.72*/("""
                """),format.raw/*57.17*/("""createSaleMarker(results[0], id, name);
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""

        """),format.raw/*61.9*/("""function createSaleMarker(place, id, name) """),format.raw/*61.52*/("""{"""),format.raw/*61.53*/("""
            """),format.raw/*62.13*/("""var placeLoc = place.geometry.location;
            var marker = new google.maps.Marker("""),format.raw/*63.49*/("""{"""),format.raw/*63.50*/("""
              """),format.raw/*64.15*/("""map: map,
              position: place.geometry.location
            """),format.raw/*66.13*/("""}"""),format.raw/*66.14*/(""");

            google.maps.event.addListener(marker, 'mouseover', function(event) """),format.raw/*68.80*/("""{"""),format.raw/*68.81*/("""
                """),format.raw/*69.17*/("""if (activeInfoWindow != null) activeInfoWindow.close();
                infoWindow.open(map, marker);
                infoWindow.setContent(name);
            """),format.raw/*72.13*/("""}"""),format.raw/*72.14*/(""");

            google.maps.event.addListener(marker, 'click', function() """),format.raw/*74.71*/("""{"""),format.raw/*74.72*/("""
              """),format.raw/*75.15*/("""window.location.replace('/viewcatalog?saleId=' + id)
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/(""");
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/("""

        """),format.raw/*79.9*/("""function createSelfMarker(loc) """),format.raw/*79.40*/("""{"""),format.raw/*79.41*/("""
            """),format.raw/*80.13*/("""var marker = new google.maps.Marker("""),format.raw/*80.49*/("""{"""),format.raw/*80.50*/("""
                """),format.raw/*81.17*/("""map: map,
                position: loc
            """),format.raw/*83.13*/("""}"""),format.raw/*83.14*/(""");

            google.maps.event.addListener(marker, 'mouseover', function(event) """),format.raw/*85.80*/("""{"""),format.raw/*85.81*/("""
                """),format.raw/*86.17*/("""if (activeInfoWindow != null) activeInfoWindow.close();
                infoWindow.open(map, marker);
                infoWindow.setContent('You Are Here');
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/(""");
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
      """),format.raw/*91.7*/("""}"""),format.raw/*91.8*/("""

      """),format.raw/*93.7*/("""function handleLocationError(browserHasGeolocation, infoWindow, pos) """),format.raw/*93.76*/("""{"""),format.raw/*93.77*/("""
        """),format.raw/*94.9*/("""infoWindow.setPosition(pos);
        infoWindow.setContent(browserHasGeolocation ?
                              'Error: The Geolocation service failed.' :
                              'Error: Your browser doesn\'t support geolocation.');
      """),format.raw/*98.7*/("""}"""),format.raw/*98.8*/("""
    """),format.raw/*99.5*/("""</script>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object map extends map_Scope0.map
              /*
                  -- GENERATED --
                  DATE: Sun Jul 24 22:35:53 EDT 2016
                  SOURCE: /Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/app/views/map.scala.html
                  HASH: 2a5459aa7dac86239c4dcde343f832d1865f12f5
                  MATRIX: 823->1|859->29|898->31|925->32|996->77|1010->83|1070->123|1520->545|1549->546|1585->555|1675->617|1704->618|1743->629|1779->637|1808->638|1862->664|1891->665|1947->694|1976->695|2059->750|2088->751|2124->759|2153->760|2254->833|2283->834|2322->845|2410->905|2439->906|2480->919|2514->925|2543->926|2586->941|2702->1029|2731->1030|2840->1112|2896->1152|2936->1154|2977->1167|3018->1181|3031->1185|3060->1193|3110->1216|3123->1220|3150->1226|3179->1227|3209->1230|3222->1234|3249->1240|3290->1253|3326->1262|3339->1266|3366->1272|3395->1273|3426->1277|3439->1281|3468->1289|3531->1324|3560->1325|3605->1342|3704->1414|3717->1418|3750->1430|3792->1444|3821->1445|3876->1472|3905->1473|3950->1490|4006->1519|4019->1523|4046->1529|4080->1536|4093->1540|4120->1546|4163->1561|4192->1562|4235->1574|4274->1585|4303->1586|4344->1599|4373->1600|4414->1613|4508->1679|4537->1680|4575->1691|4604->1692|4633->1693|4666->1698|4695->1699|4734->1710|4875->1824|4904->1825|4941->1835|5081->1947|5110->1948|5151->1961|5271->2053|5300->2054|5345->2071|5425->2123|5454->2124|5490->2133|5519->2134|5556->2144|5627->2187|5656->2188|5697->2201|5813->2289|5842->2290|5885->2305|5983->2375|6012->2376|6123->2459|6152->2460|6197->2477|6384->2636|6413->2637|6515->2711|6544->2712|6587->2727|6680->2792|6709->2793|6747->2804|6776->2805|6813->2815|6872->2846|6901->2847|6942->2860|7006->2896|7035->2897|7080->2914|7160->2966|7189->2967|7300->3050|7329->3051|7374->3068|7571->3237|7600->3238|7638->3249|7667->3250|7701->3257|7729->3258|7764->3266|7861->3335|7890->3336|7926->3345|8199->3591|8227->3592|8259->3597
                  LINES: 32->1|32->1|32->1|33->2|33->2|33->2|33->2|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|50->19|50->19|51->20|51->20|51->20|51->20|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|59->28|59->28|62->31|62->31|62->31|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|67->36|69->38|69->38|69->38|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|72->41|73->42|74->43|74->43|74->43|74->43|75->44|76->45|76->45|77->46|77->46|77->46|77->46|77->46|78->47|80->49|80->49|82->51|85->54|85->54|86->55|87->56|87->56|88->57|89->58|89->58|90->59|90->59|92->61|92->61|92->61|93->62|94->63|94->63|95->64|97->66|97->66|99->68|99->68|100->69|103->72|103->72|105->74|105->74|106->75|107->76|107->76|108->77|108->77|110->79|110->79|110->79|111->80|111->80|111->80|112->81|114->83|114->83|116->85|116->85|117->86|120->89|120->89|121->90|121->90|122->91|122->91|124->93|124->93|124->93|125->94|129->98|129->98|130->99
                  -- GENERATED --
              */
          