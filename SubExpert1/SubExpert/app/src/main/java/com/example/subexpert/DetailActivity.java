package com.example.subexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_PLAYER = "extra_player";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //mengambil data Player yang dikirimkan oleh MainActivity dengan identitas EXTRA_PLAYER
        Film film = getIntent().getParcelableExtra(EXTRA_PLAYER);

        if(film!=null){
            ImageView imgFoto = findViewById(R.id.img_photo);
            imgFoto.setImageResource(film.getPhoto());
            imgFoto.setScaleType(ImageView.ScaleType.CENTER_CROP);

            TextView txtNama = findViewById(R.id.txt_name);
            txtNama.setText(film.getName());

            TextView txtSutradara = findViewById(R.id.sutradara);
            txtSutradara.setText(film.getSutradara());

            TextView txtProduksi = findViewById(R.id.produksi);
            txtProduksi.setText(film.getProduksi());

            TextView txtTahun = findViewById(R.id.tahun_produksi);
            txtTahun.setText(film.getTahunProduksi());

            TextView txtDeskripsi = findViewById(R.id.txt_description);
            txtDeskripsi.setText(film.getDescription());

        }
    }
}
