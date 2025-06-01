object eight{
    def main(args: Array[String]) ={
        printResults(45,70,87,43,23,89,11,10,23,44,65,54,76,32,12,9,2,3,5,34,67,54,3)
    }
    def printResults(gredi: Int*) ={
        var i: Int=0;
        for(mark <- gredi){
            println(s"Mark Value= $mark\t" +
              s"Grade=${grade(mark)}")
        }
        def grade(mark:Int): String={
            if(mark >= 70) "A" 
            else if(mark>=60) "B"
            else if(mark>=50) "C" 
            else if(mark>=40)"D" 
            else "F"
        }
    }
}