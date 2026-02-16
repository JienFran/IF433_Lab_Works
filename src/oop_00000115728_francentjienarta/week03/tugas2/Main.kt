package oop_00000115728_francentjienarta.week03.tugas2

fun main() {
    val player = Player("Francent")

    //println(player.xp)

    println("Level awal: ${player.level}")

    println()

    println("Kamu mendapat 50 XP")
    player.addXp(50)
    println("Level sekarang: ${player.level}")

    println()

    println("Kamu mendapat 60 XP")
    player.addXp(60)
    println("Level sekarang: ${player.level}")
}