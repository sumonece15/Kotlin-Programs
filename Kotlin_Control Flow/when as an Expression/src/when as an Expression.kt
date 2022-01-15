fun main(args: Array<String>){
    var number = 4
    var numberProvided = when(number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }
    println("You provide $numberProvided")
}  