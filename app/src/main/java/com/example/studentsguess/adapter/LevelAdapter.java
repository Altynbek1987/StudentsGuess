package com.example.studentsguess.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.studentsguess.R;
import com.example.studentsguess.data.GameModel;
import com.example.studentsguess.interf.OnItemClickListener;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.LevelHolder> {

    List<GameModel> list = new ArrayList<>();
    OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public LevelAdapter(List<GameModel> list) {
        this.list = list;

    }
    @SuppressLint("NotifyDataSetChanged")
    public void setList(List<GameModel> listM) {
        list.clear();
        this.list.addAll(listM);
        notifyDataSetChanged();
    }
    @SuppressLint("NotifyDataSetChanged")
    public void addData(List<GameModel> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LevelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.level_holder,parent,false);
        return new LevelHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LevelHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LevelHolder extends RecyclerView.ViewHolder {
        TextView tvLevel;
        public LevelHolder(@NonNull View itemView) {
            super(itemView);
            tvLevel = itemView.findViewById(R.id.tv_level);
        }

        public void onBind(GameModel gameModel) {
            tvLevel.setText(gameModel.getLevel());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClick(gameModel);
                }
            });
        }
    }
}
