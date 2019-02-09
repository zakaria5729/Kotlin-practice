fun main(args: Array<String>) {
    Bangladesh().test()
}

open class Country {
    private var a1 = 12
    protected val b1 = 13
    internal val c1 = 14
    val d1 = 15

    //getter setter
    var myA1: Int
    get() = a1
    set(a) {
        a1 = a
    }
}

class Bangladesh: Country() {
    fun test() {
        println(myA1)
        println(b1)
        println(c1)
        println(d1)

        myA1 = 25
        println(myA1)
    }
}