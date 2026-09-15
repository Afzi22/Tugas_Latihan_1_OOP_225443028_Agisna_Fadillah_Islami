package mini_project

class Elang7(
    id: String,
    nama: String,
    umur: Int,
    keahlian: String,
    val ras: String
) : Hewan7(id, nama, umur, keahlian) {

    override fun biayaPerawatanHarian() = 500_000.0
    override fun jenisHewan() = "Elang"

    override fun displayInfo() {
        super.displayInfo()
        println("     Ras: $ras")
    }
}