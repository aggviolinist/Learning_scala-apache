object removeUnderscoreCapitaize{
    def main(args: Array[String]) = {
        val wordz = List("_kev","_mulandi","_maei")
        val newWordz = for(n<-wordz) yield n.drop(1).capitalize
            println(newWordz)
    }
}