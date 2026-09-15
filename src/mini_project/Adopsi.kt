package mini_project

import java.time.LocalDate

/**
 * Merepresentasikan satu proses adopsi.
 */

class Adopsi(
    val id: String,
    val hewan: Hewan7,
    val pemilik: CalonPemilik,
    val tanggal: String = LocalDate.now().toString()
) {
    var status: StatusAdopsi = StatusAdopsi.Tersedia

    fun finalisasi(): Boolean {
        if (status.isFinal()) {
            println("❌ Adopsi #$id sudah final, tidak bisa difinalisasi lagi.")
            return false
        }
        status = StatusAdopsi.SudahDiadopsi(tanggal)
        println("🎉 ${hewan.nama} resmi diadopsi oleh ${pemilik.nama}!")
        return true
    }

    fun batalkan() {
        if (status.isFinal()) {
            println("❌ Adopsi #$id sudah final, tidak bisa dibatalkan.")
            return
        }
        status = StatusAdopsi.Dibatalkan
        hewan.batalkanAdopsi()
    }

    fun display() {
        println("Adopsi #$id | Hewan: ${hewan.nama} | Pemilik: ${pemilik.nama}")
        println("  Tanggal: $tanggal")
        println("  Status: ${status.deskripsi()}")
    }
}