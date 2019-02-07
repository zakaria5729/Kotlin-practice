package extension_function

fun main(args: Array<String>) {
    var student = Student()

    println(student.hasPassed(80))
    println(student.hasScholar(80))
}

fun Student.hasScholar(marks: Int): Boolean {
    return marks > 90;
}

class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40;
    }
}