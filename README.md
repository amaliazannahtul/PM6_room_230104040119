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

![1000288881](https://github.com/user-attachments/assets/5cd1bc7e-7986-4249-99da-773f667e9b8b)
![1000288880](https://github.com/user-attachments/assets/898d48c0-c721-4984-86aa-9f0a242afdc7)
![1000288879](https://github.com/user-attachments/assets/39f5f7d9-fa0f-40a2-bfdd-8c183579540c)
![1000288878](https://github.com/user-attachments/assets/031c8dcb-8f0f-4271-ac1e-6ec4ec1581e3)
![1000288877](https://github.com/user-attachments/assets/0672366f-2d23-4d8b-a7a2-8e593a63cda5)
![1000288876](https://github.com/user-attachments/assets/dcbf8517-5df3-49ec-ac36-85d8fce7dae1)
![1000288875](https://github.com/user-attachments/assets/123d809d-f6b9-4705-9902-e4caaf04a0c3)
![1000288874](https://github.com/user-attachments/assets/174df206-16e0-490e-88a9-46ff267996b8)



---

## Catatan Pengerjaan
Praktikum ini dikerjakan menggunakan **perangkat HP**, sehingga
tidak memungkinkan untuk menjalankan Android Studio maupun emulator.

Fokus pengerjaan diarahkan pada:
- Penyusunan struktur project
- Penulisan kode sesuai modul
- Pemahaman konsep Room Database
- 
