package oop_00000115728_francentjienarta.week07.tugasmandiri

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Nilai drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Detail Starter Weapon:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")
}