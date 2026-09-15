package inheritance

fun main() {
    val elang = Elang("Rapi", 10, "Elang", "Memangsa", "VX-004", "harpy")
    val garuda = Garuda("Agis", 8, "Garuda", "Menjaga", "VX-003", true)
    val kucing = Kucing("Ayuri", 9, "Kucing", "Berlari", "VX-002", "Orange")
    val tupai = Tupai("Salsa", 7, "Tupai", "Memanjat", "VX-001", "Hijau")

    elang.perkenalan();    println("  Suara: ${elang.suara()}\n")
    garuda.perkenalan();     println("  Suara: ${garuda.suara()}\n")
    kucing.perkenalan();  println("  Suara: ${kucing.suara()}\n")
    tupai.perkenalan();  println("  Suara: ${tupai.suara()}\n")
}