import org.scalatest.*, funsuite.*, matchers.should.*, prop.*

class RemoveFirstAndLastCharactersSpec extends AnyFunSuite with TableDrivenPropertyChecks with Matchers {

  import RemoveFirstAndLastCharacters.removeChars

  val fixedTests = Table[String, String](
    ("s", "expected"),
    ("eloquent", "loquen"),
    ("country", "ountr"),
    ("person", "erso"),
    ("place", "lac"),
  )

  test("Fixed tests") { forAll(fixedTests) { removeChars(_) shouldBe _ } }
}
