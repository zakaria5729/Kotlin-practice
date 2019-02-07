import java.math.BigInteger

fun main(args: Array<String>) {
    println(getFibonacciNumber(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFibonacciNumber(n: Int, x: BigInteger, y: BigInteger): BigInteger {

    if (n == 0)
        return y
    else
        return getFibonacciNumber(n-1, x+y, x)
}

//tialrec prevent stack overflow error