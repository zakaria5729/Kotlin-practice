/*
* bye default class and class properties are public and final
* so we can not inherit a class properties directly
* for inherit we need to make a class "open"
* */

fun main(args: Array<String>) {
    var dog = Dog()
    dog.color = "black"
    dog.breed = "labra"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.color = "white"
    cat.age = 10
    cat.meow()
    cat.eat()
}

open class Animal {
    var color = ""

    fun eat() {
        println("Eat")
    }
}

class Dog: Animal() {
    var breed = ""

    fun bark(): Unit {
        println("Bark")
    }
}

class Cat: Animal() {
    var age = 2

    fun meow(): Unit {
        println("Meow")
    }
}
