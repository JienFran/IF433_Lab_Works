package oop_00000115728_francentjienarta.week05.task1

fun main() {

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    val luasPersegiPanjang = mathHelper.hitungLuas(10, 4)
    val luasLingkaran = mathHelper.hitungLuas(14.0)

    println("Luas Persegi = $luasPersegi")
    println("Luas Persegi Panjang = $luasPersegiPanjang")
    println("Luas Lingkaran = $luasLingkaran")
}