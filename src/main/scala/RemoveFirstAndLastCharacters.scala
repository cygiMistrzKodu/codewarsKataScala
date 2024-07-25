def squareArea(arc: Double): Double = {

  val r = (arc * 4) / (2 * math.Pi)
  BigDecimal(r * r).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

}
