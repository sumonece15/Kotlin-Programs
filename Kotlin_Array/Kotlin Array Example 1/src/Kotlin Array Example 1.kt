
/*
In this example, we are simply initialize an array of size 5 with default value as 0 and traverse its elements.
 The index value of array starts from 0.
 First element of array is placed at index value 0 and last element at one less than the size of array.
*/

fun main(args: Array<String>) {
    var myArray = Array<Int>(5) { 0 }

    for (element in myArray) {
        println(element)
    }
}