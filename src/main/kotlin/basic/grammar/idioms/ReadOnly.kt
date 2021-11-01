package basic.grammar.idioms

class ReadOnly {

    fun readOnlyList() {
        val list = listOf("a", "b", "c")
    }

    fun readOnlyMap():Map<String, Int> {
        return mapOf("a" to 1, "b" to 2, "c" to 3)
    }

    fun accessMapEntry(): Int? {
        return readOnlyMap()["a"]
    }
}

fun main() {
    val readOnly = ReadOnly()
    println(readOnly.accessMapEntry())
}