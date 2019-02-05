fun main(args: Array<String>) {
    val x = 9

    val str = when(x) {
        0, 1 -> "The value is 0 or "
        2 -> "The value is 2"
        in 5..8 -> "The value in 3 to 10"
        !in 5..10 -> "The value not in 3 to 10"
        else -> {
            "x is a alien may be" //this line not be returned
            "This is the default value"
        }
    }

    print(str)
}