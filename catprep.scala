object catprep{
    def main(args: Array[String]) ={
        var x = Math.ceil(Math.random()*100)
        val grade = if(x>=70) x + ":A"
        else if(x>=60) x + ":B"
        else if(x>=50) x + ":C"
        else if(x>=40) x + ":D"
        else x + ":F"
        println(grade)
    }
}