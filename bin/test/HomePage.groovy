import geb.Page

class HomePage extends Page {
  static at = {
    title == "todo-app"
    h.text().startsWith("Welcome to")
  }

  static content = {
    headerNav { module(HeaderNavModule) }
    h { $("h1") }
  }
}