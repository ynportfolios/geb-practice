import geb.spock.GebReportingSpec
import org.junit.Test

class ExampleSpec extends GebReportingSpec {
  @Test
  def "example"() {
    when: 
    to HomePage

    then:
    headerNav.links[1].text() == "About"

    when:
    headerNav.links[1].click()

    then:
    at AboutPage
  }
}