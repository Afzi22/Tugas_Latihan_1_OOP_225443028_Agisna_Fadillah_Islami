package mini_project

/**
 * Calon pemilik hewan (analog dengan "Member" di perpustakaan).
 */

class CalonPemilik(
    val id: String,
    val nama: String,
    private val email: String,
    private val telepon: String
) {
    private val riwayatAdopsi: MutableList<Adopsi> = mutableListOf()

    val jumlahAdopsi: Int get() = riwayatAdopsi.size
    val adopsiAktif: Int get() = riwayatAdopsi.count { !it.status.isFinal() }

    fun getEmail(): String = email
    fun getTelepon(): String = telepon

    /**
     * Ajukan adopsi hewan. Return [Adopsi] jika berhasil, null jika gagal.
     */
    fun ajukanAdopsi(hewan: Hewan7): Adopsi? {
        if (!hewan.tersedia) {
            println("❌ ${hewan.nama} sedang tidak tersedia.")
            return null
        }
        if (adopsiAktif >= 2) {
            println("❌ $nama sudah punya 2 adopsi aktif. Selesaikan dulu.")
            return null
        }
        if (!hewan.ajukanAdopsi()) return null

        val adopsi = Adopsi("ADP-${System.currentTimeMillis()}", hewan, this)
        riwayatAdopsi.add(adopsi)
        println("✅ $nama berhasil mengajukan adopsi ${hewan.nama}.")
        return adopsi
    }

    fun displayInfo() {
        println("[$id] $nama | $email | $telepon")
        println("   Total adopsi: $jumlahAdopsi | Aktif: $adopsiAktif")
    }

    fun displayTransaksi() {
        println("\n--- Riwayat Adopsi: $nama ---")
        if (riwayatAdopsi.isEmpty()) {
            println("  (belum ada)")
        } else {
            riwayatAdopsi.forEach { it.display() }
        }
    }
}