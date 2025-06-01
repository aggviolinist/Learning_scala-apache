object two{
    def main(args: Array[String]) ={

        printString("A","B","C","D","E")
        println("********************")
        val number = List(1,4,6,3,54,34,90,42)
        printNumbers(number: _*) 

    }
    def printString(nyuzi:String*) ={
        var i = 0
        for( nyuzi <- nyuzi){
            println("Strings we have:" + i)
            i+=1
        }
    }
    def printNumbers(number:Int*) ={
    val minimum = number.min
    val maximum = number.max
    println("This is the minimum" + minimum)
    println("This is the minimum" + maximum)
    }
}