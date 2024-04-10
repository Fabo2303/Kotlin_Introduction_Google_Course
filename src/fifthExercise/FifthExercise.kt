package fifthExercise

fun formatMessage() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    val totalSalaryInt = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalaryInt (additional bonus).")
}

fun main() {
    formatMessage()
}