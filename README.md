# PM6_room_230104040119

# Praktikum Mobile Programming 6
## SQLite menggunakan Room ORM

Nama  : Amilia Zannahtul Putria  
NIM   : 230104040119  
Prodi : Teknologi Informasi  

---

## Deskripsi
Praktikum ini bertujuan untuk memahami penggunaan database lokal
pada aplikasi Android menggunakan **SQLite** dengan bantuan
**Room ORM** sebagai abstraction layer.

---

## Konsep yang Dipelajari
- Entity pada Room Database
- DAO (Data Access Object)
- RoomDatabase
- Repository Pattern
- Struktur project Android dengan Room

---

## Tools & Teknologi
- Kotlin
- SQLite
- Room ORM
- Jetpack Compose
- GitHub

---

## Struktur Project
app/src/main/java/id/antasari/p6room_230104040119
├── MainActivity.kt
├── data
│ ├── local
│ │ ├── entity
│ │ │ └── NoteEntity.kt
│ │ ├── dao
│ │ │ └── NoteDao.kt
│ │ └── database
│ │ └── AppDatabase.kt
│ └── repository
│ └── NoteRepository.kt
└── ui
└── screens
└── NoteScreen.kt


---

## Penjelasan File
- **NoteEntity.kt**  
  Digunakan sebagai representasi tabel pada database SQLite.

- **NoteDao.kt**  
  Berisi fungsi untuk mengakses database seperti insert dan query data.

- **AppDatabase.kt**  
  Merupakan database utama yang menghubungkan Entity dan DAO.

- **NoteRepository.kt**  
  Digunakan sebagai penghubung antara data dan UI.

- **NoteScreen.kt**  
  Halaman antarmuka untuk menampilkan dan mengelola data catatan.

---

## Screenshot
Screenshot kode program dan struktur project dilampirkan sebagai
bukti pengerjaan praktikum.


---

## Catatan Pengerjaan
Praktikum ini dikerjakan menggunakan **perangkat HP**, sehingga
tidak memungkinkan untuk menjalankan Android Studio maupun emulator.

Fokus pengerjaan diarahkan pada:
- Penyusunan struktur project
- Penulisan kode sesuai modul
- Pemahaman konsep Room Database
- 
