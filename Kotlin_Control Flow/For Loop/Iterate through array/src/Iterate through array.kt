fun main(args : Array<String>) {

    //If the body of for loop contains only one single line of statement, it is not necessary to enclose within curly braces {}.

    val marks = arrayOf(80,85,60,90,70)
    for(item in marks)
        println(item)

    //The elements of an array are iterated on the basis of indices (index) of array.



        val mark = arrayOf(80,85,60,90,70)
        for(item in mark.indices)
            println("mark[$item]: "+ mark[item])

}
