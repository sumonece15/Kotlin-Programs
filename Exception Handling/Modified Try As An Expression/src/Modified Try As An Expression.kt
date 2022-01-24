fun main(args: Array<String>){
    val str = getNumber("10.5")
    println(str)
}
fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    }
}

/*
the above code which generate an exception and return the last statement of catch block.
*/