package com.example.subexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //deklarasi variabel listPlayer
    private ListView listPlayer;
    //deklarasi variabel players
    private ArrayList<Film> films;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisiasi variabel listPlayer
        listPlayer = findViewById(R.id.lv_list);

        //inisiasi variabel players
        films = generateDummmyData();

        //deklarasi variabel adapter sebagai adapter untuk listPlayer
        FilmAdapter adapter = new FilmAdapter(this, films);

        //set variabel adapter sebagai adapter untuk listPlayer
        listPlayer.setAdapter(adapter);

        //set listener saat salah satu item di-klik
        listPlayer.setOnItemClickListener(listener);



    }
    //deklarasi variabel listener untuk digunakan menangkap event saat sebuah item di-klik
    AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
            detailIntent.putExtra(DetailActivity.EXTRA_PLAYER, films.get(position));
            startActivity(detailIntent);
            Toast.makeText(MainActivity.this, films.get(position).getName(),Toast.LENGTH_SHORT).show();
        }
    };
    private static ArrayList<Film> generateDummmyData(){
        ArrayList<Film> dummyPlayers = new ArrayList<>();

        //Player 0 :
        Film film = new Film();
        film.setName("Dilan 1990");
        film.setDescription("Dilan 1990 merupakan film drama Indonesia tahun 2018. Film ini diangkat dari novel Dilan: Dia adalah Dilanku Tahun 1990 karya Pidi Baiq dan dibintangi oleh Iqbaal Ramadhan dan Vanesha Prescilla. Para pemain pendukungnya antara lain Farhan, Ira Wibowo, Tike Priatnakusumah, dan personel grup idola JKT48, Adhisty Zara. Ridwan Kamil, yang saat rilis film menjabat sebagai Wali Kota Bandung, juga ikut bermain di film ini. Kakak Vanesha, Sissy Priscillia, menjadi narator film sekaligus suara dari Milea dewasa. \nSyuting dimulai pada 26 Juli 2017 dan berakhir pada 2 November 2017. Pengambilan gambar berlangsung di dua kota, yakni Bandung dan Jakarta.");
        film.setSutradara("Fajar Bustomi dan Pidi Baiq");
        film.setTahunProduksi("(2018)");
        film.setProduksi("Max Pictures");
        film.setPhoto(R.drawable.dilan1990);

        dummyPlayers.add(film);

        //Player 1 :
        film = new Film();
        film.setName("Dilan 1991");
        film.setDescription("Dilan 1991 adalah sebuah film Indonesia tahun 2019 yang disutradarai oleh Fajar Bustomi dan Pidi Baiq. Film ini adalah sekuel dari Dilan 1990 yang tayang Januari 2018. Film tersebut pertama tayang pada 24 Februari 2019 dalam \"Hari Dilan\" di Bandung, sebelum resmi tayang di seluruh Indonesia empat hari kemudian. Syutingnya digelar di Bandung pada November 2018. \n Film tersebut kembali dibintangi oleh Iqbaal Ramadhan sebagai Dilan dan Vanesha Prescilla sebagai Milea, sementara Maudy Koesnaedi memerankan karakter baru bernama Tante Anis dalam film ini. Adhisty Zara dari JKT48 dan Ira Wibowo kembali berperan masing-masing sebagai adik dan ibunda Dilan. Ridwan Kamil, yang kini menjabat Gubernur Jawa Barat, kembali ikut bermain di film ini.");
        film.setSutradara("Fajar Bustomi dan Pidi Baiq");
        film.setTahunProduksi("(2019)");
        film.setProduksi("Max Pictures");
        film.setPhoto(R.drawable.dilan1991);

        dummyPlayers.add(film);

        film = new Film();
        film.setName("Laskar Pelangi");
        film.setDescription("Laskar Pelangi (2008) adalah sebuah film garapan sutradara Riri Riza yang dirilis pada 26 September 2008. Film Laskar Pelangi merupakan karya adaptasi dari buku Laskar Pelangi yang ditulis oleh Andrea Hirata. Skenarionya ditulis oleh Salman Aristo yang juga menulis naskah film Ayat-Ayat Cinta dibantu oleh Riri Riza dan Mira Lesmana. Hingga Maret 2009, Laskar Pelangi telah ditonton oleh 4,6 juta orang, menjadikannya film terbanyak ditonton di Indonesia keempat, setelah Jelangkung dengan 5,7 Juta, Pocong 2 dengan 5,1 Juta, dan Ada Apa Dengan Cinta dengan 4,9 Juta.\n Sang Pemimpi merupakan film kedua yang diadaptasi dari novel karya Andrea Hirata. Mira sendiri tak berani memasang target bahwa film ini harus melampaui prestasi yang telah diraih film Laskar Pelangi, yang telah ditonton oleh 4,6 juta orang. \"Kita enggak berani memasang target, karena penonton kita memang sulit ditebak. Tapi, tetap kita akan mencoba berbuat yang terbaik,\" ujarnya.");
        film.setSutradara("Riri Riza");
        film.setTahunProduksi("(2008)");
        film.setProduksi("Mizan Productions, Miles Films");
        film.setPhoto(R.drawable.laskar_pelangi);

        dummyPlayers.add(film);

        film = new Film();
        film.setName("Habibie & Ainun");
        film.setDescription("Habibie & Ainun adalah film drama biopik Indonesia yang dirilis pada tanggal 20 Desember 2012. Film ini dibintangi oleh Reza Rahardian, Bunga Citra Lestari dan Tio Pakusadewo. Pada peluncurannya, film ini disaksikan oleh Presiden Republik Indonesia ke-6, Susilo Bambang Yudhoyono, didampingi oleh Gubernur Daerah Khusus Ibukota Jakarta ke-16, Joko Widodo, dan oleh tokoh utama film ini sendiri, Presiden Republik Indonesia ke-3, Bacharuddin Jusuf Habibie. Film ini diangkat dari memoar yang ditulis Habibie mengenai kisah hidupnya bersama mendiang istrinya, Hasri Ainun Habibie, dalam buku Habibie dan Ainun.");
        film.setSutradara("Faozan Rizal");
        film.setTahunProduksi("(2012)");
        film.setProduksi("MD Entertainment");
        film.setPhoto(R.drawable.habibie);

        dummyPlayers.add(film);

        film = new Film();
        film.setName("Dua Garis Biru");
        film.setDescription("Dua Garis Biru adalah sebuah film drama remaja Indonesia tahun 2019 yang disutradarai oleh Gina S. Noer dan diproduksi oleh Starvision Plus. Film tersebut dibintangi oleh Angga Aldi Yunanda, Adhisty Zara, Lulu Tobing, Cut Mini Theo, Dwi Sasono, Arswendi Nasution, Rachel Amanda, Ariella Calista Ichwan, dan Cindy Hapsari Maharani Pujiantoro Putri. Film ini mengangkat tema kehamilan remaja.");
        film.setSutradara("Ginatri S. Noer");
        film.setTahunProduksi("(2019)");
        film.setProduksi("Starvision Plus, Wahana Kreator");
        film.setPhoto(R.drawable.duagaris);

        dummyPlayers.add(film);

        film = new Film();
        film.setName("5 cm");
        film.setDescription("5 cm adalah film drama Indonesia yang dirilis pada 12 Desember 2012. Film ini disutradarai Rizal Mantovani. Film ini dibintangi oleh Herjunot Ali dan Fedi Nuril. Film ini merupakan film yang diadaptasi dari sebuah novel dengan judul yang sama.");
        film.setSutradara("Rizal Mantovani");
        film.setTahunProduksi("(2012)");
        film.setProduksi("Soraya Intercine Films");
        film.setPhoto(R.drawable.postercm);

        dummyPlayers.add(film);

        film = new Film();
        film.setName("Sang Pemimpi");
        film.setDescription("Sang Pemimpi adalah sebuah film Indonesia tahun 2009 yang diadaptasi dari tetralogi novel Laskar Pelangi kedua, Sang Pemimpi, karya Andrea Hirata. Film ini disutradarai oleh Riri Riza dengan produser Mira Lesmana. Pengambilan gambar rencananya dimulai di Belitung (Belitong, dalam bahasa setempat) pada 1 Juli 2009 dan dijadwalkan selesai pada 21 Agustus 2009, dan akan dilakukan di beberapa lokasi di Manggar, Tanjung Pandan, Jakarta, dan Bogor. Film ini rencananya akan tayang di bioskop di Indonesia mulai 17 Desember 2009.");
        film.setSutradara("Riri Riza");
        film.setTahunProduksi("(2009)");
        film.setProduksi("Mizan Productions, Miles Filmsr");
        film.setPhoto(R.drawable.sang_pemimpi);

        dummyPlayers.add(film);

        film = new Film();
        film.setName("The Raid");
        film.setDescription("The Raid (sebelum diedarkan: Serbuan Maut) adalah film aksi seni bela diri dari Indonesia yang disutradarai oleh Gareth Evans dan dibintangi oleh Iko Uwais. Pertama kali dipublikasi pada Festival Film Internasional Toronto (Toronto International Film Festival, TIFF) 2011 sebagai film pembuka untuk kategori Midnight Madness, para kritikus dan penonton memuji film tersebut sebagai salah satu film aksi terbaik setelah bertahun-tahun sehingga memperoleh penghargaan The Cadillac People's Choice Midnight Madness Award.");
        film.setSutradara("Gareth Evans");
        film.setTahunProduksi("(2012)");
        film.setProduksi("Merantau Films, XYZ Films");
        film.setPhoto(R.drawable.theraid);

        dummyPlayers.add(film);

        film = new Film();
        film.setName("Ayat-ayat Cinta");
        film.setSutradara("Hanung Bramantyo");
        film.setDescription("Ayat-Ayat Cinta adalah sebuah film Indonesia karya Hanung Bramantyo yang dibintangi oleh Fedi Nuril, Rianti Cartwright, Carissa Putri, Zaskia Adya Mecca, dan Melanie Putria. Film ini merupakan film religi hasil adaptasi dari sebuah novel best seller karya Habiburrahman El Shirazy berjudul Ayat Ayat Cinta, dan tayang perdana pada 28 Februari 2008. Walaupun kisah dalam film dan novel Ayat-Ayat Cinta berlatarkan kehidupan di Kairo, Mesir, tetapi proses pengambilan gambar tidak dilakukan di kota itu.");
        film.setTahunProduksi("(2008)");
        film.setProduksi("MD Entertainment");
        film.setPhoto(R.drawable.ayatayat);

        dummyPlayers.add(film);

        film = new Film();
        film.setName("My Stupid Boss");
        film.setSutradara("Upi");
        film.setDescription("My Stupid Boss merupakan sebuah film komedi Indonesia yang dirilis pada 19 Mei 2016 dan disutradarai oleh Upi Avianto. Film ini diadaptasikan dari sebuah novel dengan judul yang sama karya Chaos@work. Film ini menjalani pengambilan gambar di Indonesia dan Malaysia. Film ini menjadi yang terlaris ketiga di Indonesia dengan 3 juta penonton.");
        film.setTahunProduksi("(2016)");
        film.setProduksi("Falcon Pictures");
        film.setPhoto(R.drawable.mystupid);

        dummyPlayers.add(film);
        return dummyPlayers;
    }
}
