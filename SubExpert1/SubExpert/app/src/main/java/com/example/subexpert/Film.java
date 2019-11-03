package com.example.subexpert;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private int photo;
    private String name;
    private String description;
    private String produksi;
    private String tahunProduksi;
    private String sutradara;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduksi() {
        return produksi;
    }

    public void setProduksi(String produksi) {
        this.produksi = produksi;
    }

    public String getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(String tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.photo);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.produksi);
        dest.writeString(this.tahunProduksi);
        dest.writeString(this.sutradara);
    }

    public Film() {
    }

    protected Film(Parcel in) {
        this.photo = in.readInt();
        this.name = in.readString();
        this.description = in.readString();
        this.produksi = in.readString();
        this.tahunProduksi = in.readString();
        this.sutradara = in.readString();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film(source);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };
}
