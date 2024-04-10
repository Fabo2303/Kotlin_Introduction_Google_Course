# Movimiento del código duplicado a una función

## Problema
En este programa, se muestra el clima de diferentes ciudades. Incluye el nombre de la ciudad, las temperaturas máxima y mínima del día, y las probabilidades de lluvia.
````kotlin
fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()

    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()

    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}
````

## Intrucciones
- ¿Puedes crear una función que imprima los detalles del clima de una sola ciudad para reducir la repetición en la función main() y, luego, hacer lo mismo en las ciudades restantes?
- ¿Puedes actualizar la función main() a fin de llamar a la función que creaste para cada ciudad y pasar los detalles apropiados del clima como argumentos?

## Objetivo
- Identificar el código duplicado en un programa.
- Mover el código duplicado a una función.

## Solución
1. Definir la función `printWeather()` que reciba un parámetro de tipo `String`, tres de tipo `Int` y devuelva un valor de tipo `Unit`.
````kotlin
fun printWeather(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}

fun printWeatherForCities() {
    printWeather("Ankara", 27, 31, 82)
    printWeather("Tokyo", 32, 36, 10)
    printWeather("Cape Town", 59, 64, 2)
    printWeather("Guatemala City", 50, 55, 7)
}
````
