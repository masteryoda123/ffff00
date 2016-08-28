
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/conf/routes
// @DATE:Sun Jul 24 22:35:51 EDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseCatalogController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def makeTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.makeTransaction",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "makeTransaction"})
        }
      """
    )
  
    // @LINE:51
    def renderCatalogPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.renderCatalogPage",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "catalog" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:73
    def renderReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.renderReport",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genreport" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:67
    def qrTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.qrTransaction",
      """
        function(saleId0,itemId1,username2,password3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "qrTransaction" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0)), (itemId1 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("itemId", itemId1)), (username2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username2)), (password3 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password3))])})
        }
      """
    )
  
    // @LINE:65
    def renderAllTags: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.renderAllTags",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "alltags" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:59
    def renderModifyItemPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.renderModifyItemPage",
      """
        function(saleId0,itemId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "modifyitem" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0)), (itemId1 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("itemId", itemId1))])})
        }
      """
    )
  
    // @LINE:71
    def renderReceipt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.renderReceipt",
      """
        function(transactionId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genreceipt" + _qS([(transactionId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("transactionId", transactionId0))])})
        }
      """
    )
  
    // @LINE:53
    def renderCatalogReadOnlyPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.renderCatalogReadOnlyPage",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewcatalog" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:61
    def modifyItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.modifyItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "modifyitem"})
        }
      """
    )
  
    // @LINE:63
    def renderTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.renderTag",
      """
        function(saleId0,itemId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gentag" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0)), (itemId1 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("itemId", itemId1))])})
        }
      """
    )
  
    // @LINE:75
    def allReceipts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.allReceipts",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allreceipts" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:55
    def renderAddItemPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.renderAddItemPage",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "additem" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:57
    def addItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CatalogController.addItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "additem"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseSalesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def createSalePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalesController.createSalePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createsale"})
        }
      """
    )
  
    // @LINE:46
    def addRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalesController.addRole",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserrole"})
        }
      """
    )
  
    // @LINE:42
    def renderSaleRolesPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalesController.renderSaleRolesPage",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saleroles" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:40
    def createSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalesController.createSale",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createsale"})
        }
      """
    )
  
    // @LINE:48
    def closeSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalesController.closeSale",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "closesale" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:36
    def allSales: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalesController.allSales",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allsales"})
        }
      """
    )
  
    // @LINE:44
    def renderAddUserRolePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalesController.renderAddUserRolePage",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserrole" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:34
    def getSales: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalesController.getSales",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sale"})
        }
      """
    )
  
  }

  // @LINE:90
  class ReversePriceSuggestionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def suggestPrice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PriceSuggestionController.suggestPrice",
      """
        function(keyword0,saleId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestprice" + _qS([(keyword0 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("keyword", keyword0)), (saleId1 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId1))])})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def updateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.updateProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateprofile"})
        }
      """
    )
  
    // @LINE:29
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def loginAttempt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginAttempt",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginAttempt"})
        }
      """
    )
  
    // @LINE:10
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def map: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.map",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "map"})
        }
      """
    )
  
    // @LINE:26
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:6
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:17
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index.html"})
        }
      """
    )
  
  }

  // @LINE:80
  class ReverseAdministrationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def unlock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministrationController.unlock",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unlock" + _qS([(userId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("userId", userId0))])})
        }
      """
    )
  
    // @LINE:82
    def saleAdministration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministrationController.saleAdministration",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saleAdministration" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
    // @LINE:84
    def lock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministrationController.lock",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lock" + _qS([(userId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("userId", userId0))])})
        }
      """
    )
  
    // @LINE:80
    def administration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministrationController.administration",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "administration"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseUtils(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def uploadProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Utils.uploadProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadProfile"})
        }
      """
    )
  
    // @LINE:12
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Utils.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:88
    def createSuperUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Utils.createSuperUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createsuperuser"})
        }
      """
    )
  
  }

  // @LINE:77
  class ReverseTransactionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def renderTransactionPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.renderTransactionPage",
      """
        function(saleId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transaction" + _qS([(saleId0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("saleId", saleId0))])})
        }
      """
    )
  
  }


}
