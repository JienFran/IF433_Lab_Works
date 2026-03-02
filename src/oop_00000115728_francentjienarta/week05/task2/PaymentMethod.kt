package oop_00000115728_francentjienarta.week05.task2

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}