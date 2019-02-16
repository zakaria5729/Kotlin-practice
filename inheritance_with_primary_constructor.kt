fun main(args: Array<String>) {
    NewDog("black", "pug")
}

open class NewAnimal(var color: String) {
    init {
        println("From NewAnimal init: $color")
    }
}

class NewDog(color: String, var breed: String): NewAnimal(color) {
    init {
        println("From NewDog init: $color, $breed")
    }
}