package com.example.dell.dressing;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class DressAdapter extends RecyclerView.Adapter<DressAdapter.ViewHolder> {

    private List<Dress> DressList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        View dressView;
        ImageView dressImage;
        TextView dressName;

        public ViewHolder(View view) {
            super(view);
            dressView = view;
            dressImage = (ImageView) view.findViewById(R.id.dress_image);
            dressName = (TextView) view.findViewById(R.id.dress_name);
        }
    }

    public DressAdapter(List<Dress> dressList) {
        DressList = dressList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dress_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Dress dress = DressList.get(position);
        holder.dressImage.setImageResource(dress.getImageId());
        holder.dressName.setText(dress.getName());

        //单击
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //触发自定义监听的单击事件
                onItemClickListener.onItemClick(holder.itemView,position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return DressList.size();
    }


    public void setOnItemClickListener(DressAdapter.OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    private OnItemClickListener onItemClickListener;

    /**
     * 自定义监听回调，RecyclerView 的 单击和长按事件
     */
    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }


}
