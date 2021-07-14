data class PersonKotlin(var name: String, var age: Int)

fun main() {
    val anish1 = PersonKotlin("Anish", 28)
    println(anish1)

    val anish2 = PersonJava("Anish", 28)
    println(anish2)
}