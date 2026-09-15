package mini_project

/**
 * Kelas utama pengelola Pet Shop.
 */
class PetShop(val nama: String) {
    private val hewanList: MutableList<Hewan7> = mutableListOf()
    private val pemilikList: MutableList<CalonPemilik> = mutableListOf()
    private val adopsiList: MutableList<Adopsi> = mutableListOf()

    val totalHewan: Int get() = hewanList.size
    val hewanTersedia: Int get() = hewanList.count { it.tersedia }
    val totalPemilik: Int get() = pemilikList.size
    val totalAdopsi: Int get() = adopsiList.size

    fun tambahHewan(h: Hewan7) {
        hewanList.add(h)
        println("✅ ${h.nama} ditambahkan ke ${nama}.")
    }

    fun tambahHewan(vararg list: Hewan7) {
        list.forEach { tambahHewan(it) }
    }

    fun daftarPemilik(id: String, nama: String, email: String, telp: String): Boolean {
        if (pemilikList.any { it.id == id }) {
            println("❌ ID $id sudah terdaftar.")
            return false
        }
        pemilikList.add(CalonPemilik(id, nama, email, telp))
        println("✅ Pemilik $nama berhasil didaftarkan.")
        return true
    }

    fun cariHewan(id: String): Hewan7? = hewanList.find { it.id == id }
    fun cariPemilik(id: String): CalonPemilik? = pemilikList.find { it.id == id }

    fun ajukanAdopsi(pemilikId: String, hewanId: String): Adopsi? {
        val p = cariPemilik(pemilikId)
        if (p == null) { println("❌ Pemilik $pemilikId tidak ditemukan."); return null }
        val h = cariHewan(hewanId)
        if (h == null) { println("❌ Hewan $hewanId tidak ditemukan."); return null }

        val adopsi = p.ajukanAdopsi(h) ?: return null
        adopsiList.add(adopsi)
        return adopsi
    }

    fun displaySemuaHewan() {
        println("\n=== DAFTAR HEWAN ===")
        hewanList.forEach { it.displayInfo(); println() }
        println("Total: $totalHewan | Tersedia: $hewanTersedia")
    }

    fun displayHewanTersedia() {
        println("\n=== HEWAN TERSEDIA ===")
        val tersedia = hewanList.filter { it.tersedia }
        if (tersedia.isEmpty()) println("(tidak ada)")
        else tersedia.forEach { println("[$it.id] ${it.nama} (${it.jenisHewan()})") }
    }

    fun displaySemuaPemilik() {
        println("\n=== DAFTAR PEMILIK ===")
        pemilikList.forEach { it.displayInfo(); println() }
    }

    fun displaySemuaAdopsi() {
        println("\n=== SEMUA ADOPSI ===")
        if (adopsiList.isEmpty()) println("(belum ada)")
        else adopsiList.forEach { it.display(); println() }
    }

    fun displayLaporan() {
        println("\n=== LAPORAN PET SHOP ===")
        println("Nama          : $nama")
        println("Total hewan   : $totalHewan")
        println("Hewan tersedia: $hewanTersedia")
        println("Hewan diadopsi: ${totalHewan - hewanTersedia}")
        println("Total pemilik : $totalPemilik")
        println("Total adopsi  : $totalAdopsi")
    }
}