package abstraction

/**
 * Kelas dasar hewan.
 *
 * @property nama Nama hewan.
 * @property umur Umur dalam tahun.
 * @property noVaksin Nomor vaksin (rahasia).
 */

abstract class Hewan4(
    val nama: String,
    val umur: Int,
    val keahlian: String,
    private val noVaksin: String
) {
    var sudahDiVaksin: Boolean = false
        private set

    abstract fun biayaPerawatanPerHari(): Double
    abstract fun jenisHewan(): String
    abstract fun makananFavorit(): String

    fun vaksinasi() {
        sudahDiVaksin = true
        println("✅ $nama divaksin.")
    }

    fun getNoVaksin(): String = noVaksin

    open fun perkenalan() {
        println("Halo, aku $nama, umur $umur tahun, dan aku memiliki keahalian $keahlian")
    }
}