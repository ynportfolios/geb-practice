import geb.Module

class TodoDisplayModule extends Module {
  static content = {
    display { $("#todoDisplay") }
    todos { display.find("p") }
  }
}