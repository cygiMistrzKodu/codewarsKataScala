class ShortenToDateSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "shortenToDate" should "pass basic tests" in {
    val testCases = Seq(
      // longDate                    expected
      ("Monday February 2, 8pm",   "Monday February 2"),
      ("Tuesday May 29, 8pm",      "Tuesday May 29"),
      ("Wed September 1, 3am",     "Wed September 1"),
      ("Friday May 2, 9am",        "Friday May 2"),
      ("Tuesday January 29, 10pm", "Tuesday January 29")
    )

    testCases foreach {
      (longDate, expected) =>
        assert(shortenToDate(longDate) == expected, s"for shortenToDate(\"$longDate\")")
    }
  }
}