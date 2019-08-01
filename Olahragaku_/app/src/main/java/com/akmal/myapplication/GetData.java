package com.akmal.myapplication;

import com.google.gson.annotations.SerializedName;

public class GetData {
    @SerializedName("id") private int Id;
    @SerializedName("nama") private String Nama;
    @SerializedName("harga") private String Harga;
    @SerializedName("waktu") private String waktu;
    @SerializedName("gambar") private String gambar;
    @SerializedName("deskripsi") private String Deskripsi;

    public int getId() {
        return Id;
    }

    public String getNama() {
        return Nama;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getHarga() {
        return Harga;
    }

    public String getGambar() {
        return gambar;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }
}
