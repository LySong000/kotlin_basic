package basic.grammar

class ConditionalExpressions {

    fun getBiggest(x: Int, y: Int): Int {
        if (x > y) {
            return x
        }
        return y
    }

    fun getBiggestWithKotlinGrammar(x: Int, y: Int): Int {
        return if (x > y) x else y
    }

}

fun main() {
    val conditionalExpressions = ConditionalExpressions()
    println(conditionalExpressions.getBiggest(1, 4))
    println(conditionalExpressions.getBiggestWithKotlinGrammar(4, 5))
}