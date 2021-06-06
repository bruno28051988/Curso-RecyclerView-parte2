package com.br.cursorecyclerviewparte2.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    @NonNull
    @Override
    //Criar as visualizações
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    //Exibir as visualizações
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    //retorna a quantidade de itens que vão ser exibidos
    public int getItemCount() {
        return 0;
    }

    //classe para criar os itens
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView genero;
        TextView ano;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
