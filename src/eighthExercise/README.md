# Podómetro

## Problema
El podómetro es un dispositivo electrónico que cuenta la cantidad de pasos que se dan. En la actualidad, casi todos los teléfonos celulares, relojes inteligentes y equipos para hacer ejercicio cuentan con podómetros integrados.
````kotlin
fun main() {
    val Steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}
````

## Intrucciones
- ¿Puedes cambiar el nombre de las funciones, de los parámetros de las funciones y de las variables utilizados en este programa según las prácticas recomendadas?

## Objetivo
- Usa nombres descriptivos para funciones, parámetros y variables.
- Mantén todas las letras minúsculas.
- Emplea el inglés para todos los nombres.
- Aplica el estilo camelCase para los nombres.

## Solución
1. Cambiar el nombre de la función `PEDOMETERstepsTOcalories()` a `stepsToCalories()`.
2. Cambiar el nombre del parámetro `NumberOFStepS` a `numberOfSteps`.
3. Cambiar el nombre de la variable `CaloriesBURNEDforEachStep` a `caloriesBurnedForEachStep`.
4. Cambiar el nombre de la variable `TotalCALORIESburned` a `totalCaloriesBurned`.

````kotlin
fun stepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
````