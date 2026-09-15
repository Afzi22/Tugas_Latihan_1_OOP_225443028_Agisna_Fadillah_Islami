package inheritance

/**
 * Subclass Kucing. Menambahkan properti [warnaBulu].
 */

class Kucing(
    nama: String,
    umur: Int,
    jenis: String,
    keahlian: String,
    noVaksin: String,
    val warnaBulu: String
) : Hewan3(nama, umur, jenis, keahlian, noVaksin) {

    override fun suara(): String = "Meong!"

    override fun perkenalan() {
        super.perkenalan()
        println("Aku kucing dengan bulu warna $warnaBulu.")
    }
}