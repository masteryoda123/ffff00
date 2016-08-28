
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/conf/routes
// @DATE:Sun Jul 24 22:35:51 EDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_9: controllers.Application,
  // @LINE:8
  LoginController_8: controllers.LoginController,
  // @LINE:12
  Utils_4: controllers.Utils,
  // @LINE:23
  Assets_7: controllers.Assets,
  // @LINE:29
  ProfileController_5: controllers.ProfileController,
  // @LINE:34
  SalesController_6: controllers.SalesController,
  // @LINE:51
  CatalogController_2: controllers.CatalogController,
  // @LINE:77
  TransactionController_0: controllers.TransactionController,
  // @LINE:80
  AdministrationController_1: controllers.AdministrationController,
  // @LINE:90
  PriceSuggestionController_3: controllers.PriceSuggestionController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_9: controllers.Application,
    // @LINE:8
    LoginController_8: controllers.LoginController,
    // @LINE:12
    Utils_4: controllers.Utils,
    // @LINE:23
    Assets_7: controllers.Assets,
    // @LINE:29
    ProfileController_5: controllers.ProfileController,
    // @LINE:34
    SalesController_6: controllers.SalesController,
    // @LINE:51
    CatalogController_2: controllers.CatalogController,
    // @LINE:77
    TransactionController_0: controllers.TransactionController,
    // @LINE:80
    AdministrationController_1: controllers.AdministrationController,
    // @LINE:90
    PriceSuggestionController_3: controllers.PriceSuggestionController
  ) = this(errorHandler, Application_9, LoginController_8, Utils_4, Assets_7, ProfileController_5, SalesController_6, CatalogController_2, TransactionController_0, AdministrationController_1, PriceSuggestionController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_9, LoginController_8, Utils_4, Assets_7, ProfileController_5, SalesController_6, CatalogController_2, TransactionController_0, AdministrationController_1, PriceSuggestionController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.home"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginAttempt""", """controllers.LoginController.loginAttempt"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.LoginController.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Utils.upload"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadProfile""", """controllers.Utils.uploadProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index.html""", """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """map""", """controllers.Application.map"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateprofile""", """controllers.ProfileController.updateProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale""", """controllers.SalesController.getSales"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allsales""", """controllers.SalesController.allSales"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createsale""", """controllers.SalesController.createSalePage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createsale""", """controllers.SalesController.createSale"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saleroles""", """controllers.SalesController.renderSaleRolesPage(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserrole""", """controllers.SalesController.renderAddUserRolePage(saleId:Int ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserrole""", """controllers.SalesController.addRole"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """closesale""", """controllers.SalesController.closeSale(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catalog""", """controllers.CatalogController.renderCatalogPage(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewcatalog""", """controllers.CatalogController.renderCatalogReadOnlyPage(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """additem""", """controllers.CatalogController.renderAddItemPage(saleId:Int ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """additem""", """controllers.CatalogController.addItem"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modifyitem""", """controllers.CatalogController.renderModifyItemPage(saleId:Int ?= 0, itemId:Int ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modifyitem""", """controllers.CatalogController.modifyItem"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gentag""", """controllers.CatalogController.renderTag(saleId:Int ?= 0, itemId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alltags""", """controllers.CatalogController.renderAllTags(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """qrTransaction""", """controllers.CatalogController.qrTransaction(saleId:Int ?= 0, itemId:Int ?= 0, username:String ?= "", password:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """makeTransaction""", """controllers.CatalogController.makeTransaction"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """genreceipt""", """controllers.CatalogController.renderReceipt(transactionId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """genreport""", """controllers.CatalogController.renderReport(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allreceipts""", """controllers.CatalogController.allReceipts(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transaction""", """controllers.TransactionController.renderTransactionPage(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """administration""", """controllers.AdministrationController.administration()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saleAdministration""", """controllers.AdministrationController.saleAdministration(saleId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lock""", """controllers.AdministrationController.lock(userId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unlock""", """controllers.AdministrationController.unlock(userId:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createsuperuser""", """controllers.Utils.createSuperUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestprice""", """controllers.PriceSuggestionController.suggestPrice(keyword:String ?= "", saleId:Int ?= 0)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_home0_invoker = createInvoker(
    Application_9.home,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "home",
      Nil,
      "GET",
      """Index Route""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LoginController_loginAttempt1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginAttempt")))
  )
  private[this] lazy val controllers_LoginController_loginAttempt1_invoker = createInvoker(
    LoginController_8.loginAttempt,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginAttempt",
      Nil,
      "POST",
      """""",
      this.prefix + """loginAttempt"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_register2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_LoginController_register2_invoker = createInvoker(
    LoginController_8.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Utils_upload3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Utils_upload3_invoker = createInvoker(
    Utils_4.upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Utils",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Utils_uploadProfile4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadProfile")))
  )
  private[this] lazy val controllers_Utils_uploadProfile4_invoker = createInvoker(
    Utils_4.uploadProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Utils",
      "uploadProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """uploadProfile"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index.html")))
  )
  private[this] lazy val controllers_Application_index5_invoker = createInvoker(
    Application_9.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """Home Route""",
      this.prefix + """index.html"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_map6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("map")))
  )
  private[this] lazy val controllers_Application_map6_invoker = createInvoker(
    Application_9.map,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "map",
      Nil,
      "GET",
      """Map Route""",
      this.prefix + """map"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_logout8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout8_invoker = createInvoker(
    Application_9.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """Logout Route""",
      this.prefix + """logout"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ProfileController_view9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_view9_invoker = createInvoker(
    ProfileController_5.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "view",
      Nil,
      "GET",
      """Profile Route""",
      this.prefix + """profile"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ProfileController_updateProfile10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateprofile")))
  )
  private[this] lazy val controllers_ProfileController_updateProfile10_invoker = createInvoker(
    ProfileController_5.updateProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "updateProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """updateprofile"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_SalesController_getSales11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale")))
  )
  private[this] lazy val controllers_SalesController_getSales11_invoker = createInvoker(
    SalesController_6.getSales,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalesController",
      "getSales",
      Nil,
      "GET",
      """Sale Route""",
      this.prefix + """sale"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_SalesController_allSales12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allsales")))
  )
  private[this] lazy val controllers_SalesController_allSales12_invoker = createInvoker(
    SalesController_6.allSales,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalesController",
      "allSales",
      Nil,
      "GET",
      """""",
      this.prefix + """allsales"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_SalesController_createSalePage13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createsale")))
  )
  private[this] lazy val controllers_SalesController_createSalePage13_invoker = createInvoker(
    SalesController_6.createSalePage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalesController",
      "createSalePage",
      Nil,
      "GET",
      """""",
      this.prefix + """createsale"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_SalesController_createSale14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createsale")))
  )
  private[this] lazy val controllers_SalesController_createSale14_invoker = createInvoker(
    SalesController_6.createSale,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalesController",
      "createSale",
      Nil,
      "POST",
      """""",
      this.prefix + """createsale"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_SalesController_renderSaleRolesPage15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saleroles")))
  )
  private[this] lazy val controllers_SalesController_renderSaleRolesPage15_invoker = createInvoker(
    SalesController_6.renderSaleRolesPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalesController",
      "renderSaleRolesPage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """saleroles"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_SalesController_renderAddUserRolePage16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserrole")))
  )
  private[this] lazy val controllers_SalesController_renderAddUserRolePage16_invoker = createInvoker(
    SalesController_6.renderAddUserRolePage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalesController",
      "renderAddUserRolePage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """adduserrole"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_SalesController_addRole17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserrole")))
  )
  private[this] lazy val controllers_SalesController_addRole17_invoker = createInvoker(
    SalesController_6.addRole,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalesController",
      "addRole",
      Nil,
      "POST",
      """""",
      this.prefix + """adduserrole"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_SalesController_closeSale18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("closesale")))
  )
  private[this] lazy val controllers_SalesController_closeSale18_invoker = createInvoker(
    SalesController_6.closeSale(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalesController",
      "closeSale",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """closesale"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_CatalogController_renderCatalogPage19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catalog")))
  )
  private[this] lazy val controllers_CatalogController_renderCatalogPage19_invoker = createInvoker(
    CatalogController_2.renderCatalogPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "renderCatalogPage",
      Seq(classOf[Int]),
      "GET",
      """Catalog Routes""",
      this.prefix + """catalog"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_CatalogController_renderCatalogReadOnlyPage20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewcatalog")))
  )
  private[this] lazy val controllers_CatalogController_renderCatalogReadOnlyPage20_invoker = createInvoker(
    CatalogController_2.renderCatalogReadOnlyPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "renderCatalogReadOnlyPage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """viewcatalog"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_CatalogController_renderAddItemPage21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("additem")))
  )
  private[this] lazy val controllers_CatalogController_renderAddItemPage21_invoker = createInvoker(
    CatalogController_2.renderAddItemPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "renderAddItemPage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """additem"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_CatalogController_addItem22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("additem")))
  )
  private[this] lazy val controllers_CatalogController_addItem22_invoker = createInvoker(
    CatalogController_2.addItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "addItem",
      Nil,
      "POST",
      """""",
      this.prefix + """additem"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_CatalogController_renderModifyItemPage23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modifyitem")))
  )
  private[this] lazy val controllers_CatalogController_renderModifyItemPage23_invoker = createInvoker(
    CatalogController_2.renderModifyItemPage(fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "renderModifyItemPage",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      """""",
      this.prefix + """modifyitem"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_CatalogController_modifyItem24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modifyitem")))
  )
  private[this] lazy val controllers_CatalogController_modifyItem24_invoker = createInvoker(
    CatalogController_2.modifyItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "modifyItem",
      Nil,
      "POST",
      """""",
      this.prefix + """modifyitem"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_CatalogController_renderTag25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gentag")))
  )
  private[this] lazy val controllers_CatalogController_renderTag25_invoker = createInvoker(
    CatalogController_2.renderTag(fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "renderTag",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      """""",
      this.prefix + """gentag"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_CatalogController_renderAllTags26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alltags")))
  )
  private[this] lazy val controllers_CatalogController_renderAllTags26_invoker = createInvoker(
    CatalogController_2.renderAllTags(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "renderAllTags",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """alltags"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_CatalogController_qrTransaction27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("qrTransaction")))
  )
  private[this] lazy val controllers_CatalogController_qrTransaction27_invoker = createInvoker(
    CatalogController_2.qrTransaction(fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "qrTransaction",
      Seq(classOf[Int], classOf[Int], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """qrTransaction"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_CatalogController_makeTransaction28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("makeTransaction")))
  )
  private[this] lazy val controllers_CatalogController_makeTransaction28_invoker = createInvoker(
    CatalogController_2.makeTransaction,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "makeTransaction",
      Nil,
      "POST",
      """""",
      this.prefix + """makeTransaction"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_CatalogController_renderReceipt29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("genreceipt")))
  )
  private[this] lazy val controllers_CatalogController_renderReceipt29_invoker = createInvoker(
    CatalogController_2.renderReceipt(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "renderReceipt",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """genreceipt"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_CatalogController_renderReport30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("genreport")))
  )
  private[this] lazy val controllers_CatalogController_renderReport30_invoker = createInvoker(
    CatalogController_2.renderReport(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "renderReport",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """genreport"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_CatalogController_allReceipts31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allreceipts")))
  )
  private[this] lazy val controllers_CatalogController_allReceipts31_invoker = createInvoker(
    CatalogController_2.allReceipts(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CatalogController",
      "allReceipts",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """allreceipts"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_TransactionController_renderTransactionPage32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transaction")))
  )
  private[this] lazy val controllers_TransactionController_renderTransactionPage32_invoker = createInvoker(
    TransactionController_0.renderTransactionPage(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "renderTransactionPage",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """transaction"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_AdministrationController_administration33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("administration")))
  )
  private[this] lazy val controllers_AdministrationController_administration33_invoker = createInvoker(
    AdministrationController_1.administration(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministrationController",
      "administration",
      Nil,
      "GET",
      """Administration Routes""",
      this.prefix + """administration"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_AdministrationController_saleAdministration34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saleAdministration")))
  )
  private[this] lazy val controllers_AdministrationController_saleAdministration34_invoker = createInvoker(
    AdministrationController_1.saleAdministration(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministrationController",
      "saleAdministration",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """saleAdministration"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_AdministrationController_lock35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lock")))
  )
  private[this] lazy val controllers_AdministrationController_lock35_invoker = createInvoker(
    AdministrationController_1.lock(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministrationController",
      "lock",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """lock"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_AdministrationController_unlock36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unlock")))
  )
  private[this] lazy val controllers_AdministrationController_unlock36_invoker = createInvoker(
    AdministrationController_1.unlock(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministrationController",
      "unlock",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """unlock"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_Utils_createSuperUser37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createsuperuser")))
  )
  private[this] lazy val controllers_Utils_createSuperUser37_invoker = createInvoker(
    Utils_4.createSuperUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Utils",
      "createSuperUser",
      Nil,
      "GET",
      """""",
      this.prefix + """createsuperuser"""
    )
  )

  // @LINE:90
  private[this] lazy val controllers_PriceSuggestionController_suggestPrice38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestprice")))
  )
  private[this] lazy val controllers_PriceSuggestionController_suggestPrice38_invoker = createInvoker(
    PriceSuggestionController_3.suggestPrice(fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PriceSuggestionController",
      "suggestPrice",
      Seq(classOf[String], classOf[Int]),
      "GET",
      """""",
      this.prefix + """suggestprice"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_home0_route(params) =>
      call { 
        controllers_Application_home0_invoker.call(Application_9.home)
      }
  
    // @LINE:8
    case controllers_LoginController_loginAttempt1_route(params) =>
      call { 
        controllers_LoginController_loginAttempt1_invoker.call(LoginController_8.loginAttempt)
      }
  
    // @LINE:10
    case controllers_LoginController_register2_route(params) =>
      call { 
        controllers_LoginController_register2_invoker.call(LoginController_8.register)
      }
  
    // @LINE:12
    case controllers_Utils_upload3_route(params) =>
      call { 
        controllers_Utils_upload3_invoker.call(Utils_4.upload)
      }
  
    // @LINE:14
    case controllers_Utils_uploadProfile4_route(params) =>
      call { 
        controllers_Utils_uploadProfile4_invoker.call(Utils_4.uploadProfile)
      }
  
    // @LINE:17
    case controllers_Application_index5_route(params) =>
      call { 
        controllers_Application_index5_invoker.call(Application_9.index)
      }
  
    // @LINE:20
    case controllers_Application_map6_route(params) =>
      call { 
        controllers_Application_map6_invoker.call(Application_9.map)
      }
  
    // @LINE:23
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:26
    case controllers_Application_logout8_route(params) =>
      call { 
        controllers_Application_logout8_invoker.call(Application_9.logout)
      }
  
    // @LINE:29
    case controllers_ProfileController_view9_route(params) =>
      call { 
        controllers_ProfileController_view9_invoker.call(ProfileController_5.view)
      }
  
    // @LINE:31
    case controllers_ProfileController_updateProfile10_route(params) =>
      call { 
        controllers_ProfileController_updateProfile10_invoker.call(ProfileController_5.updateProfile)
      }
  
    // @LINE:34
    case controllers_SalesController_getSales11_route(params) =>
      call { 
        controllers_SalesController_getSales11_invoker.call(SalesController_6.getSales)
      }
  
    // @LINE:36
    case controllers_SalesController_allSales12_route(params) =>
      call { 
        controllers_SalesController_allSales12_invoker.call(SalesController_6.allSales)
      }
  
    // @LINE:38
    case controllers_SalesController_createSalePage13_route(params) =>
      call { 
        controllers_SalesController_createSalePage13_invoker.call(SalesController_6.createSalePage)
      }
  
    // @LINE:40
    case controllers_SalesController_createSale14_route(params) =>
      call { 
        controllers_SalesController_createSale14_invoker.call(SalesController_6.createSale)
      }
  
    // @LINE:42
    case controllers_SalesController_renderSaleRolesPage15_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_SalesController_renderSaleRolesPage15_invoker.call(SalesController_6.renderSaleRolesPage(saleId))
      }
  
    // @LINE:44
    case controllers_SalesController_renderAddUserRolePage16_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_SalesController_renderAddUserRolePage16_invoker.call(SalesController_6.renderAddUserRolePage(saleId))
      }
  
    // @LINE:46
    case controllers_SalesController_addRole17_route(params) =>
      call { 
        controllers_SalesController_addRole17_invoker.call(SalesController_6.addRole)
      }
  
    // @LINE:48
    case controllers_SalesController_closeSale18_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_SalesController_closeSale18_invoker.call(SalesController_6.closeSale(saleId))
      }
  
    // @LINE:51
    case controllers_CatalogController_renderCatalogPage19_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_CatalogController_renderCatalogPage19_invoker.call(CatalogController_2.renderCatalogPage(saleId))
      }
  
    // @LINE:53
    case controllers_CatalogController_renderCatalogReadOnlyPage20_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_CatalogController_renderCatalogReadOnlyPage20_invoker.call(CatalogController_2.renderCatalogReadOnlyPage(saleId))
      }
  
    // @LINE:55
    case controllers_CatalogController_renderAddItemPage21_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_CatalogController_renderAddItemPage21_invoker.call(CatalogController_2.renderAddItemPage(saleId))
      }
  
    // @LINE:57
    case controllers_CatalogController_addItem22_route(params) =>
      call { 
        controllers_CatalogController_addItem22_invoker.call(CatalogController_2.addItem)
      }
  
    // @LINE:59
    case controllers_CatalogController_renderModifyItemPage23_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0)), params.fromQuery[Int]("itemId", Some(0))) { (saleId, itemId) =>
        controllers_CatalogController_renderModifyItemPage23_invoker.call(CatalogController_2.renderModifyItemPage(saleId, itemId))
      }
  
    // @LINE:61
    case controllers_CatalogController_modifyItem24_route(params) =>
      call { 
        controllers_CatalogController_modifyItem24_invoker.call(CatalogController_2.modifyItem)
      }
  
    // @LINE:63
    case controllers_CatalogController_renderTag25_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0)), params.fromQuery[Int]("itemId", Some(0))) { (saleId, itemId) =>
        controllers_CatalogController_renderTag25_invoker.call(CatalogController_2.renderTag(saleId, itemId))
      }
  
    // @LINE:65
    case controllers_CatalogController_renderAllTags26_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_CatalogController_renderAllTags26_invoker.call(CatalogController_2.renderAllTags(saleId))
      }
  
    // @LINE:67
    case controllers_CatalogController_qrTransaction27_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0)), params.fromQuery[Int]("itemId", Some(0)), params.fromQuery[String]("username", Some("")), params.fromQuery[String]("password", Some(""))) { (saleId, itemId, username, password) =>
        controllers_CatalogController_qrTransaction27_invoker.call(CatalogController_2.qrTransaction(saleId, itemId, username, password))
      }
  
    // @LINE:69
    case controllers_CatalogController_makeTransaction28_route(params) =>
      call { 
        controllers_CatalogController_makeTransaction28_invoker.call(CatalogController_2.makeTransaction)
      }
  
    // @LINE:71
    case controllers_CatalogController_renderReceipt29_route(params) =>
      call(params.fromQuery[Int]("transactionId", Some(0))) { (transactionId) =>
        controllers_CatalogController_renderReceipt29_invoker.call(CatalogController_2.renderReceipt(transactionId))
      }
  
    // @LINE:73
    case controllers_CatalogController_renderReport30_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_CatalogController_renderReport30_invoker.call(CatalogController_2.renderReport(saleId))
      }
  
    // @LINE:75
    case controllers_CatalogController_allReceipts31_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_CatalogController_allReceipts31_invoker.call(CatalogController_2.allReceipts(saleId))
      }
  
    // @LINE:77
    case controllers_TransactionController_renderTransactionPage32_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_TransactionController_renderTransactionPage32_invoker.call(TransactionController_0.renderTransactionPage(saleId))
      }
  
    // @LINE:80
    case controllers_AdministrationController_administration33_route(params) =>
      call { 
        controllers_AdministrationController_administration33_invoker.call(AdministrationController_1.administration())
      }
  
    // @LINE:82
    case controllers_AdministrationController_saleAdministration34_route(params) =>
      call(params.fromQuery[Int]("saleId", Some(0))) { (saleId) =>
        controllers_AdministrationController_saleAdministration34_invoker.call(AdministrationController_1.saleAdministration(saleId))
      }
  
    // @LINE:84
    case controllers_AdministrationController_lock35_route(params) =>
      call(params.fromQuery[Int]("userId", Some(0))) { (userId) =>
        controllers_AdministrationController_lock35_invoker.call(AdministrationController_1.lock(userId))
      }
  
    // @LINE:86
    case controllers_AdministrationController_unlock36_route(params) =>
      call(params.fromQuery[Int]("userId", Some(0))) { (userId) =>
        controllers_AdministrationController_unlock36_invoker.call(AdministrationController_1.unlock(userId))
      }
  
    // @LINE:88
    case controllers_Utils_createSuperUser37_route(params) =>
      call { 
        controllers_Utils_createSuperUser37_invoker.call(Utils_4.createSuperUser)
      }
  
    // @LINE:90
    case controllers_PriceSuggestionController_suggestPrice38_route(params) =>
      call(params.fromQuery[String]("keyword", Some("")), params.fromQuery[Int]("saleId", Some(0))) { (keyword, saleId) =>
        controllers_PriceSuggestionController_suggestPrice38_invoker.call(PriceSuggestionController_3.suggestPrice(keyword, saleId))
      }
  }
}
