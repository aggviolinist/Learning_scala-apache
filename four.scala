// object four{
//     def main(args: Array[String]) ={
//         printStrings("Hello","Scala","Python")
//     }
//     def printStrings(c:String*) ={
//         var i : Int =0;
//         for(c <- c){
//             println("Args Value["+i+"]=" + c);
//             i=i+1
//         }
//     }
// }
// object four{
//     def main(args: Array[String]) ={
//         printStrings("hi","there","welcome","to","my","youtube","channel")

//     }
//     def printStrings(c:String*) ={
//         var i=0
//         for(c<-c){
//             println("These are the languages \t"  + c)
//             i+=1

//         }
//     }
// }

object four{
    def main(args: Array[String]) = {
        printStrings("Nip","The","Greatest")
    }
    def printStrings(x:String*) ={
        var i = 0
        for (y <- x) {
            println("These are the strings \t" + y)
        }
        i += 1
    }
}