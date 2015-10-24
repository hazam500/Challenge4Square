package com.example.android.challenge4square;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by katherine on 23/10/15.
 */
public class SitiosAdapter extends RecyclerView.Adapter<InformacionViewHolder> {

    private final ItemClickListener mItemClickListener;
    private final Context context;
    private List<Sitios> sitios;

    public SitiosAdapter(Context context, List<Sitios> sitios, ItemClickListener itemClickListener) {
        this.context = context;
        this.sitios = new ArrayList<>();
        this.sitios.addAll(sitios);
        this.mItemClickListener = itemClickListener;
    }

    @Override
    public InformacionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_list, parent, false);
        InformacionViewHolder viewHolder = new InformacionViewHolder(view, mItemClickListener);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(InformacionViewHolder holder, int position) {
        Sitios sitios = this.sitios.get(position);
        holder.TextViewNombre.setText(sitios.getSitios());
        holder.TextViewDirecion.setText(sitios.getDireccion());
        Picasso.with(context).load(sitios.getUrl()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return sitios.size();
    }
}
