package oop_00000115728_francentjienarta.week10.tugasmandiri

interface NamedEntity {
    val name: String
}

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            it is NamedEntity && it.name.contains(keyword, ignoreCase = true)
        }
    }
}