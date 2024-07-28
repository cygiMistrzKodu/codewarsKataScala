class DeriveSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "derive" should "pass basic tests" in {
    assert(derive(7, 8) == "56x^7", "for derive(7, 8)")
    assert(derive(5, 9) == "45x^8", "for derive(5, 9)")
  }
}