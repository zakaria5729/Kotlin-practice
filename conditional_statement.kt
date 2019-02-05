fun main(args: Array<String>) {
    val a = 12
    val b = 15

    val max: Int = if (a > b) {
        println("a is greater")
        a
    } else {
        println("b is greater")
        b
    }

    println(max)
}