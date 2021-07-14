fun main() {
    val nullableString: String? = null
    println(nullableString?.uppercase())
    println(nullableString!!.uppercase())  // Might throw a NullPointerException
}


