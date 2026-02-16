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

// Mohon maaf pak sebelumnya karena terlambat 7 hari
// Sebelumnya saya sudah commit tepat waktu (Hari H)
// Tapi karena saat mengerjakan tugas week 3 saya melakukan kesalahan
// Tugas week2 jadi kena efeknya juga, beberapa commit jadi salah
// Jadi saya commit ulang beberapa yang salah