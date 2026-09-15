package sealed_class

/**
 * Sealed class untuk merepresentasikan status adopsi hewan.
 * Semua subclass didefinisikan di file yang sama.
 */

sealed class StatusAdopsi {

    abstract fun deskripsi(): String
    open fun isFinal(): Boolean = false

    object Tersedia : StatusAdopsi() {
        override fun deskripsi() = "🟢 Tersedia untuk diadopsi"
    }

    data class Diajukan(val namaCalon: String) : StatusAdopsi() {
        override fun deskripsi() = "🟡 Sedang diajukan oleh $namaCalon"
    }

    data class SudahDiadopsi(val tanggal: String) : StatusAdopsi() {
        override fun deskripsi() = "✅ Sudah diadopsi pada $tanggal"
        override fun isFinal(): Boolean = true
    }

    object Dibatalkan : StatusAdopsi() {
        override fun deskripsi() = "❌ Adopsi dibatalkan"
        override fun isFinal(): Boolean = true
    }
}