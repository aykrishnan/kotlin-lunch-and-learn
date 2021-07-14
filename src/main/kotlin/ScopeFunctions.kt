class Animal(private val name: String, var age: Int, val species: String) {
    constructor(name: String, species: String) : this(name, 0, species)  // Secondary constructor

    fun move() = println("$name is moving...")
    fun eat() = println("$name is eating...")
}

fun main() {

    // Both apply() and also() return the context object
    val snail = Animal(name = "Gary", species = "Sea snail")
        .apply { age = 22; eat() }  // Implicit "this"
        .also { it.move() }
    with(snail) {
        move()
        eat()
        age = 50
    }


    val animalList = mutableListOf(
        snail,
        Animal("Patrick", "Sea star"),
        Animal("Eugene", "Crab"),
        Animal("Sheldon", "Zooplankton")
    )
    val squirrel = Animal("Sandy", "Squirrel")

    // Both run() and let() return the lambda result
    animalList
        .run {
            println("Checking if list has a squirrel...")
            contains(squirrel)  // Implicit "this"
        }
        .let { containsSquirrel ->
            when (containsSquirrel) {
                true -> println("List contains Sandy the squirrel")
                false -> println("List does not contain Sandy the squirrel")
            }
        }


    // run() can be called independently
    val whale: Animal = run {
        println("Creating whale...")
        val name = "Pearl"
        val species = "Humpback whale"

        Animal(name, species)
    }
}
