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

    fun ifRanges() {
        val x = 10
        val y = 15
        if (x in 1..y) {
            println("$x in ranges")
        }
    }

    fun ifOutOfRanges() {
        val list = listOf("a", "b", "c")
        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        // indices is a collection that is index of the list range(eg: 0...size-1)
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range")
        }
    }
}

fun main() {
    val conditionalExpressions = ConditionalExpressions()
    println(conditionalExpressions.getBiggest(1, 4))
    println(conditionalExpressions.getBiggestWithKotlinGrammar(4, 5))
    conditionalExpressions.ifRanges()
    conditionalExpressions.ifOutOfRanges()
}