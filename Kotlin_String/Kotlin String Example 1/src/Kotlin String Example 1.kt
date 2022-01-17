
//String elements
/*
The characters which are present in string are known as elements of string.
Element of string are accessed by indexing operation string[index].
String's index value starts from 0 and ends at one less than the size of string string[string.length-1].
Index 0 represent first element, index 1 represent second element and so on.
*/

fun main(args: Array<String>) {

    val str = "Hello, Sumon!"
    println(str[0])
    println(str[1])
    println(str[str.length-1])
}