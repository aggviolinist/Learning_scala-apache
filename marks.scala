object marks extends App{
        val kev = new Marks(20,29)
        println(kev)

    class Marks(var cat1:Int, var cat2:Int, var exam:Int){
        var sum = cat1+cat2+exam
        override def toString():String = s"Cat1:$cat1, Cat2:$cat2 and Exam:$exam, Sum:$sum"

    }
}