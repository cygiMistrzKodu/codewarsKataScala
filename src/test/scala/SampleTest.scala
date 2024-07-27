import org.scalatest._
import flatspec._

class SampleTest extends AnyFlatSpec {

  val testCases = List( //(n, limit, expected)
    (5, 25, List(5, 10, 15, 20, 25)),
    (1, 2, List(1, 2))
  )

  testCases.foreach {
    case (n, limit, expected) =>
      s"findMultiples($n, $limit)" should s"return $expected" in {
        assertResult(expected) {findMultiples(n, limit)}
      }
  }
}