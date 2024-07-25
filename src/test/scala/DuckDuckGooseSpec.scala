class DuckDuckGooseSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "duckDuckGoose" should "pass basic tests" in {
    val players = IndexedSeq("a", "b", "c", "d", "c", "e", "f", "g", "h", "z").map(Player(_))

    assert(duckDuckGoose(players, 1) ==  "a", s"for duckDuckGoose($players, 1)")
    assert(duckDuckGoose(players, 3) ==  "c", s"for duckDuckGoose($players, 3)")
    assert(duckDuckGoose(players, 10) == "z", s"for duckDuckGoose($players, 10)")
    assert(duckDuckGoose(players, 20) == "z", s"for duckDuckGoose($players, 20)")
    assert(duckDuckGoose(players, 30) == "z", s"for duckDuckGoose($players, 30)")
    assert(duckDuckGoose(players, 18) == "g", s"for duckDuckGoose($players, 18)")
    assert(duckDuckGoose(players, 28) == "g", s"for duckDuckGoose($players, 28)")
    assert(duckDuckGoose(players, 12) == "b", s"for duckDuckGoose($players, 12)")
    assert(duckDuckGoose(players, 2) ==  "b", s"for duckDuckGoose($players, 2)")
    assert(duckDuckGoose(players, 7) ==  "f", s"for duckDuckGoose($players, 7)")
  }
}