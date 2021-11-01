package basic.grammar

class StringTemplates {

    fun printFormat(s: String): String {
        return "Format: $s"
    }

    fun printFormatWithStringFunction(s: String): String {
        return "Format: ${s.uppercase()}"
    }
}

fun main() {
    val stringTemplates = StringTemplates()
    println(stringTemplates.printFormat("Hello String"))
    println(stringTemplates.printFormatWithStringFunction("hello string"))
}