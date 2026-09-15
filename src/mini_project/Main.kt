package mini_project

fun main() {
    val shop = PetShop("MeowWoof Pet Shop")

    println("\n=== 1. TAMBAH HEWAN ===")
    shop.tambahHewan(
        Kucing7("H001","Ayuri", 9, "Berlari", "Orange"),
        Kucing7("H005","Bocil", 8, "Berlari", "Abu"),
        Elang7("H002","Rapi", 10, "Memangsa", "harpy"),
        Elang7("H006","Kyop", 12, "Memangsa", "harpy"),
        Garuda7("H003","Agis", 9, "Menjaga", true),
        Garuda7("H003","Afzi", 13, "Menjaga", false),
        Tupai7("H004","Salsa", 7, "Memanjat", "Hijau"),
        Tupai7("H004","Ompong", 5, "Memanjat", "Hijau")
    )

    println("\n=== 2. DAFTAR PEMILIK ===")
    shop.daftarPemilik("P001", "Arif", "arif@mail.com", "081111")
    shop.daftarPemilik("P002", "Ikhsan", "ikhsan@mail.com", "082222")
    shop.daftarPemilik("P003", "King", "king@mail.com", "083333")

    shop.displaySemuaHewan()

    println("\n=== 4. ADOPSI ===")
    shop.ajukanAdopsi("P001", "H001")
    shop.ajukanAdopsi("P001", "H003")
    shop.ajukanAdopsi("P002", "H005")
    shop.ajukanAdopsi("P003", "H006")

    shop.displayHewanTersedia()

    shop.displayLaporan()
}