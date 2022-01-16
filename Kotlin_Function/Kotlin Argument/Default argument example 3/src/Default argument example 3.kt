fun main(args: Array<String>) {

    //passing all argument in function call
    run(3, 'a')
}

fun run(num: Int = 5, latter: Char = 'x') {
    print("parameter in function definition $num and $latter")
}