fun main(args: Array<String>) {
    YourDog("Red", "Pug")
}

open class YourAnimal {
    var color = ""

    constructor(color: String) {
        this.color = color

        println("From YourAnimal: $color")
    }
}

class YourDog: YourAnimal {
    var breed = ""

    constructor(color1: String, breed: String): super(color1) {
        this.breed = breed

        println("From YourDog: $color, $breed")
    }
}
