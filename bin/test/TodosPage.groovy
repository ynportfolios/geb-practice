import geb.Page

class TodosPage extends Page {

  static at = {
    title == "todo-app"
    welcomeMessage.text() == ("This is an todos page")
  }

  static content = {
    form { module(TodoCreateFormModule) }
    display { module(TodoDisplayModule) }
    welcomeMessage { $("h1") }
  }
}