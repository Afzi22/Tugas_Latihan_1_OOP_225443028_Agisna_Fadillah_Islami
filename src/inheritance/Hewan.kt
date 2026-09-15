package inheritance

/**
 * Kelas dasar hewan.
 *
 * @property nama Nama hewan.
 * @property umur Umur dalam tahun.
 * @property noVaksin Nomor vaksin (rahasia).
 */

open class Hewan3(
    val nama: String,
    val umur: Int,
    val jenis: String,
    val keahlian: String,
    private val noVaksin: String
) {
    var sudahDiVaksin: Boolean = false
        private set

    fun vaksinasi() {
        sudahDiVaksin = true
        println("✅ $nama divaksin.")
    }

    fun getNoVaksin(): String = noVaksin

    open fun perkenalan() {
        println("Halo, aku $nama, umur $umur tahun, jenisku $jenis, dan aku memiliki keahalian $keahlian")
    }

    open fun suara(): String = "..."
}