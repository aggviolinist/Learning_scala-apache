file:///C:/Users/mulandi/Desktop/scala%20projects/exercise.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition addthendouble is defined in
  C:/Users/mulandi/Desktop/scala projects/wewe.scala
and also in
  C:/Users/mulandi/Desktop/scala projects/exercise.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 72
uri: file:///C:/Users/mulandi/Desktop/scala%20projects/exercise.scala
text:
```scala
object MinMaxFinder {
  def main(args: Array[String]): Unit = {
    //@@ Read the number of integer values
    println("Enter the number of integer values:")
    val numValues = scala.io.StdIn.readInt()

    // Read the integer values
    println(s"Enter $numValues integers:")
    val integers = for (_ <- 1 to numValues) yield scala.io.StdIn.readInt()

    // Call the function to find and print the min and max values
    findAndPrintMinMax(integers.toList)
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

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition addthendouble is defined in
  C:/Users/mulandi/Desktop/scala projects/wewe.scala
and also in
  C:/Users/mulandi/Desktop/scala projects/exercise.scala
One of these files should be removed from the classpath.