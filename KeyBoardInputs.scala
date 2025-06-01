import scala.io.StdIn.readInt
 object KeyBoardInputs{
 def main(args:Array[String])={
 println("Hello World")
 //The function is called without specifying the arguments
 println( "Returned Value : " + totalMarks1() );
 }
 //A function to read from the Keyborad
 def totalMarks1( a:Double=readInt(),b:Double =readInt(),c:Double 
=readInt() ) : Double = a + b +c
 // A function to generate the marks randomly
 def totalMarks( a:Double=(Math.ceil(Math.random()*10)), 
b:Double =(Math.ceil(Math.random()*20)),c:Double 
=(Math.ceil(Math.random()*70)) ) : Double = a + b +c
 }