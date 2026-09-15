package encapsulation

/**
 * Kelas dasar hewan dengan penerapan enkapsulasi.
 *
 * @property nama Nama hewan.
 * @property umur Umur hewan dalam tahun.
 * @property jenis Jenis hewan.
 * @property noVaksin Nomor vaksin (rahasia — hanya bisa diakses via [getNoVaksin]).
 */

class Hewan2(
    val nama: String,
    val umur: Int,
    val jenis: String,
    val keahlian: String,
    private val noVaksin: String
) {
    var sudahDiVaksin: Boolean = false
        private set

    fun vaksinasi() {
        if (sudahDiVaksin) {
            println("$nama sudah pernah divaksin.")
        } else {
            sudahDiVaksin = true
            println("$nama berhasil divaksin!")
        }
    }

    fun getNoVaksin(): String = noVaksin

    fun perkenalan() {
        val status = if (sudahDiVaksin) "sudah" else "belum"
        println("Halo! $nama ($jenis), $umur th, $keahlian, $status divaksin.")
    }
}