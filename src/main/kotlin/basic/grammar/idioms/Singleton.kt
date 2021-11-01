package basic.grammar.idioms

object Singleton {

    var name = "name"

}

fun main() {
    val singleton = Singleton
    val singleton1 = Singleton
    println("First $singleton")
    println("Second $singleton1")
}
