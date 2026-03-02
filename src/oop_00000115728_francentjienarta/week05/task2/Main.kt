package oop_00000115728_francentjienarta.week05.task2

fun main() {
    val ewallet = EWallet("GoPay", 50000.0)
    val creditCard = CreditCard("BCA Kredit", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (method in paymentMethods) {
        println("Pembayaran 75000 menggunakan ${method.accountName}")
        method.processPayment(75000.0)

        if (method is EWallet) {
            println("Melakukan top up karena saldo kurang.")
            method.topUp(50000.0)
            println("Retry pembayaran.")
            method.processPayment(75000.0)
        }

        println("------------------------------------------------------------")
    }
}