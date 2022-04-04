import geb.Module

class HomeNavModule extends Module {
  static content = {
    nav { $("nav") }
    links { nav.find("a") }
  }
}