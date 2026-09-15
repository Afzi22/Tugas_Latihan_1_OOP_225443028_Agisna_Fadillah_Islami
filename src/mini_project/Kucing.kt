package mini_project

class Kucing7(
    id: String,
    nama: String,
    umur: Int,
    keahlian: String,
    val warnaBulu: String
) : Hewan7(id, nama, umur, keahlian) {

    override fun biayaPerawatanHarian() = 50_000.0
    override fun jenisHewan() = "Kucing"

    override fun displayInfo() {
        super.displayInfo()
        println("     Warna bulu: $warnaBulu")
    }
}