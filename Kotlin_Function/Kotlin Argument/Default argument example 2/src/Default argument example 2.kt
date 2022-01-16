fun main(args: Array<String>) {
    //passing some argument in function call
    run(3)
}

fun run(num: Int = 5, latter: Char = 'x') {
    print("parameter in function definition $num and $latter")
}