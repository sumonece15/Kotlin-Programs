class myClass(val name: String, var id: Int) {
}
fun main(args: Array<String>){
    val myclass = myClass ("Sumon", 101)

    println("Name = ${ myclass.name}")
    println("Id = ${ myclass.id}")
}