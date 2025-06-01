object for_loop{
    def main(args: Array[String]) = {
        val family = Map ("Francis" -> 59, "Eunice" -> 57, "Vex" -> 23,"Dave" -> 20, "Evanso" -> 18)
     //   for ((name,age) <- family)
       // println(s"Name:$name \t Age: $age")
       family.foreach{
        case(name,age) => println(s"Name: $name \t\t\t age: $age ")
    }
}
}