package sixthExercise

fun basicMathOperationsWithoutAdd() {
    val firstNumber = 10
    val secondNumber = 5

    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")
}

fun basicMathOperationsWithAdd() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

fun basicMathOperationsWithSubtract() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val subtractResult = subtract(firstNumber, secondNumber)
    val anotherSubtractResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $subtractResult")
    println("$firstNumber - $thirdNumber = $anotherSubtractResult")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun main() {
    basicMathOperationsWithoutAdd()
    basicMathOperationsWithAdd()
    basicMathOperationsWithSubtract()
}