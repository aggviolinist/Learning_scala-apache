object seven{
    def main(args: Array[String]) ={

        for(i<-1 to 20)
        println("Factorial of "+i+":="+factorial(i))

    }
    def factorial(n: Int) :Int ={
        if(n <=1)
         1
         //if n>=1 then take n * factorial
        else
            n*factorial(n-1)
    }
}