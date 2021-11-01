package basic.grammer

class Object(var x: Double, var y: Double) {
    var sum = x + y
}

fun main(args: Array<String>) {
    val objectTest = Object(2.0, 4.0)
    println(objectTest.sum)
}