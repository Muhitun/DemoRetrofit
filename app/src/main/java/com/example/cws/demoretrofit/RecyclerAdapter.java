package com.example.cws.demoretrofit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by CWS on 7/8/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.MyViewHolder>{


    List<News> news;
    Context context;

    public RecyclerAdapter(List<News> news, Context context){
        this.news = news;
        this.context = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_layout,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.item.setText(news.get(position).getStatus());
       // Glide.with(context).load(news.get(position).getImage_path()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView item;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            item = (TextView)itemView.findViewById(R.id.name);
            //image = (ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
