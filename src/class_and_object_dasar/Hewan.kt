package class_and_object_dasar

/**
 * Kelas dasar yang merepresentasikanseekor hewan di Pet Shop.
 *
 * @property nama Nama hewan
 * @property umur Umur hewan dalam tahun
 * @property jenis Jenis hewan
 */

class Hewan1(
    val nama: String,
    val umur: Int,
    val jenis: String,
    val keahlian: String
) {
    fun perkenalan(){
        println("Hai! Namaku $nama, umur $umur, jenis $jenis, dan keahlian $keahlian")
    }
}

