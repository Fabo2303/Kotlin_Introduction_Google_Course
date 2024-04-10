# Impresión de mensajes

## Instrucciones
- ¿Puedes escribir una función main() que 
imprima estos mensajes en cuatro líneas separadas?

## Objetivo
- Aprender a imprimir mensajes en pantalla.
- Aprender a usar triple comillas para imprimir mensajes en varias líneas.

## Soluciones
Hay varias soluciones disponibles
1. Usar println() para imprimir cada línea.
````kotlin
fun printMessage() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}
````
2. Usar triple comillas para imprimir todas las líneas en una sola llamada a println().
````kotlin
fun printMessage() {
    val message = """
        Use the val keyword when the value doesn't change.
        Use the var keyword when the value can change.
        When you define a function, you define the parameters that can be passed to it.
        When you call a function, you pass arguments for the parameters.
    """.trimIndent()
    println(message)
}
````