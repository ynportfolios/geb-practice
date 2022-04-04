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
  def "Todosページに遷移できる"() {
    when: "Homeページにて"
    to HomePageNew

    then: "Todosリンクが存在する"
    nav.links[2].text() == "Todos"

    when: "Todosリンクをクリックすると"
    nav.links[2].click()

    then: "Todosページが表示される"
    at TodosPage

    when:
    form.titleInput = "test"

    and:
    form.createButton.click()

    then:
    form.titleInput == ""
    display.todos[0].text() == "test"
  }
}