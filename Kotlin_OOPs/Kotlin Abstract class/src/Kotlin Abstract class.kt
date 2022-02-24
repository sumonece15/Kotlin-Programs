abstract class Car{
    abstract fun run()
}
class Honda: Car(){
    override fun run(){
        println("Honda is running safely..")
    }
}
fun main(args: Array<String>){
    val obj = Honda()
    obj.run();
}  