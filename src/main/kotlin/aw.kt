fun main() {

val y = CALCULATE(12,OPERATION.ADD,2)
val x = CALCULATE(5.667,OPERATION.SUBTRACT,7.8)
val z = CALCULATE(10.25,OPERATION.MULTIPLY, 3)

println("პასუხი: " + y.Calculate())
println("პასუხი: " + x.Calculate())
println("პასუხი: " + z.Calculate())

}


enum class OPERATION{
    ADD,
    MULTIPLY,
    SUBTRACT
}
interface ME {
    fun Calculate():Number
}

open class CALCULATE <T: Number> (Number1: T, vamore: OPERATION, Number2: T):ME {

    val first = Number1
    val second = Number2
    val op = vamore
    lateinit var answer:Number

    override fun Calculate(): Number {
        //თუ ოპერაცია შეკრებაა მეორე რიცხვი გადაიყვანება პირველი რიცხვის ტიპად და იკრიბება
        if (op == OPERATION.ADD) {
            if (first is Int) {
                answer = first.toInt() + second.toInt()
            }
            if (first is Double) {
                answer = first.toDouble() + second.toDouble()
            }
            if (first is Float) {
                answer = first.toFloat() + second.toFloat()
            }
        }
        if (op == OPERATION.SUBTRACT){
            if (first is Int) {
                answer = first.toInt() - second.toInt()
            }
            if (first is Double) {
                answer = first.toDouble() - second.toDouble()
            }
            if (first is Float) {
                answer = first.toFloat() - second.toFloat()
            }
        }
        if (op == OPERATION.MULTIPLY){
            if (first is Int) {
                answer = first.toInt() * second.toInt()
            }
            if (first is Double) {
                answer = first.toDouble() * second.toDouble()
            }
            if (first is Float) {
                answer = first.toFloat() * second.toFloat()
            }
        }
        return answer
    }
}





