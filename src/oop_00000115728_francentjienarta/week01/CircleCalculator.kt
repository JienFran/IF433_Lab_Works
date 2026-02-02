package oop_00000115728_francentjienarta.week01

fun main() {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius
    println("Radius: $radius, Area: $area")
    println("This is a ${checkSize(area)} Circle")
}
fun checkSize(area: Double) = if (area > 100) "Big" else "Small"
