import scala.util.Random

object eleven {
  
  def randomName(names: Seq[String]): String = { //sequence of strings in names
    val randomNum = Random.nextInt(names.length)
    names(randomNum)
  }

  def main(args: Array[String]): Unit = {
    // Define the sequence of names
    val names = Seq("Oyugi", "Christine", "Joylene", "Moses")

    // Call the randomName function and store the result in winner
    val winner = randomName(names)

    // Print the winner
    println(winner)
  }
}
