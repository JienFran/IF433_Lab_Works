package oop_00000115728_francentjienarta.week14.tugasmandiri
import java.io.File
import java.io.FileWriter

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        FileWriter(file, true).use {
            it.append("$itemName,$finalPrice,$customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(private val repo: OrderRepository, private val notifier: NotificationService) {
    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String,
        pricingStrategy: PricingStrategy
    ) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

fun main() {
    val repository = CsvOrderRepository()
    val notifier = EmailNotifier()
    val processor = SafeOrderProcessor(repository, notifier)
    processor.processOrder(
        "Handphone",
        3700000.0,
        "VIP",
        VipPricing()
    )
}