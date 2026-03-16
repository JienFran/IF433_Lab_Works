package oop_00000115728_francentjienarta.week07.tugasmandiri

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiaplah untuk bertarung!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("Kamu dapat loot: ${item.name}, Rarity: ${item.rarity}")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Berada di Safe Zone. Kamu aman dari monster.")
        }
    }
}