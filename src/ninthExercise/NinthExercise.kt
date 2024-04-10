package ninthExercise

fun compareMinutesUsedTodayWithYesterday(minutesUsedToday: Int, minutesUsedYesterday: Int): Boolean {
    return minutesUsedToday > minutesUsedYesterday
}

fun compareMinutesUsedTodayWithYesterday() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    println(compareMinutesUsedTodayWithYesterday(timeSpentToday, timeSpentYesterday))

    val timeSpentToday2 = 300
    val timeSpentYesterday2 = 300
    println(compareMinutesUsedTodayWithYesterday(timeSpentToday2, timeSpentYesterday2))

    val timeSpentToday3 = 200
    val timeSpentYesterday3 = 220
    println(compareMinutesUsedTodayWithYesterday(timeSpentToday3, timeSpentYesterday3))
}

fun main() {
    compareMinutesUsedTodayWithYesterday()
}