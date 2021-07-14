import kotlin.collections.List

fun main() {

    // Creating a list of values [1, 2, 3, 4, 5]
    listOf(1, 2, 3, 4, 5)  // Immutable; implied <Int>
    val myList = mutableListOf(1, 2, 3, 4); myList.add(5)
    (1..5).toList()
    List(5) { index -> index + 1 }  // Alternatively, { it + 1 }
    listOf(1, 2, 3) + listOf(4, 5)
    listOf(0, 1, 2, 3, -1, 4, 5, 6) - listOf(0, -1, 6)


    val emojiList = listOf("😊", "😂", "✌")
    emojiList[2]  // Can also do emojiList.get(2), but retrieval by index is preferred
    emojiList.getOrNull(3)  // Null-safe; returns null

    // Null-safe with default value
    emojiList.getOrElse(3) {
        println("No emoji found at this index!")  // Side effect
        "😢"  // Return value
    }
}
