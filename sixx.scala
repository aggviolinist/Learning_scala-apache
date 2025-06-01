// object sixx{
//     def main(args: Array[String]) ={
//         func("yyoow");//default must come after the non default 
//     }
// }
// def func(b: String, a: Int = 7 ): Unit = {
//  println(s"$a $b")//a is default b is non default
// }
object sixx{
    def main(args: Array[String]) = {
        func("ayoo")
    }
    def func(b:String, a:Int=10) :Unit ={
        println(s"$a $b")        
    }
}