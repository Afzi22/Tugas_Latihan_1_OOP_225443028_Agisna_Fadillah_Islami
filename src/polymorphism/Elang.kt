package polymorphism

/**
 * Subclass Elang. Menambahkan properti [ras].
 */

class Elang3(
    nama: String,
    umur: Int,
    keahlian: String,
    noVaksin: String,
    val ras: String
) : Hewan5(nama, umur, keahlian, noVaksin) {

    override fun biayaPerawatanPerHari(): Double = 500_000.0
    override fun jenisHewan(): String = "Elang"
    override fun makananFavorit(): String = "Ikan"

    override fun perkenalan() {
        super.perkenalan()
        println("Aku elang ras $ras.")
    }
}