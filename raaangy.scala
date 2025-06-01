object raaangy{
    def main(args: Array[String]) = {
        val a = 50
        val b = 150

        if(twoIntegers(a) || twoIntegers(b)){
             println(s"Either $a or $b is in the range 1 to 100 inclusive.")
        }
        else{
             println(s"Neither $a or $b is in the range 1 to 100 inclusive.")
        }
    }
    def twoIntegers(num:Int) :Boolean ={
        num >= 1 && num <= 100
    }
}