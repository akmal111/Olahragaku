package com.akmal.myapplication;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<GetData> list;
    private Context context;


    public Adapter(List<GetData> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nama.setText(list.get(position).getNama());
        holder.harga.setText(list.get(position).getHarga());
        holder.waktu.setText(list.get(position).getWaktu());
        holder.deskripsi.setText(list.get(position).getDeskripsi());
        Picasso.with(context).
                load(list.get(position).getGambar()).
                fit().
                into(holder.gambar);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nama,harga,waktu,deskripsi;
        ImageView gambar;
        public MyViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.nama);
            harga = itemView.findViewById(R.id.harga);
            waktu = itemView.findViewById(R.id.waktu);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            gambar = itemView.findViewById(R.id.gambar);


        }
    }
}

