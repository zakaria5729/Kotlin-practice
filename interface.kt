fun main(args: Array<String>) {
    var myButton = MyButton()
    myButton.onClick()
    myButton.onTouch()
    println(myButton.name)
}

interface MyFirstInterfaceListener {
    var name: String

    fun onTouch()

    fun onClick() {
        println("onClick called from first")
    }
}

interface MySecondInterfaceListener {
    fun onTouch() {
        println("onTouch called")
    }

    fun onClick() {
        println("onClick called from second")
    }
}

class MyButton : MyFirstInterfaceListener, MySecondInterfaceListener {
    override var name: String = "Zakaria :overrided"

    override fun onTouch() {
        println("onTouch called :overrided")
    }

    override fun onClick() { //this method overriding is optional
        super<MyFirstInterfaceListener>.onClick()
        super<MySecondInterfaceListener>.onClick()
        println("onClick :overrided optional")
    }
}