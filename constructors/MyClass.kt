package constructors

class MyClass(private var name: String) { //this is how we can define a constructor

    fun displayName() {
        println("This is: $name")
    }
}
