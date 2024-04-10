package eighthExercise

fun stepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun main() {
    val steps = 4000
    val caloriesBurned = stepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}