# Concatenación de strings

## Problema
Este programa muestra una cantidad total de personas en una fiesta. Entre ellas, hay adultos y niños.
````kotlin
fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
````

## Instrucciones
- ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
- ¿Puedes encontrar el problema del código y corregirlo de modo que imprima este resultado?

## Objetivo
- Aprender a concatenar strings en Kotlin.

## Solución
1. Cambiar el tipo de las variables `numberOfAdults` y `numberOfKids` de `String` a `Int`.
````kotlin
fun concatenateStrings() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
````
2. Otra solución es convertir las variables `numberOfAdults` y `numberOfKids` a `Int` en la operación de suma.
````kotlin
fun concatenateStrings() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults.toInt() + numberOfKids.toInt()
    println("The total party size is: $total")
}
````