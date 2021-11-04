package basic.grammar.idioms

class Nullable {

    fun ifNullable(boolean: Boolean?): String {
        if (boolean == true) {
            return "Not Null"
        }else {
            return "Is Null"
        }
    }

}

fun main() {
    val nullable = Nullable()
    println(nullable.ifNullable(null))
    println(nullable.ifNullable(true))
}