fun main() {

    abCalculation()
    abCalculation1()
    abCalculation2()

}

fun abCalculation() {

    val a: Int = 34
    val b: Float = 45F

    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")
}

fun abCalculation1() {

    val a: Int = 40
    val b: Int = 39

    var answer: Int = a + b

    answer += 2
    println("answer +2 = $answer")

    answer -= 2
    println("answer -2 = $answer")

    answer *= 2
    println("answer *2 = $answer")

    answer /= 2
    println("answer /2 = $answer")

    answer %= 2
    println("answer %2 = $answer")

}

fun abCalculation2() {

    val a: Int = 34
    val b: Int = 90

    var answer: Int = a + b

    answer = answer + 2
    println("answer + 2 = $answer")

    answer = answer - 2
    println("answer - 2 = $answer")

    answer = answer * 2
    println("answer * 2 = $answer")

    answer = answer / 2
    println("answer / 2 = $answer")

    answer = answer % 2
    println("answer % 2 = $answer")


}