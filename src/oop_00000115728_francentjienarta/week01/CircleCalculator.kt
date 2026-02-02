package oop_00000115728_francentjienarta.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius = 7.0
    val pi = 3.14
    // Calculation
    val area = pi * radius * radius
    // Output Concatenation
    println("Radius: $radius, Area: $area")
    // Logic check
    println("This is a ${checkSize(area)} Circle")
}
fun checkSize(area: Double) = if (area > 100) "Big" else "Small"
