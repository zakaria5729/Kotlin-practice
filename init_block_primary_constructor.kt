fun main(args: Array<String>) {
    var student = Student("Zakaria");
    println(student.name)
}

class Student(var name: String) {
    init {
        println("Student has got a name: $name")
    }
}
