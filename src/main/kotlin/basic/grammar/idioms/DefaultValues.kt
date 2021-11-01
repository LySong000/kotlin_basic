package basic.grammar.idioms

class DefaultValues {

    fun default(a: Int = 1, b: String = "12"): Int {
        return a + b.toInt()
    }

}

fun main() {
    val defaultValues = DefaultValues()
    println(defaultValues.default())
}