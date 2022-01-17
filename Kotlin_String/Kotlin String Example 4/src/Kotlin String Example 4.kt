
//String template in raw string:

fun main(args: Array<String>) {
    val a = 10
    val b = 5

    val myString = """value $a  
        |is greater than value $b  
    """.trimMargin()
    println("${myString.trimMargin()}")
}