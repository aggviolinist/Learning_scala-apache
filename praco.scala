// def addNumbers(a:Int, b:Int, c:Double) :Int ={
//     var sum = a +b 
//     var dabo = sum * 2
//     dabo
// }

// def greet() = {
//     print("Hello world")
// }

// object praco {
//     def main(args: Array[String]) ={
//         delayed(time())
//     }
//     def time() ={
//         println("Getting time in nano seconds")
//         System.nanoTime

//     }
//     def delayed(t:Long) ={
//         println("System now:" + System.nanoTime)
//         println("In delayed method")
//         println("Time parameter now:" +t)
//     }
// }

object praco{
    def main(args: Array[String]) ={
        delay(time())      
    }
    def time() ={
        println("This the actual time")
        System.nanoTime
    }
    def delay(t:Long) ={
        println("This time is delayed for a bit")
        println("This time is from the method time:" + System.nanoTime)
        println("*************")
        println("This is the time here" +t)

    }
}