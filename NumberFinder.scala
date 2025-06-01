object NumberFinder {
  def main(args: Array[String]): Unit = {
    // Dummy values
    val integers = List(23, 5, 67, -2, 99, 45, 0, 12)

    // Call the function to find and print the min and max values
    findAndPrintMinMax(integers)
  }

  def findAndPrintMinMax(integers: List[Int]): Unit = {
    if (integers.isEmpty) {
      println("No integers provided.")
    } else {
      val minValue = integers.min
      val maxValue = integers.max
      println(s"Smallest integer value: $minValue")
      println(s"Largest integer value: $maxValue")
    }
  }
}
