fun main(args: Array<String>) {
    /**
     * kotlin has no primitive type, all are objects
     * kotlin has no default value, you must have initialize it
     */

    var num = 10; //Integer number
    println(num)

    var numFloat = 12.5 //
    println(numFloat)
    println(numFloat.toInt()) //types cast of int

    var name = "Zakaria" //mutable string
    println(name)

    name = "Saharia" //mutable string
    println(name)

    val versity: String //we can define a variable type manually
    versity = "DIU" //immutable string that means not changeable
    println(versity)

    val age = 23 //final variable
    println("This is my age: " + age)
    println("This is my age: $age") //this is the another way to concatenate the string

    var bool: Boolean = true
    println(bool)

    var int = 3
    println(int)

    var long = 3L
    println(long)

    var float = 3.5F
    println(float)

    float = 3.5f
    println(float)

    var double = 3.6
    println(double)
}