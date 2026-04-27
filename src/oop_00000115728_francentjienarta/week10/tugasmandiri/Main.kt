package oop_00000115728_francentjienarta.week10.tugasmandiri

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach {
        println("Nama Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TXN001", 100.0))
    txRepo.add(Transaction("TXN002", 250.0))
    txRepo.add(Transaction("TXN003", 500.0))

    println("\nTransactions:")
    txRepo.getAll().forEach {
        println("ID: ${it.id}, Amount: ${it.amount}")
    }
}

//Checkpoint 20