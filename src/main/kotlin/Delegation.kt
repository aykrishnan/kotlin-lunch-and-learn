
interface Processor {
    val brandName: String
    val modelName: String
    fun execute()
}

class AmdProcessor(override val modelName: String) : Processor {
    override val brandName = "AMD"

    override fun execute() {
        println("$brandName $modelName processor is running...")
    }
}

class IntelProcessor(override val modelName: String) : Processor {
    override val brandName: String
        get() = "Intel"

    override fun execute() {
        println("$brandName $modelName processor is running...")
    }
}

class Computer(private val processor: Processor) : Processor by processor {

    override val brandName = "VIA"  // Won't get accessed by delegate's method
}


fun main() {
    val computerWithAmdProcessor = Computer(AmdProcessor("Ryzen 9 5900X"))
    val computerWithIntelProcessor = Computer(IntelProcessor("Core i9-11900K"))

    computerWithAmdProcessor.execute()
    computerWithIntelProcessor.execute()
}
