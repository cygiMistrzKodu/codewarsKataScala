def pythagoreanTriple(integers: Seq[Int]): Boolean = {

  val sortedNumbers = integers.sorted
  math.pow(sortedNumbers.head, 2) + math.pow(sortedNumbers.apply(1), 2) == math.pow(sortedNumbers.last, 2)
}