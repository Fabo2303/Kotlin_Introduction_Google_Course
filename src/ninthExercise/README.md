# Comparación de dos números

## Problema
En este ejercicio, implementarás una función que compara la cantidad de minutos que usaste el teléfono hoy y ayer. La función acepta dos parámetros de números enteros y muestra un valor booleano.

El primer parámetro contiene la cantidad de minutos de uso de hoy, y el segundo, la cantidad de minutos de uso de ayer. La función muestra un valor true si pasaste más tiempo en el teléfono hoy que ayer. De lo contrario, muestra un valor false.

## Intrucciones
- ¿Puedes implementar la función `comparePhoneUsage()` en este programa de modo que imprima el resultado que se muestra?

## Objetivo
- Usar funciones con parámetros de tipo `Int`.
- Usar funciones con valores de retorno de tipo `Boolean`.
- Usar operadores de comparación en funciones.
- Usar funciones con expresiones condicionales.

## Solución
1. Definir la función `compareMinutesUsedTodayWithYesterday()` que reciba dos parámetros de tipo `Int` y devuelva un valor de tipo `Boolean`.
````kotlin
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
````
