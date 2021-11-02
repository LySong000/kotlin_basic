package basic.grammar.idioms

import java.io.File

class NullCheck {

    fun notNullShorthand() {
        val listFiles = File("Test").listFiles()
        println(listFiles?.size)
    }

    fun notNullElse() {
        val listFiles = File("Test").listFiles()
        println(listFiles?.size ?: "I am null")
    }
}

fun main() {
    val nullCheck = NullCheck()
    nullCheck.notNullShorthand()
    nullCheck.notNullElse()
}