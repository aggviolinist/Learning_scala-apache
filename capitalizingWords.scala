object capitalizingWords{
    def main(args: Array[String]) ={
        val name = List("kev","mulandi","maei")
        val names = for(n <-name ) yield n.capitalize
        println(names)
        
    }
}