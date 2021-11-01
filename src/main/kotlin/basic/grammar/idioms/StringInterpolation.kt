package basic.grammar.idioms

class StringInterpolation {

    fun interpolationPrefix(prefix: String, origin: String): String {
        return "$prefix$origin"
    }

}

fun main() {
    val stringInterpolation = StringInterpolation()
    println(stringInterpolation.interpolationPrefix("Hello", "Tom"))
}