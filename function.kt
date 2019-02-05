fun main(args: Array<String>) {
    var person = Person()
    person.name = "Zakaria"
    println(person.name)

    println("Welcome: ${person.name}")
}

class Person {
    var name = ""

    fun display(name: String) {
        println(name)
    }
}