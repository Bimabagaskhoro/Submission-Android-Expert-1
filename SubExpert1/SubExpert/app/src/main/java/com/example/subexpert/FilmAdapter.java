package com.example.subexpert;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FilmAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Film> films;

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    public FilmAdapter(Context context, ArrayList<Film> ourPlayers){
        this.context = context;
        this.films = ourPlayers;
    }

    @Override
    public int getCount() {
        return films.size();
    }

    @Override
    public Object getItem(int i) {
        return films.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_hero, null);

            holder.imgFoto = view.findViewById(R.id.img_photo);
            holder.txtNama = view.findViewById(R.id.txt_name);
            holder.txtDeskripsi = view.findViewById(R.id.txt_description);
            holder.txtSutradara = view.findViewById(R.id.sutradara);
            holder.txtProduksi = view.findViewById(R.id.produksi);
            holder.txtTahunProduksi = view.findViewById(R.id.tahun_produksi);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        holder.imgFoto.setImageResource(films.get(i).getPhoto());
        holder.imgFoto.setScaleType(ImageView.ScaleType.CENTER_CROP);
        holder.txtNama.setText(films.get(i).getName());
        holder.txtDeskripsi.setText(films.get(i).getDescription());
        holder.txtSutradara.setText(films.get(i).getSutradara());
        holder.txtProduksi.setText(films.get(i).getProduksi());
        holder.txtTahunProduksi.setText(films.get(i).getTahunProduksi());
        return view;
    }
    static class ViewHolder {
        ImageView imgFoto;
        TextView txtNama;
        TextView txtDeskripsi;
        TextView txtSutradara;
        TextView txtProduksi;
        TextView txtTahunProduksi;
    }
}
