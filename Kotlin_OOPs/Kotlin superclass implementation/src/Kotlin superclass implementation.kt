open class Bird {
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
}
class Parrot: Bird() {
    override var color = "Green"
    override fun fly() {
        super.fly()
        println("Parrot is flying...")

    }
}

fun main(args: Array<String>) {
    val p = Parrot()
    p.fly()
    println(p.color)

}