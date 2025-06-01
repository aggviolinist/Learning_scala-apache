error id: file:///C:/Users/mulandi/Desktop/projects/scala%20projects/Person.scala:[11..16) in Input.VirtualFile("file:///C:/Users/mulandi/Desktop/projects/scala%20projects/Person.scala", "object 

class Person1(var firstNAME: String, var lastName: String ){
    println("The constructor begins")
     var age=0
     private val HOME = System.getProperty("user.home")

     override def toString(): String = s"$firstNAME $lastName is $age years old"

     def printHome():Unit ={
       println(s"Home= $HOME")
     } 
     def printFullName():Unit ={
        println(this)
     } 

     printHome()
     printFullName()
     println(s"End of constructor");
}
//val person = new Person("John", "Doe")

object Person {
    def main(args: Array[String]): Unit = {
        val person = new Person1("John", "Doe")
    }
}

")
file:///C:/Users/mulandi/Desktop/projects/scala%20projects/Person.scala
file:///C:/Users/mulandi/Desktop/projects/scala%20projects/Person.scala:3: error: expected identifier; obtained class
class Person1(var firstNAME: String, var lastName: String ){
^
#### Short summary: 

expected identifier; obtained class