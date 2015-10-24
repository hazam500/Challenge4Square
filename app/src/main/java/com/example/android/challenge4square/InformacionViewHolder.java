package com.example.android.challenge4square;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by katherine on 23/10/15.
 */
public class InformacionViewHolder extends RecyclerView.ViewHolder {

    public TextView TextViewNombre;
    public TextView TextViewDirecion;
    public ImageView imageView;

    private ItemClickListener mItemClickListener;

    public InformacionViewHolder(View itemView, ItemClickListener itemClickListener) {

        super(itemView);
        this.mItemClickListener = itemClickListener;
        TextViewNombre = (TextView) itemView.findViewById(R.id.textViewNombre);
        TextViewDirecion = (TextView) itemView.findViewById(R.id.textViewDireccion);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mItemClickListener.onItemClick(v, getAdapterPosition());
            }

        });
    }
}