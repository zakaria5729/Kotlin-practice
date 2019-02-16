fun main(args: Array<String>) {
    var myCat = MyCat()
    myCat.eat()
    println()

    var myDog = MyDog()
    myDog.eat()
    println()
}

open class MyAnimal {
    open var color = "Gray"

    open fun eat() {
        println("Animal eating")
    }
}

class MyDog: MyAnimal() {
    override var color = "Black"

    override fun eat() {
        println("Dog color: ${super<MyAnimal>.color}")
        println("Dog eating")
    }
}

class MyCat: MyAnimal() {
    override var color = "Black"

    override fun eat() {
        super<MyAnimal>.eat()
        println("Cat eating")
    }
}

/*
* When an interface and a class extends and implements same class and if interface and class contains the same name of method then the compiler confused about this method.
* That's why we use diamond block for safety like: super<MyAnimal>.eat()
* */