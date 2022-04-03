import geb.Page

class AboutPage extends Page {

  static at = {
    title == "todo-app"
    h.text() == ("This is an about page")
  }

  static content = {
    h { $("h1") }
  }
}