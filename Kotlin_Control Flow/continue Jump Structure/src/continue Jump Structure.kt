fun main(args: Array<String>) {
    for (i in 1..3) {
        println("i = $i")
        val j = null
        if (j == 2) {
            continue
        }
        println("this is below if")
    }
}