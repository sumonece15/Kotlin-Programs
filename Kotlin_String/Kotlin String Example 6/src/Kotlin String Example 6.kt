
//Structural equality (==)

/*
To check the two objects containing the same value, we use == operator or != operator for negation.
It is equivalent to equals() in java.
*/

fun main(args: Array<String>) {
    val str1 = "Hello, World!"
    val str2 = "Hello, World!"
    println(str1==str2) //true
    println(str1!=str2) //false
}