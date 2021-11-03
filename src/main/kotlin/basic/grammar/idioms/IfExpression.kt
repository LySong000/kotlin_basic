package basic.grammar.idioms

class IfExpression {

    fun ifExpression(param: Int): String {
        val result = if (param == 1) {
            "I am one"
        }else if (param == 2) {
            "I am two"
        }else {
            "I am the other number"
        }
        return result
    }

}

fun main() {
    val ifExpression = IfExpression()
    println(ifExpression.ifExpression(1))
}