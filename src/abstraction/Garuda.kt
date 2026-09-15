package abstraction

/**
 * Subclass Garuda. Menambahkan properti [bisaTerbang].
 */

class Garuda2(
    nama: String,
    umur: Int,
    keahlian: String,
    noVaksin: String,
    val bisaTerbang: Boolean
) : Hewan4(nama, umur, keahlian, noVaksin) {

    override fun biayaPerawatanPerHari(): Double = 5_000_000.0
    override fun jenisHewan(): String = "Garuda"
    override fun makananFavorit(): String = "-"

    override fun perkenalan() {
        super.perkenalan()
        val tb = if (bisaTerbang) "bisa" else "tidak bisa"
        println("Aku Garuda, $tb terbang.")
    }
}