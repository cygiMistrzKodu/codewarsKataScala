class ReplaceSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "replace" should "pass basic tests" in {
    val testCases = Seq(
      ("Hi!", "H!!"),
      ("!Hi! Hi!", "!H!! H!!"),
      ("aeiou", "!!!!!"),
      ("ABCDE", "!BCD!"),
      ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", "!bcd!fgh!jklmn!pqrst!vwxyz!BCD!FGH!JKLMN!PQRST!VWXYZ")
    )

    testCases foreach {
      (s, expected) =>
        assert(replace(s) == expected, s"for replace(\"$s\")")
    }
  }
}