data class Person(val name: String, var age: Int = 0)

fun Person.sayHello() = println("Hello! My name is $name and I am $age years old.")  // Implicit "this"

infix fun Person.greet(otherPerson: Person) = println("Hello, ${otherPerson.name}!")


fun String.formatName(): String {
    return split(" ").joinToString(" ") {
        it.lowercase().replaceFirstChar { firstChar -> firstChar.uppercase() }  // Don't want to reuse "it"
    }
}


fun main() {
    val anish = Person("ANISH KRISHNAN".formatName(), 28)
    anish.sayHello()
    anish greet Person("Mr. President")
}
