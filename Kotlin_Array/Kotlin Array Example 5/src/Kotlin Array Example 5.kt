
/*
The Kotlin's array elements are also traversed using index range (minValue..maxValue) or (maxValue..minValue).
Let's see an example of array traversing using range.
*/

fun main(args: Array<String>){
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    for (index in 0..4){
        println(myArray5[index])
    }
    println()
    for (index in 0..myArray5.size-1){
        println(myArray5[index])
    }
}