def main(args: Array[String]) ={

    def ex = hesabu(5)
    def why = ex(10)
    def zi = why(15)

    print("The total is:" + zi)

}

def hesabu(x:Int)(y:Int)(z:Int) ={

    x+y+z

}
