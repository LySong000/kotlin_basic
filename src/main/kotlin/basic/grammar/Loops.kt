package basic.grammar

class Loops {

    val users = listOf<String>("Tom", "Jerry", "George")

    fun forLoop() {
        for (user in users) {
            println(user)
        }
    }

    fun whileLoop() {
        var index = 0
        while (index < users.size) {
            println(users[index])
            index++
        }
    }

}

fun main() {
    val loops = Loops()
    println("Here is for loop")
    loops.forLoop()
    println("Here is while loop")
    loops.whileLoop()
}