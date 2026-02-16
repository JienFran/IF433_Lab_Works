package oop_00000115728_francentjienarta.week03.tugas1

fun main(){
    val w = Weapon("Katana")
    w.damage = -50
    w.damage = 9999
    println("Tier ${w.name} adalah ${w.tier} dengan damage ${w.damage}")
}