
//Raw String
/*
Row String is declared within triple quote (""" """).
It provides facility to declare String in new lines and contain multiple lines.
Row String cannot contain any escape character.
*/

fun main(args: Array<String>) {

    val text = """Kotlin is official language  
        |announce by Google for  
        |android application development  
    """.trimMargin()

    println(text)
}