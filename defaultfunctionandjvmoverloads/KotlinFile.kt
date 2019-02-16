package defaultfunctionandjvmoverloads

fun main(args: Array<String>) {
    println(product(3, 3))
}

@JvmOverloads
fun product(x: Int, y: Int, z: Int = 2): Int = x*y*z