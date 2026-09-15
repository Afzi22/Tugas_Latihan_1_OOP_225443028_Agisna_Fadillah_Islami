package polymorphism

/**
 * Subclass Kucing. Menambahkan properti [warnaBulu].
 */

class Tupai3(
    nama: String,
    umur: Int,
    keahlian: String,
    noVaksin: String,
    val warnaBulu: String
) : Hewan5(nama, umur, keahlian, noVaksin) {

    override fun biayaPerawatanPerHari(): Double = 5_000.0
    override fun jenisHewan(): String = "Tupai"
    override fun makananFavorit(): String = "Kacang"

    override fun perkenalan() {
        super.perkenalan()
        println("Aku Tupai dengan bulu warna $warnaBulu.")
    }
}