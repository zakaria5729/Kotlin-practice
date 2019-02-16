fun main(args: Array<String>) {
    var range1 = 1..5
    //This range contains the number 1 2 3 4 5

    range1 = 1.rangeTo(5)
    //This range contains the number 1 2 3 4 5

    var range2 = 5 downTo 1
    //This range contains the number 5 4 3 2 1

    range2 = 5.downTo(1)
    //This range contains the number 5 4 3 2 1

    var range3 = 5 downTo 1 step 2
    //This range contains the number 5 3 1

    var char = 'a'..'z'
    //This range contains the char 'a', 'b' ... 'z'

    var char1 = 'a'.rangeTo('z')
    //This range contains the char 'a', 'b' ... 'z'

    var char2 = 'z'.downTo('a')
    //This range contains the char 'a', 'b' ... 'z'

    var isPresent = 'c' in char2
    println(isPresent)
}