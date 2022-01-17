
//String templates
/*
String template expression is a piece of code which is evaluated and its result is returned into string.
Both string types (escaped and raw string) contain template expressions.
String templates starts with a dollar sign $ which consists either a variable name
or an arbitrary expression in curly braces.
*/

fun main(args: Array<String>) {
    val i =10
    print("i = $i")//i=10
}