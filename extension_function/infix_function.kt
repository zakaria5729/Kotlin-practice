package extension_function

/*
* 1. All prefix functions are extension function
* But all extension functions are not infix
*
* Infix function have just only one parameter
* */

fun main(args: Array<String>) {
    val x = 12
    println(x greaterValue 10) //same as: x.greaterValue(10)
}

infix fun Int.greaterValue(x: Int): Int = if (this > x) this else x