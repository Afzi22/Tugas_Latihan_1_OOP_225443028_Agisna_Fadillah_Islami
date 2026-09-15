package encapsulation

fun main() {
    val elang = Hewan2("Rapi", 10, "Elang", "Memangsa", "VX-004")
    val garuda = Hewan2("Agis", 8, "Garuda", "Menjaga", "VX-003")
    val kucing = Hewan2("Ayuri", 9, "Kucing", "Berlari", "VX-002")
    val tupai = Hewan2("Salsa", 7, "Tupai", "Memanjat", "VX-001")

    elang.perkenalan()
    garuda.perkenalan()
    kucing.perkenalan()
    tupai.perkenalan()

    println("-----------------------------------")

    elang.vaksinasi()
    garuda.vaksinasi()
    kucing.vaksinasi()
    tupai.vaksinasi()

    println("-----------------------------------")

    elang.perkenalan()
    garuda.perkenalan()
    kucing.perkenalan()
    tupai.perkenalan()

    println("-----------------------------------")

    println("No vaksin ${elang.nama}: ${elang.getNoVaksin()}")
    println("No vaksin ${garuda.nama}: ${garuda.getNoVaksin()}")
    println("No vaksin ${kucing.nama}: ${kucing.getNoVaksin()}")
    println("No vaksin ${tupai.nama}: ${tupai.getNoVaksin()}")

    println("-----------------------------------")

    println("Status baca langsung: ${elang.sudahDiVaksin}")
    println("Status baca langsung: ${garuda.sudahDiVaksin}")
    println("Status baca langsung: ${kucing.sudahDiVaksin}")
    println("Status baca langsung: ${tupai.sudahDiVaksin}")
}