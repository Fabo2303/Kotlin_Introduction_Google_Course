# Parámetros predeterminados

## Problema
En este ejercicio, escribirás un programa que muestra un mensaje a los usuarios con esta plantilla de mensaje:
`There's a new sign-in request on operatingSystem for your Google Account emailId.`

````kotlin
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}
````

````kotlin
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
````

## Intrucciones
- ¿Puedes implementar la función displayAlertMessage() en este programa de modo que imprima el resultado que se muestra?
- ¿Puedes encontrar una manera de optimizar el código con esta información de modo que imprima este resultado?

## Objetivo
- Usar parámetros predeterminados en funciones.
- Usar argumentos con nombre en funciones.

## Solución
1. Definir la función `displayAlertMessage()` que reciba dos parámetros de tipo `String` y devuelva un valor de tipo `String`.
````kotlin
fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
````
2. Definir la función `displayAlertMessage()` que reciba dos parámetros de tipo `String` y devuelva un valor de tipo `String`. Agregar parámetros predeterminados a la función.
````kotlin
fun displayAlertMessage(operatingSystem: String = "operatingSystem", emailId: String = "emailId"): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
````