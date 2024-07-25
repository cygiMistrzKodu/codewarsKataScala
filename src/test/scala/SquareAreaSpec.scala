import org.scalatest._
import flatspec._

class SquareAreaSpec extends AnyFlatSpec {
  it should "pass basic tests" in {
    val testCases = List[(Double, Double)]( //arc, expected
      (2, 1.62),
      (0, 0),
      (14.05, 80),
      (1, 0.41),
      (100, 4052.85)
    )

    testCases.foreach {
      case (arc, expected) => assertResult(expected, s"\nInput:\n  arc = $arc") {squareArea(arc)}
    }
  }
}