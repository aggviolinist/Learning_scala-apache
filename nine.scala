import java.util.Date
object nine{
    def main(args: Array[String]) ={
        val date = new Date

        var logVarible= log(date, _:String)

        logVarible("message 1")

       // log(date, "message 1")
        Thread.sleep(1000)

       // log(date, "Message 2")
       logVarible("message 2")
        Thread.sleep(1000)

        //log(date, "message 3")
        logVarible("message 3")
        Thread.sleep(1000)
    }
    def log(date: Date, message: String) ={
        println(s"${date} ..... ${message}")
    }
}