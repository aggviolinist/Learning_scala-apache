object Person extends App{
    val person = new Person1("John", "Doe")

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


}

