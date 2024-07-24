import org.scalatest.flatspec.AnyFlatSpec

class MessiGoalsSpec extends AnyFlatSpec {
  "totalGoals" should "be 58" in {
    assertResult(58) (totalGoals)
  }
}