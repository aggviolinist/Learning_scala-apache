// import scala.io.StdIn.readLine
//  object HelloInteractive extends App {
//     print("Enter your first name: ")
//     val firstName = readLine()
//     print("Enter your last name: ")
//     val lastName = readLine()
//     println(s"Your name is $firstName $lastName")
//  }
import scala.io.StdIn.readLine
object HelloInteractive extends App {
  def alphabets(num: Int, str: String): (String, String) = {
    // Dummy implementation of alphabets function
    (str * (num / str.length), str * (num % str.length))
  }
    print("what is your name?")
    val fname=readLine();
    print("What is your last")
    val lname=readLine();
    var (a,b) = alphabets(40,"vex")
    println(s"Your name is $fname $lname");print(a,b)
}