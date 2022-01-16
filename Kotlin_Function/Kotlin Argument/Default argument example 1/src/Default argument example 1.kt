fun main(args: Array<String>) {
    //passing no argument in function call
    run()
}

fun run(num: Int = 5, latter: Char = 'x') {
    print("parameter in function definition $num and $latter")
}