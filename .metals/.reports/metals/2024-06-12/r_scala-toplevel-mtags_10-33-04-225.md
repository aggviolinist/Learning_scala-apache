error id: file:///C:/Users/mulandi/Desktop/scala%20projects/loopyGrades.scala:[479..480) in Input.VirtualFile("file:///C:/Users/mulandi/Desktop/scala%20projects/loopyGrades.scala", "object loopyGrades{
    def main(args: Array[String]) ={


        val x = List(23,45,56,67,65,33,66,46,75,35,87,44,64)
        grading(x)

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
    def
}")
file:///C:/Users/mulandi/Desktop/scala%20projects/loopyGrades.scala
file:///C:/Users/mulandi/Desktop/scala%20projects/loopyGrades.scala:21: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace