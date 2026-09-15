package inheritance

/**
 * Subclass Anjing. Menambahkan properti [ras].
 */

class Elang(
    nama: String,
    umur: Int,
    jenis: String,
    keahlian: String,
    noVaksin: String,
    val ras: String
) : Hewan3(nama, umur, jenis, keahlian, noVaksin) {

    override fun suara(): String = "Wuuuakkkk!"

    override fun perkenalan() {
        super.perkenalan()
        println("Aku elang ras $ras.")
    }
}