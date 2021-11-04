package basic.grammar.idioms

class SwapTwoVariables {

    fun swap() {
        var a = 1
        var b = 2
        println("Before")
        println("a = $a, b = $b")
        println("After")
        a = b.also { b = a }
        println("a = $a, b = $b")
    }
}

fun main() {
    val swapTwoVariables = SwapTwoVariables()
    swapTwoVariables.swap()
}