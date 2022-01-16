fun main(args: Array<String>) {
    inlineFunction({
        println("calling inline functions")
        return
    }, { println("next parameter in inline functions") })
}

inline fun inlineFunction(myFun: () -> Unit, nxtFun: () -> Unit) {
    myFun()
    nxtFun()
    print("code inside inline function")
}  