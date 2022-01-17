
/*
Array in Kotlin can also be declared using library functions such as arrayOf(), intArrayOf(), etc.
Let's see the example of array using arrayOf() and intArrayOf() function.
*/


fun main(args: Array<String>){
    val name = arrayOf<String>("Sumon","Jobayer","Sabbir","Saikat","Subtroto")
    var myArray2 = arrayOf<Int>(1,10,4,6,15)
    var myArray3 = arrayOf(5,10,20,12,15)
    var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    for(element in name){
        println(element)
    }

    println()
    for(element in myArray2){
        println(element)
    }
    println()
    for(element in myArray3){
        println(element)
    }
    println()
    for(element in myArray4){
        println(element)
    }
    println()
    for(element in myArray5){
        println(element)
    }

}