
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yudawinata/Documents/School/Subjects/CS2340/ffff00/conf/routes
// @DATE:Sun Jul 24 22:35:51 EDT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:51
  class ReverseCatalogController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def makeTransaction(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "makeTransaction")
    }
  
    // @LINE:51
    def renderCatalogPage(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "catalog" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:73
    def renderReport(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "genreport" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:67
    def qrTransaction(saleId:Int = 0, itemId:Int = 0, username:String = "", password:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "qrTransaction" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)), if(itemId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("itemId", itemId)), if(username == "") None else Some(implicitly[QueryStringBindable[String]].unbind("username", username)), if(password == "") None else Some(implicitly[QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:65
    def renderAllTags(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "alltags" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:59
    def renderModifyItemPage(saleId:Int = 0, itemId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "modifyitem" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)), if(itemId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("itemId", itemId)))))
    }
  
    // @LINE:71
    def renderReceipt(transactionId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "genreceipt" + queryString(List(if(transactionId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("transactionId", transactionId)))))
    }
  
    // @LINE:53
    def renderCatalogReadOnlyPage(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewcatalog" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:61
    def modifyItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "modifyitem")
    }
  
    // @LINE:63
    def renderTag(saleId:Int = 0, itemId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gentag" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)), if(itemId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("itemId", itemId)))))
    }
  
    // @LINE:75
    def allReceipts(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "allreceipts" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:55
    def renderAddItemPage(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "additem" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:57
    def addItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "additem")
    }
  
  }

  // @LINE:34
  class ReverseSalesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def createSalePage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "createsale")
    }
  
    // @LINE:46
    def addRole(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "adduserrole")
    }
  
    // @LINE:42
    def renderSaleRolesPage(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "saleroles" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:40
    def createSale(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "createsale")
    }
  
    // @LINE:48
    def closeSale(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "closesale" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:36
    def allSales(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "allsales")
    }
  
    // @LINE:44
    def renderAddUserRolePage(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adduserrole" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:34
    def getSales(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sale")
    }
  
  }

  // @LINE:90
  class ReversePriceSuggestionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def suggestPrice(keyword:String = "", saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "suggestprice" + queryString(List(if(keyword == "") None else Some(implicitly[QueryStringBindable[String]].unbind("keyword", keyword)), if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
  }

  // @LINE:29
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def updateProfile(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateprofile")
    }
  
    // @LINE:29
    def view(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
  }

  // @LINE:8
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def loginAttempt(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginAttempt")
    }
  
    // @LINE:10
    def register(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def map(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "map")
    }
  
    // @LINE:26
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:6
    def home(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:17
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "index.html")
    }
  
  }

  // @LINE:80
  class ReverseAdministrationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def unlock(userId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "unlock" + queryString(List(if(userId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("userId", userId)))))
    }
  
    // @LINE:82
    def saleAdministration(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "saleAdministration" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
    // @LINE:84
    def lock(userId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "lock" + queryString(List(if(userId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("userId", userId)))))
    }
  
    // @LINE:80
    def administration(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "administration")
    }
  
  }

  // @LINE:12
  class ReverseUtils(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def uploadProfile(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uploadProfile")
    }
  
    // @LINE:12
    def upload(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
    // @LINE:88
    def createSuperUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "createsuperuser")
    }
  
  }

  // @LINE:77
  class ReverseTransactionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def renderTransactionPage(saleId:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "transaction" + queryString(List(if(saleId == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("saleId", saleId)))))
    }
  
  }


}
