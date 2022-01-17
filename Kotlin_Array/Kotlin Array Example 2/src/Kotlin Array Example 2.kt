
/*
We can also rewrite the value of array using its index value.
Since, we can able to modify the value of array, so array is called as mutable property.
*/


fun main(args: Array<String>){
    var myArray = Array<Int>(5){0}

    myArray[1]= 10
    myArray[3]= 15

    for(element in myArray){
        println(element)
    }
}