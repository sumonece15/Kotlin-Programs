
//Referential equality (===)

/*
To check the two different references point to the same instance, we use === operator.
The !== operator is used for negation.
a === b specifies true if and only if a and b both point to the same object.
*/

fun main(args: Array<String>) {
    val str1 = buildString { "string value" }
    val str2 = buildString { "string value" }
    println(str1===str2)
    println(str1!==str2)
}