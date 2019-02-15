fun main(args: Array<String>) {
    var user1 = User("Zakaria", 10)
    var user2 = User("Zakaria", 10)

    if (user1 == user2)
        println("equal")
    else
        println("not equal")

    println(user1)
    println(user2)

    var myUser1 = MyUser("Zakaria", 10)
    var myUser2 = MyUser("Zakaria", 10)

    if (myUser1 == myUser2)
        println("equal")
    else
        println("not equal")

    println(myUser1)
    println(myUser2)

    var newMyUser = myUser1.copy(id = 20)
    println(newMyUser)


}

class User(name: String, var id: Int) {}

data class MyUser(var name: String, var id: Int) {}

/*
* data keyword of a class only contains the data of this class but not the object or instance of this class.
*
* In case of data class, the primary constructor only contains the properties variables not just the parameter
* */