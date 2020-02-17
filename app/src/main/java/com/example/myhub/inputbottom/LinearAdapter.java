package com.example.myhub.inputbottom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myhub.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Time:2020/2/17 16:09
 * Author: han1254
 * Email: 1254763408@qq.com
 * Function:
 */
public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {

    @NonNull
    @Override
    public LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_stragger, parent, false);
        return new LinearViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 40;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
