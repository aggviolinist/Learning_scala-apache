object class_work extends App{
    val mylist=List(1,2,3,4)
    println(mylist)
    val mylist2 = mylist.::(5)
    println(mylist2)
    val mylist3 = mylist.::(9,10,23)
    println(mylist3)
    val mylist4 = mylist:::List(10,20,19,19,19)
    println(mylist4)
    println(mylist4.tail)
    println(mylist.head)
    println(mylist4.apply(5))
    println(mylist4.distinct)

}