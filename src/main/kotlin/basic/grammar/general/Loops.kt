package basic.grammar.general

class Loops {

    val users = listOf<String>("Tom", "Jerry", "George", "Tony", "Tim")

    fun forLoop() {
        for (user in users) {
            println(user)
        }
    }

    fun collectionOperation() {
        users.filter { it.startsWith("T") }
            .sortedBy { it }
            .map { it + "Test" }
            .forEach { println(it) }
    }

    fun whileLoop() {
        var index = 0
        while (index < users.size) {
            println(users[index])
            index++
        }
    }

    fun loopRanges() {
        for (index in 1..5) {
            println(index)
        }
    }

    fun loopDownTo() {
        for (index in 9 downTo 0) {
            println(index)
        }
    }

    fun loopStep() {
        for (index in 0..9 step 3) {
            println(index)
        }
    }

}

fun main() {
    val loops = Loops()
    println("Here is for loop")
    loops.forLoop()
    println("Here is while loop")
    loops.whileLoop()
    println("Here is loop ranges")
    loops.loopRanges()
    println("Here is loop down to")
    loops.loopDownTo()
    println("Here is loop step")
    loops.loopStep()
    println("Here is collection operation")
    loops.collectionOperation()
}