package basic.grammar.general

class WhenExpression {

    fun whenExpression(obj: Any): String {
        return when (obj) {
            1 -> "One"
            "Hello" -> "Get Hello"
            is Long -> "Is Long"
            !is String -> "Is not String"
            else -> "Unknown"
        }
    }
}

fun main() {
    printResult(1, 1)
    printResult(2, "Hello")
    printResult(3, 1L)
    printResult(4, listOf(1))
    printResult(5, 4.0)
}

private fun printResult(number: Int,obj: Any) {
    val whenExpression = WhenExpression()
    println(number.toString() + "  " + whenExpression.whenExpression(obj))
}