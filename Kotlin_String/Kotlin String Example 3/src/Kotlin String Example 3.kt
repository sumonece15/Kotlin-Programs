
//String template as arbitrary expression in curly braces:

/*
String template is also used in arbitrary expression in curly braces to evaluate a string expression.
This is done by using dollar sign $.
*/

fun main(args: Array<String>) {
    val str = "abcd"
    println("$str is a string which length is ${str.length}")
}