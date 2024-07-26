class PythagoreanTripleSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "pythagoreanTriple" should "pass basic tests" in {
    assert(pythagoreanTriple(Seq(3, 4, 5)) == true, "for pythagoreanTriple(Seq(3, 4, 5))")
    assert(pythagoreanTriple(Seq(5, 3, 4)) == true, "for pythagoreanTriple(Seq(5, 3, 4))")
    assert(pythagoreanTriple(Seq(13, 12, 5)) == true, "for pythagoreanTriple(Seq(13, 12, 5))")
    assert(pythagoreanTriple(Seq(100, 3, 999)) == false, "for pythagoreanTriple(Seq(100, 3, 999))")
  }
}