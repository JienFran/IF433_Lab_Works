package oop_00000115728_francentjienarta.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== OBJECT ORIENTED RPG ===")

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Base Damage Hero: ")
    val heroDamage = scanner.nextInt()

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100

    println("\nBattle Starts!")
    println("HP ${hero.name}: ${hero.hp}")
    println("Enemy HP: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- Action ---")
        println("1. Attack")
        println("2. Run")
        print("Pilih: ")
        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                hero.attack("Enemy")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0

                println("Enemy HP tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh menyerang balik! Damage: $enemyDamage")
                    hero.takeDamage(enemyDamage)
                    println("HP ${hero.name} tersisa: ${hero.hp}")
                }
            }

            2 -> {
                println("${hero.name} memilih kabur dari pertarungan!")
                break
            }

            else -> println("Pilihan tidak valid!")
        }
    }

    println("\n=== BATTLE RESULTS ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} menang!")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("Musuh kamu menang!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}

// Mohon maaf pak sebelumnya karena terlambat 7 hari
// Sebelumnya saya sudah commit tepat waktu (Hari H)
// Tapi karena saat mengerjakan tugas week 3 saya melakukan kesalahan
// Tugas week2 jadi kena efeknya juga, beberapa commit jadi salah
// Jadi saya commit ulang beberapa yang salah