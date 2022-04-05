import geb.spock.GebReportingSpec
import org.junit.Test

class TodosSpec extends GebReportingSpec {
  @Test
  def "Todosページに遷移できる"() {
    when: "Homeページにて"
    to HomePageNew

    then: "Todosリンクが存在する"
    nav.links[2].text() == "Todos"

    when: "Todosリンクをクリックすると"
    nav.links[2].click()

    then:
    at TodosPage
  }

  @Test
  def "Todosページに遷移、Todoを作成・表示・削除する"() {
    when: "Homeページにて"
    to HomePageNew

    then: "Todosリンクが存在する"
    nav.links[2].text() == "Todos"

    when: "Todosリンクをクリックすると"
    nav.links[2].click()

    then: "Todosページが表示される"
    at TodosPage

    when: "タイトル入力欄にtestを入力し"
    form.titleInput = "test"

    and: "作成ボタンをクリックすると"
    form.createButton.click()

    then: "タイトル入力欄をクリア、削除ボタン・testが表示される"
    display.find("button").size() == 2
    display.todos[0].text() == "test"
    form.titleInput == ""

    when: "削除ボタンをクリックすると"
    display.deleteButtons[0].click()

    then: "削除ボタン、testが削除される"
    display.find("button").size() == 1
    display.find("p").size() == 1
  }
}