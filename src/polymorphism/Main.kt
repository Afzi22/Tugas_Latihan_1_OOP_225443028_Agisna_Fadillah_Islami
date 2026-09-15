package polymorphism

fun main() {

    val daftarHewan: List<Hewan5> = listOf(
        Kucing3("Ayuri", 9, "Berlari", "VX-002", "Orange"),
        Elang3("Rapi", 10, "Memangsa", "VX-004", "harpy"),
        Garuda3("Agis", 8, "Menjaga", "VX-003", true),
        Tupai3("Salsa", 7, "Memanjat", "VX-001", "Hijau")
    )

    println("=== BIAYA PERAWATAN (POLYMORPHIC) ===")
    daftarHewan.forEach { h ->
        println("${h.nama} (${h.jenisHewan()}): Rp ${h.biayaPerawatanPerHari()}/hari")
    }
    
    println("\n=== SMART CAST DENGAN `is` ===")
    daftarHewan.forEach { h ->
        when (h) {
            is Kucing3 -> println("${h.nama} → Kucing warna bulu ${h.warnaBulu}")
            is Elang3 -> println("${h.nama} → Elang ras ${h.ras}")
            is Garuda3 -> {
                val status = if (h.bisaTerbang) "bisa" else "tidak bisa"
                println("${h.nama} → Garuda, $status terbang")
            }
            is Tupai3 -> println("${h.nama} → Tupai warna bulu ${h.warnaBulu}")
            else -> println("${h.nama} → Jenis tidak dikenal")
        }
    }
    
    println("\n=== SAFE CAST `as?` ===")
    val hewanPertama = daftarHewan[0]
    val sebagaiGaruda: Garuda3? = hewanPertama as? Garuda3
    println("Coba cast Ayuri ke Elang: ${sebagaiGaruda ?: "GAGAL — hasil null"}")

    val sebagaiKucing: Kucing3? = hewanPertama as? Kucing3
    println("Coba cast Ayuri ke Kucing: ${sebagaiKucing?.warnaBulu ?: "GAGAL"}")
}