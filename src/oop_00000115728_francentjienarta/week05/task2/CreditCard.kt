package oop_00000115728_francentjienarta.week05.task2

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sukses. Terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak, melebihi limit")
        }
    }
}