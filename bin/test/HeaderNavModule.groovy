import geb.Module

class HeaderNavModule extends Module {
  static content = {
    nav { $("nav") }
    links { nav.find("a") }
  }
}