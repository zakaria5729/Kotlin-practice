fun main(args: Array<String>) {
    var person = Person()
    person.display("Zakaria")

    println("Welcome: ${person.name}")

    println("Max = ${max(2, 5)}")
    println(age(2, 5))

    println("Sum = ${sum(2, 5)}")
}

class Person {
    var name = ""

    fun display(name: String) {
        this.name = name
    }
}

fun max(a: Int, b: Int) = if (a>b) a else b

fun age(a: Int, b: Int): Int =
    if (a>b) {
        print("greater age ")
        a
    }
    else {
        print("greater age ")
        b
    }

fun sum(x: Int, y: Int): Int = x+y