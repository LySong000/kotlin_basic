package basic.grammar

fun sumReturn(x: Int, y: Int): Int {
    return x + y
}

fun sumNotReturn(x: Int, y: Int) {
    println(x + y)
}

fun main(args: Array<String>) {
    println(sumReturn(5, 10))
    sumNotReturn(10, 10)
}