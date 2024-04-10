# Formato de mensajes

## Problema
Este programa muestra el salario total que recibe un empleado este mes.
````kotlin
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary(additional bonus).")
}
````

## Instrucciones
- ¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
- Cuando ejecutas el código en Kotlin Playground, ¿se imprime el resultado que esperabas?

## Objetivo
- Identificar el error en el código y corregirlo para que el resultado sea el esperado.
- Manejar correctamente el formato de mensajes en Kotlin.

## Solución
1. Quitar las comillas en la variable `totalSalary` para que se realice la suma de los valores de `baseSalary` y `bonusAmount`.
````kotlin
fun formatMessage() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
````
