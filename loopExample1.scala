object LoopExample1 {
  def main(args: Array[String]): Unit = {
    var i = 0
    var sum = 0
    while (i < args.length) {
      println(args(i)) // prints out the ith command line argument
      sum = sum + Integer.parseInt(args(i)) // You understand this?
      i += 1  // increments i by one
    }
    println(sum)
  } // End of main
} // End of class
