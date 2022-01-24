
/*
try-catch block as an expression which returns a value.
In this example String value to Int which does not generate any exception and returns last statement of try block.
*/

fun main(args: Array<String>){
    val str = getNumber("10")
    println(str)
}
fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    } catch (e: ArithmeticException) {
        0
    }
}