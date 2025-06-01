object ClosureExample {
  def main(args: Array[String]): Unit = {
    val x = 10
    
    // Define a closure that captures `x`
    val closure = (y: Int) => x + y
    
    // Call the closure
    val result = closure(5)
    println(result) // Output will be 15
  }
}
