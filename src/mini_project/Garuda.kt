package mini_project

class Garuda7(
    id: String,
    nama: String,
    umur: Int,
    keahlian: String,
    val bisaTerbang: Boolean
) : Hewan7(id, nama, umur, keahlian) {

    override fun biayaPerawatanHarian() = 5_000_000.0
    override fun jenisHewan() = "Garuda"

    override fun displayInfo() {
        super.displayInfo()
        val tb = if (bisaTerbang) "bisa" else "tidak bisa"
        println("     $tb terbang")
    }
}