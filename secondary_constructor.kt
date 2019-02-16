fun main(args: Array<String>) {
    var employee = Employee("Zakaria", id = 5729)
}

class Employee(var name: String) {
    var id = -1

   init {
       println("Employee has got a name: $name")
   }

    constructor(name: String, id: Int): this(name) {
        this.id = id
    }
}