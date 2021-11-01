package basic.grammar.idioms

class LazyProperty {

    val p: String by lazy { "Hello" }

}

fun main() {
    val lazyProperty = LazyProperty()
    println(lazyProperty.p)
}