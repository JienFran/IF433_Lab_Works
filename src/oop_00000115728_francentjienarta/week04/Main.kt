package oop_00000115728_francentjienarta.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val tesla = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()
}