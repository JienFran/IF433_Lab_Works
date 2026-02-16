package oop_00000115728_francentjienarta.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name attacked $targetName!")
    }
    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }
    fun isAlive(): Boolean {
        return hp > 0
    }
}
