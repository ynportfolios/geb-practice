import geb.Page

class HomePageNew extends Page {
  static at = {
    title == "todo-app"
    welcomeMessage.text().startsWith("Welcome to")
  }

  static content = {
    nav { module(HomeNavModule) }
    welcomeMessage { $("h1") }
  }
}