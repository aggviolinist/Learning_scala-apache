object three{
    def main(args: Array[String]) ={
        delayed(time())
    }
    def time() ={
        println("This is the time")
        System.nanoTime()
    }
    def delayed(t: => Long) ={
        println("Below is the new time")
        println("Print this time" + System.nanoTime())
        println("Time in the delayed function" + t)
    }
}