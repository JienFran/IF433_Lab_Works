package oop_00000115728_francentjienarta.week01

fun main(){
    val gameTitle: String
    val price: Int

    printReceipt (title = "Cyberpunk 2077", price = 700000)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

fun printReceipt(title: String, price: Int){
    val discount: Int = calculateDiscount(price)
    val finalPrice: Int = price * (100-discount)/100

    val userNote: String? = null
    val text = userNote ?: "Tidak ada catatan"

    println("RECEIPT")
    println("Judul Game     : $title")
    println("Harga Awal     : $price")
    println("Harga Akhir    : $finalPrice")

    println(text)
}