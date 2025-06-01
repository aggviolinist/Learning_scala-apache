import scala.collection.mutable.Map
import java.{util => ju}

object collection_class_exercises{
    def main(args: Array[String]) = {
        val colors = Map("red" -> "#FF0000","Azure"->"#F0FFFF", "Peru" -> "#CD853F")
        val colors2 = Map("blue" -> "#0033FF", "Yellow" -> "#FFFF00", "red" -> "FF0000")
        val allColors = colors ++ colors2
        println("Colors ++ colors2:" + allColors)
        val nums: Map[Int, Int] = Map()
        println("Keys in colors:" + colors.keys)
        println("Values in colors: "+ colors.values)
        println("Check if colors is empty:" + colors.isEmpty)
        println("Check if nums is empty:" +nums.isEmpty )

    }   
}