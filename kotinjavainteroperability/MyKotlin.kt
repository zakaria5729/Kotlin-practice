package kotinjavainteroperability

fun main(args: Array<String>) {
    println("Printing sum from Kotlin file: ${MyJava.sumFromJava(2,5)}")
}

fun sumFromKotlin(x: Int, y: Int): Int = x + y