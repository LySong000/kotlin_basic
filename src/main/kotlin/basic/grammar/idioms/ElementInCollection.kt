package basic.grammar.idioms

class ElementInCollection {

    fun checkElementInCollection(element: String, list: Array<String>): Boolean {
        if (element in list) {
            return true
        }
        return false
    }

}

fun main() {
    val elementInCollection = ElementInCollection()
    println(elementInCollection.checkElementInCollection("Tom", arrayOf("Tom", "Tony")))
}