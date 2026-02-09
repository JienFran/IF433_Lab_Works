package oop_00000115728_francentjienarta.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (dalam hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("")
        duration = 1
    }

    val loan = Loan (title, borrower, duration)

    println("Detail Pinjaman")
    println("Judul Buku     : ${loan.bookTitle}")
    println("Peminjam       : ${loan.borrower}")
    println("Lama Pinjam    : ${loan.loanDuration} hari")
    println("Total Denda    : Rp. ${loan.calculateFine()}")
}