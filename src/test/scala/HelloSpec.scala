class HelloSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "sayHello" should "pass basic tests" in {
    val testCases = List(
      ("Mr. Spock", "Hello, Mr. Spock", "\nInput:\n  name = \"Mr. Spock\""),
      ("Captain Kirk", "Hello, Captain Kirk", "\nInput:\n  name = \"Captain Kirk\""),
      ("Liutenant Uhura", "Hello, Liutenant Uhura", "\nInput:\n  name = \"Liutenant Uhura\""),
      ("Dr. McCoy", "Hello, Dr. McCoy", "\nInput:\n  name = \"Dr. McCoy\""),
      ("Mr. Scott", "Hello, Mr. Scott", "\nInput:\n  name = \"Mr. Scott\"")
    )

    testCases.foreach {
      case (name, expected, clue) =>
        assertResult(expected, clue)(sayHello(name))
    }
  }
}
