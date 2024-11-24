# AplikasiPengelolaanKontak
 Latihan3 - Seidi Rahmat(2210010262)

**Aplikasi Pengelolaan Kontak**

Aplikasi Pengelolaan Kontak adalah sebuah aplikasi desktop berbasis Java yang dibangun menggunakan NetBeans dan JFrame form dengan integrasi MySQL sebagai database. Aplikasi ini bertujuan untuk membantu pengguna dalam mengelola kontak secara efektif, termasuk menambahkan, mengedit, menghapus, dan mencari kontak. Selain itu, aplikasi ini dilengkapi dengan fitur ekspor dan impor data dalam format CSV untuk memudahkan pengelolaan data kontak secara lebih luas.

**Fitur Utama:**
1.CRUD Operasi (Create, Read, Update, Delete):

- Pengguna dapat menambahkan kontak baru dengan memasukkan informasi seperti ID, Nama, Nomor Telepon, dan Kategori.
- Kontak yang sudah ada dapat diubah atau dihapus.
- Fitur pencarian kontak memudahkan pengguna menemukan kontak berdasarkan kata kunci.

2. Kategori Kontak:

- Setiap kontak dapat dikategorikan menggunakan JComboBox sehingga pengguna dapat mengelompokkan kontak berdasarkan kategori seperti keluarga, teman, kerja, dll.

3. JTable dengan Dinamika Data dari Database:

- Tabel data kontak diperbarui secara otomatis setelah penambahan, pengubahan, atau penghapusan kontak.
- Nama kolom pada JTable disesuaikan langsung dengan nama kolom di database sehingga pengguna dapat melihat data kontak dengan format yang jelas dan mudah dipahami.

4. Fitur Ekspor dan Impor Data:

- Pengguna dapat mengekspor data kontak ke file CSV sehingga data dapat dipindahkan atau dibagikan dengan mudah.
- Selain itu, aplikasi mendukung impor data kontak dari file CSV sehingga kontak dari sumber eksternal dapat diintegrasikan ke dalam aplikasi.

5. Tombol Refresh dan Keluar:

- Tombol Refresh memudahkan pengguna untuk memperbarui tampilan tabel kontak tanpa harus memuat ulang aplikasi.
- Tombol Keluar memungkinkan pengguna untuk keluar dari aplikasi dengan aman

**Teknologi yang Digunakan:**

- Java (NetBeans IDE): Bahasa pemrograman utama yang digunakan untuk membangun aplikasi ini, khususnya dengan pendekatan GUI melalui JFrame.
- MySQL Database: Digunakan untuk menyimpan data kontak secara aman dan terstruktur.
- MySQL Connector: Untuk menghubungkan aplikasi dengan database MySQL.
- JTable: Untuk menampilkan daftar kontak dengan tampilan tabel yang mudah dipahami.
- JComboBox: Untuk pemilihan kategori kontak.

  
![Demo GIF](https://github.com/seidi255/AplikasiPengelolaanKontak/blob/main/img/DEMO%20APK%20KONTAK.gif)
