package abstraction

fun main() {

    val list = listOf(
        Elang2("Rapi", 10, "Memangsa", "VX-004", "harpy"),
        Garuda2("Agis", 8, "Menjaga", "VX-003", true),
        Kucing2("Ayuri", 9, "Berlari", "VX-002", "Orange"),
        Tupai2("Salsa", 7, "Memanjat", "VX-001", "Hijau")
    )

    list.forEach {
        it.perkenalan()
        println(" Makanan favorit: ${it.makananFavorit()}")
        println(" Biaya/hari     : Rp ${it.biayaPerawatanPerHari()}")
        println()
    }
}