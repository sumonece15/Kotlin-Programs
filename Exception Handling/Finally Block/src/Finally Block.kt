fun main (args: Array<String>){
    try {
        val data = 10 / 5
        println(data)
    } catch (e: NullPointerException) {
        println(e)
    } finally {
        println("finally block always executes")
    }
    println("below codes...")
}  