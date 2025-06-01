object ten{
    def main(args: Array[String]) ={
        println( apply(layout, 10))        
    }
    def apply(f: Int => String, v:Int) ={// f is a function that takes an int but returns a string
        f(v)
    } 
    def layout[A](x:A) ={// "A" can be of any type
        "[" + x.toString() + "]"
    }
}