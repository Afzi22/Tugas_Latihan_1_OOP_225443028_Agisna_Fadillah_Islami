package inheritance

/**
 * Subclass Burung. Menambahkan properti [bisaTerbang].
 */
class Garuda(
    nama: String,
    umur: Int,
    jenis: String,
    keahlian: String,
    noVaksin: String,
    val bisaTerbang: Boolean
) : Hewan3(nama, umur, jenis, keahlian, noVaksin) {

    override fun suara(): String = "Wiwok Thetok!"

    override fun perkenalan() {
        super.perkenalan()
        val tb = if (bisaTerbang) "bisa" else "tidak bisa"
        println("Aku Garuda, $tb terbang.")
    }
}