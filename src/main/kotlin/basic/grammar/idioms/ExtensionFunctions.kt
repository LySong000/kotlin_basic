package basic.grammar.idioms

class ExtensionFunctions {

    fun String.addItself(): String {
        return (this.toInt() + 1).toString()
    }

    fun testExtension() {
        println("1".addItself())
    }
}

fun main() {
    val extensionFunctions = ExtensionFunctions()
    extensionFunctions.testExtension()
}