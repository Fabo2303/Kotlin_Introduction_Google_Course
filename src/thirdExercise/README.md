# Plantillas de strings

## Problema
Este programa informa a los usuarios sobre la próxima oferta promocional de un artículo en particular.
````kotlin
fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
````

## Instrucciones
- ¿Puedes determinar la causa raíz de esos errores y corregirlos?
- ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?

## Objetivo
- Aprender a utilizar las plantillas de strings en Kotlin.

## Solución
1. Cambiar las variables `discountPercentage` y `offer` de `val` a `var`.
````kotlin
fun templateString() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
````