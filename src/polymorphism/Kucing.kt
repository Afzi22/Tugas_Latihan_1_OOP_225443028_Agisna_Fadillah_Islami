package polymorphism

/**
 * Subclass Kucing. Menambahkan properti [warnaBulu].
 */

class Kucing3(
    nama: String,
    umur: Int,
    keahlian: String,
    noVaksin: String,
    val warnaBulu: String
) : Hewan5(nama, umur, keahlian, noVaksin) {

    override fun biayaPerawatanPerHari(): Double = 50_000.0
    override fun jenisHewan(): String = "Kucing"
    override fun makananFavorit(): String = "Oricat"

    override fun perkenalan() {
        super.perkenalan()
        println("Aku kucing dengan bulu warna $warnaBulu.")
    }
}