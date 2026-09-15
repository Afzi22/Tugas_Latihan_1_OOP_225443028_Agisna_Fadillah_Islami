# 🐾 MeowWoof Pet Shop Management System

Aplikasi berbasis **CLI (Command Line Interface)** yang dibangun menggunakan bahasa pemrograman **Kotlin** untuk mengelola operasional sebuah Pet Shop fiktif bernama "MeowWoof". 

Aplikasi ini mencakup manajemen inventaris hewan, pendaftaran calon pemilik, pemrosesan transaksi adopsi, hingga pelacakan status adopsi secara *real-time*.

> 📌 **Catatan:** Proyek ini merupakan implementasi akhir (Mini Project) dari latihan terbimbing OOP Kotlin, yang dikembangkan untuk mendemonstrasikan penerapan konsep *Object-Oriented Programming* secara komprehensif dalam satu sistem yang utuh.

---
## 👤 Identitas Pembuat

| Informasi | Keterangan |
|---|---|
| Nama | Agisna Fadillah Islami |
| NIM | 225443028 |
| Program Studi | Teknologi Rekayasa Informatika Industri |
| Jurusan | Teknik Otomasi Manufaktur dan Mekatronika |
| Instansi | Politeknik Manufaktur Bandung (Polman Bandung) |

---

## ✨ Fitur Utama

- 🐾 **Manajemen Inventaris Hewan**  
  Menambahkan dan menampilkan berbagai jenis hewan (Kucing, Elang, Garuda, Tupai) beserta detail dan biaya perawatannya.
- 👤 **Pendaftaran Calon Pemilik**  
  Mendaftarkan data calon adopter dengan validasi ID unik.
- 🤝 **Sistem Transaksi Adopsi**  
  Mengajukan, memfinalisasi, atau membatalkan adopsi hewan. Sistem secara otomatis membatasi jumlah adopsi aktif per pemilik.
- 🚦 **Pelacakan Status (State Machine)**  
  Memantau status hewan dan transaksi adopsi secara akurat menggunakan *Sealed Class*.
- 📊 **Laporan Statistik**  
  Menampilkan ringkasan operasional Pet Shop (total hewan, hewan tersedia, total adopsi, dll).

---

## 🧠 Konsep OOP & Fitur Kotlin yang Diimplementasikan

Proyek ini dirancang untuk memaksimalkan penggunaan fitur-fitur modern Kotlin dan 4 pilar OOP:

| Konsep | Implementasi dalam Proyek |
|---|---|
| **Abstraction & Inheritance** | `Hewan` sebagai *abstract class* yang diturunkan menjadi `Kucing`, `Elang`, `Garuda`, dan `Tupai`. |
| **Encapsulation** | Properti `tersedia` pada hewan menggunakan `private set` agar statusnya hanya bisa diubah melalui method bisnis yang valid (`ajukanAdopsi`, `batalkanAdopsi`). |
| **Polymorphism** | *Override* method `biayaPerawatanHarian()`, `jenisHewan()`, dan `displayInfo()` pada setiap subclass. Penggunaan *Smart Casting* (`is`, `as?`) untuk memproses daftar hewan campuran. |
| **Sealed Class** | Pemodelan `StatusAdopsi` (`Tersedia`, `Diajukan`, `SudahDiadopsi`, `Dibatalkan`) untuk menjamin *exhaustive when-checking* dan mencegah status yang tidak valid. |

---

## 🧩 Aturan Bisnis (Business Rules)

1. **Biaya Perawatan Harian**  
   Setiap jenis hewan memiliki tarif perawatan per hari yang berbeda:
   - 🐱 **Kucing**: Rp 50.000
   - 🦅 **Elang**: Rp 500.000
   - 🐦 **Garuda**: Rp 5.000.000
   - 🐿️ **Tupai**: Rp 5.000

2. **Batas Adopsi**  
   Setiap `CalonPemilik` dibatasi maksimal memiliki **2 adopsi aktif** (status belum final) pada satu waktu.

3. **Ketersediaan Hewan**  
   Hewan yang sedang dalam proses adopsi (status `Diajukan` atau `SudahDiadopsi`) tidak dapat diajukan oleh calon pemilik lain.

---

## 🔄 Alur Status Adopsi (Sealed Class)

Status adopsi dimodelkan menggunakan `sealed class` untuk memastikan keamanan tipe data (*type-safety*):

| Status | Tipe Kotlin | Keterangan | Final? |
|---|---|---|:---:|
| `Tersedia` | `object` | Hewan ada di Pet Shop dan siap diadopsi. | ❌ |
| `Diajukan` | `data class` | Hewan sedang dalam proses pengajuan oleh calon tertentu. | ❌ |
| `SudahDiadopsi` | `data class` | Transaksi sukses, hewan resmi berpindah tangan. | ✅ |
| `Dibatalkan` | `object` | Proses adopsi dibatalkan, hewan kembali tersedia. | ✅ |

---

## 📁 Struktur Proyek

```text
src/petshop/
├── Main.kt               # Entry point & skenario pengujian sistem
├── Hewan.kt              # Abstract class dasar
├── Kucing.kt             # Subclass Kucing
├── Elang.kt              # Subclass Elang
├── Garuda.kt             # Subclass Garuda
├── Tupai.kt              # Subclass Tupai
├── StatusAdopsi.kt       # Sealed class untuk state machine
├── Adopsi.kt             # Class logika transaksi
├── CalonPemilik.kt       # Class data adopter
└── PetShop.kt            # Class utama (Facade) pengelola sistem
```

---

## 🚀 Cara Menjalankan

### 1. Melalui IDE (Rekomendasi)
1. Clone repository ini.
2. Buka proyek menggunakan **IntelliJ IDEA**.
3. Tunggu hingga proses *indexing* dan *sync* selesai.
4. Buka file `src/petshop/Main.kt`.
5. Klik ikon **Run (▶️)** di sebelah fungsi `main()`.

### 2. Melalui Terminal / CLI
Pastikan Kotlin Compiler (`kotlinc`) dan Java Runtime (`java`) sudah terinstal di sistem Anda.

```bash
# Kompilasi seluruh file ke dalam JAR
kotlinc src/petshop/*.kt -include-runtime -d meowwoof.jar

# Jalankan aplikasi
java -jar meowwoof.jar
```

---

## 🙏 Referensi & Acknowledgment

Struktur arsitektur dan studi kasus awal dari proyek ini beracu pada **Modul Latihan Terbimbing OOP Kotlin (Studi Kasus: Sistem Manajemen Pet Shop)**. Proyek ini dikembangkan lebih lanjut dengan penyesuaian domain hewan, aturan bisnis, dan implementasi kode mandiri untuk memenuhi standar tugas Pemrograman Berbasis Objek.

---

## 📄 Lisensi

Proyek ini dibuat untuk keperluan portofolio dan pemenuhan tugas mata kuliah **Pemrograman Berbasis Objek (OOP)**.
