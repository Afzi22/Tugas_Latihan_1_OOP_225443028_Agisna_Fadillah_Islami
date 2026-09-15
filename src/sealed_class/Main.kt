package sealed_class

fun main() {
    val daftarStatus: List<StatusAdopsi> = listOf(
        StatusAdopsi.Tersedia,
        StatusAdopsi.Diajukan("Budi"),
        StatusAdopsi.SudahDiadopsi("2024-05-01"),
        StatusAdopsi.Dibatalkan
    )

    println("=== DEMO SEALED CLASS ===")
    daftarStatus.forEach { s ->
        // `when` EKSHAUSTIF — TANPA `else`!
        val info = when (s) {
            is StatusAdopsi.Tersedia -> "Belum ada calon"
            is StatusAdopsi.Diajukan -> "Calon: ${s.namaCalon}"
            is StatusAdopsi.SudahDiadopsi -> "Tanggal: ${s.tanggal}"
            is StatusAdopsi.Dibatalkan -> "Tidak ada adopsi"
        }
        println("${s.deskripsi()} | $info | final=${s.isFinal()}")
    }
}