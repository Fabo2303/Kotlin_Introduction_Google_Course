package fourthExercise

fun concatenationString() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    val totalInt = numberOfAdults.toInt() + numberOfKids.toInt()
    println("The total party size is: $totalInt")
}

fun main() {
    concatenationString()
}