
/*
Suppose when we try to insert an element at index position greater than array size then what will happen?
It will throw an ArrayIndexOutOfBoundException.
This is because the index value is not present at which we tried to insert element.
Due to this, array is called fixed size length.
*/

fun main(args: Array<String>){
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    myArray5[6]=18 // ArrayIndexOutOfBoundsException
    for(element in myArray5){
        println(element)
    }
}