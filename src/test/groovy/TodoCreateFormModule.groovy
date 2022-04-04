import geb.Module

class TodoCreateFormModule extends Module {
  static content = {
    form { $("#todoCreateForm")}
    titleInput { form.find("input")[0]}
    createButton { form.find("button")[0]}
  }
}