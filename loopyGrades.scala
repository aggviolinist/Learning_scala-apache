object loopyGrades{
    def main(args: Array[String]) ={
        val x = List(23,45,56,67,65,33,66,46,75,35,87,44,64)
        grading(x)
        bigNsmall(x)
    }
    def grading(x: List[Int])={
        
        val grade = x.map { score =>
        if(score >= 70) score + ":A"
        else if(score>=60) score + ":B"
        else if(score>=50) score + ":C"
        else if(score>=40) score + ":D"
        else score + ":F"
    }
        grade.foreach(println) 
    }
    def bigNsmall(x: List[Int]) ={
       // val total = grading(x)
        val minimum = x.min
        val maximum = x.max

        println("This is the maximum grade:" + maximum)
        println("This is the minimum grade:" + minimum)
    }
}