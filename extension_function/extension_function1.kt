package extension_function

fun main(args: Array<String>) {
    val str1 = "Zakaria "
    val str2 = "Hossain"
    var str3 = "Hey, "

    str3 = str3.add(s2 = str2, s1 = str1)
    println(str3)

    var n3 = 3;
    println(n3.sum(3))
    println(n3.sum(3, 4))
}

fun String.add(s1: String, s2: String): String = this + s1 + s2

fun Int.sum(n1: Int, n2: Int = 2) = this + n1 + n2