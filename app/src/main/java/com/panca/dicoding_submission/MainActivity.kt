package com.panca.dicoding_submission

import Article
import ArticleAdapter
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ItemClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Menyiapkan data untuk ditampilkan di RecyclerView
        val articles = getSampleArticles()

        // Inisialisasi adapter dan mengatur click listener
        adapter = ArticleAdapter(articles, this)
        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_page -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onItemClick(position: Int) {
        // Menangani klik pada item RecyclerView untuk membuka halaman detail
        val selectedArticle = adapter.getItemAtPosition(position)
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("article", selectedArticle)
        startActivity(intent)
    }

    // Fungsi untuk menyediakan data contoh
    private fun getSampleArticles(): List<Article> {
        val articles = mutableListOf<Article>()

        articles.add(
            Article(
                "Cara Melaporkan Debt Collector jika melakukan Penarikan Kendaraan Paksa",
                "Sering kita dapati dalam perjalanan ada beberapa orang atau sekumpulan orang mengawasi jalanan, mengamati motor dan mobil yang lewat, lalu sekali waktu kita dapati juga mereka memberhentikan kendaraan yang menurut mereka cocok dengan sasaran yang mereka cari. Diketahui belakangan bahwa pemilik kendaraan tersebut ternyata menunggak pembayaran angsuran kredit kendaraan yang",
                R.drawable.article_1
            )
        )
        articles.add(
            Article(
                "Bank Indonesia sebagai Lender Of The Last Resort dalam Sistem Keuangan Negara",
                "Lahirnya Bank Indonesia sebagai bank sentral dengan berbagai bentuk, fungsi dan tugas yang demikian kompleks tidak terlepas daripada tujuan pembangunan nasional yaitu dalam rangka mewujudkan masyarakat adil dan makmur berdasarkan Pancasila dan Undang-Undang Dasar Tahun 1945.Kedudukan Bank Indonesia sebagai lender of the last resort sebelum lahirnya Undang-Undang No.9 Tahun 2016",
                R.drawable.article_2
            )
        )
        articles.add(
            Article(
                "Unpaid Leave atau Cuti Tak Dibayar pada Karyawan dimasa Pandemic",
                "Selain bahaya pada kesehatan, Pandemic juga berdampak pada sektor-sektor lain salah satunya adalah pada sektor ekonomi industri yang mana didalamnya bergantung hajat hidup orang banyak sebagai Buruh / Karyawan. Pada masa Pandemic Covid-19 ini, tercatat lebih dari 1.9 Juta tenaga kerja diputus hubungan kerjanya oleh perusahaan dimana dia bekerja, mayoritas",
                R.drawable.article_3
            )
        )
        articles.add(
            Article(
                "Cara Mengajukan Gugatan Cerai Isteri Kepada Suami Di Pengadilan Agama",
                "Bahwa Pengadilan Agama berwenang memeriksa dan mengadili perkara cerai bagi perkawinan yang dilakukan menurut agama islam yang diakui sah oleh hukum negara Indonesia. Salah satu ciri utama bahwa perkawinan dilakukan secara agama islam dan sah secara hukum negara Indonesia adalah adanya Buku Nikah yang dikeluarkan oleh Kantor Urusan Agama (KUA).",
                R.drawable.article_4
            )
        )
        articles.add(
            Article(
                "Tindak Pidana Lingkungan Hidup Yang Mengancam Perusahaan",
                "Sesuai dengan Undang – undang No.32 tahun 2009 yang di maksud dengan Lingkungan hidup adalah kesatuan ruang dengan semua benda, daya, keadaan, dan makhluk hidup, termasuk manusia dan perilakunya, yang mempengaruhi alam itu sendiri, kelangsungan perikehidupan, dan kesejahteraan manusia serta makhluk hidup lain. Tujuan dibentuknya Undang-undang tersebut adalah untuk menciptakan",
                R.drawable.article_5
            )
        )
        articles.add(
            Article(
                "Pencemaran Nama Baik Lewat Media Sosial Internet",
                "Akhir-akhir ini marak kasus-kasus hukum yang berhubungan dengan Tehnologi yaitu Internet dan Media Sosial, termasuk kasus pencemaran nama baik lewat media sosial internet. Bahkan bisa dikatakan hampir setiap hari sebenarnya terjadi kasus serupa, yang hal ini disebabakan semakin bebasnya masyarakat dalam mengekpresikan pendapatnya melalui internet dalam hal ini media sosial.",
                R.drawable.article_6
            )
        )
        articles.add(
            Article(
                "Cara Mengajukan Gugatan Cerai Talak Suami kepada Isterinya di Pengadilan Agama",
                "Bahwa gugatan cerai dapat diajukan baik oleh Suami kepada Isterinya maupun oleh Isteri kepada Suaminya. Gugatan yang diajukan suami kepada Isterinya disebut dengan Permohonan Cerai Talak, yang dalam membuat Gugatan / Permohonan, Suami berkedudukan menjadi Pemohon dan Isteri berkedudukan menjadi Termohon. Cara mengajukan gugatan cerai talak suami kepada isterinya adalah",
                R.drawable.article_7
            )
        )
        articles.add(
            Article(
                "Mempekerjakan Anak Dibawah Umur Bisa Dipidana",
                "Undang-undang Ketenagakerjaan pasal 68 menegaskan bahwa Pengusaha dilarang memperkerjakan anak dibawah umur, yang berdasarkan ketentuan adalah anak yang usianya dibawah 18 tahun. Ancaman bagi pengusaha atau perusahaan yang masih mempekerjakan anak yang belum berusia 18 tahun adalah pidana penjara paling singkat 1 tahun dan paling lama 4 tahun dan/atau denda",
                R.drawable.article_8
            )
        )


        articles.add(
            Article(
                "Hak Pasien atas Isi Rekam Medis Kedokteran",
                "Rekam medis adalah berkas yang berisikan catatan dan dokumen tentang identitas pasien, pemeriksaan, pengobatan, tindakan, dan pelayanan lain yang telah diberikan oleh rumah sakit dan/atau dokter kepada pasien. (penjelasan Pasal 46 ayat (1) UU Praktik Kedokteran). Oleh karenanya hak pasien atas isi rekam medis kedokteran dilindungi hukum. Kewajiban membuat rekam medis atas",
                R.drawable.article_9
            )
        )
        articles.add(
            Article(
                "Akibat Hukum jika Anggota CV Meninggal Dunia",
                "Perusahaan di Indonesia dapat berbentuk perorangan, CV, Perseroan Terbatas, BUMN, dan lain sebagainya. Commanditaire vennootschap atau Persekutuan Komanditer atau CV merupakan persekutuan yang didirikan oleh dua orang atau lebih, yang mana salah satu pihak bertindak sebagai sekutu pasif / komanditer atau sekutu pelepas uang dan sekutu lainnya bertindak untuk melakukan pengurusan",
                R.drawable.article_10
            )
        )

        return articles
    }

}
