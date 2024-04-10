# Corrección de un error de compilación

## Problema
Este programa imprime un mensaje que le notifica al usuario que recibió un mensaje de chat de un amigo.
````kotlin
fun main() {
    println("New chat message from a friend'}
}
````

## Instrucciones
- ¿Puedes determinar la causa raíz de los errores de compilación de este programa y corregirlos?
- ¿El código usa los símbolos apropiados para indicar la apertura y el cierre de la cadena y el argumento de la función?

## Objetivo
- Aprender a corregir errores de compilación.
- Aprender el uso de comillas dobles y simples.

## Solución
1. Cambiar las comillas simples por comillas dobles y corregir el error de sintaxis.
````kotlin
fun main() {
    println("New chat message from a friend")
}
````