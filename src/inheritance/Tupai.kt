package inheritance

/**
 * Subclass Kucing. Menambahkan properti [warnaBulu].
 */

class Tupai(
    nama: String,
    umur: Int,
    jenis: String,
    keahlian: String,
    noVaksin: String,
    val warnaBulu: String
) : Hewan3(nama, umur, jenis, keahlian, noVaksin) {

    override fun suara(): String = "kicau kicau!"

    override fun perkenalan() {
        super.perkenalan()
        println("Aku Tupai dengan bulu warna $warnaBulu.")
    }
}