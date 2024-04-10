# Implementación de operaciones matemáticas básicas

## Problema
En este ejercicio, escribirás un programa que realice operaciones matemáticas básicas y, luego, imprima el resultado.
````kotlin
fun main() {
    val firstNumber = 10
    val secondNumber = 5

    println("$firstNumber + $secondNumber = $result")
}
````

````kotlin
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}
````

## Instrucciones
- ¿Puedes corregir el error de modo que el programa imprima este resultado?
- ¿Puedes definir la función add() de modo que el programa imprima este resultado?
- ¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()? Modifica la función main() también para usar la función subtract(), de modo que puedas verificar que funcione como se espera.

## Objetivos
- Usar operadores aritméticos.

## Solución
1. Agregar una variable `result` que almacene el resultado de la suma de `firstNumber` y `secondNumber`.
````kotlin
fun basicMathOperationsWithoutAdd() {
    val firstNumber = 10
    val secondNumber = 5

    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")
}
````
2. Definir la función `add()` que reciba dos parámetros de tipo `Int` y devuelva un valor de tipo `Int`.
````kotlin
fun add(a: Int, b: Int): Int {
    return a + b
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
````
3. Definir la función `subtract()` que reciba dos parámetros de tipo `Int` y devuelva un valor de tipo `Int`.
````kotlin
fun subtract(a: Int, b: Int): Int {
    return a - b
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
````