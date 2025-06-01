object one{
    def main(args: Array[String]) ={
        //println(mathes(5,5,5))
        //greet()
        delayed(time() )
    }
    def mathes(a:Int,b:Int,c:Int) ={
        val sum = a+b+c
        sum
    }
    def greet()={
        println("Wasssup")
    }
    def time()={
        println("This is the time:")
        System.nanoTime()
    }
    def delayed(t: Long) ={
        println("This is the time:" + System.nanoTime())
        println("This is the second time")
        println("This is the third time" + t)
    }
   
} 