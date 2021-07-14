import java.lang.RuntimeException

class Calculator {

    inline fun executeOperation(operationName: String, x: Int, y: Int, operation: (Int, Int) -> Int) {
        println("Executing operation: $operationName")
        println("Inputs: $x, $y")
        println("Output: ${operation(x, y)}")
    }
}

fun addNumbers(a: Int, b: Int): Int { return a + b}

fun getOperation(symbol: String): (Int, Int) -> Int {
    return when (symbol) {
        "+" -> { a, b -> a + b }
        "-" -> { a, b -> a - b }
        "*" -> { a, b -> a * b }
        "/" -> { a, b -> a / b }
        else -> throw RuntimeException("Invalid operation symbol \"$symbol\"")
    }
}

fun main() {
    val calculator = Calculator()
    calculator.executeOperation("Multiplication", 4, 2) { a, b, -> a * b}
    calculator.executeOperation("Addition", 2, 2, ::addNumbers)
    calculator.executeOperation("Subtraction", 8, 2, getOperation("-"))
}
