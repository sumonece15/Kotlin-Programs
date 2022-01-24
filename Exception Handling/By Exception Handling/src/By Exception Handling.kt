fun main(args: Array<String>){
    try {
        val data = 20 / 0  //may throw exception
    } catch (e: ArithmeticException) {
        println(e)
    }
    println("code below exception...")
}

/*
In the above program after implementing try - catch block, rest of code below exception executes.
*/