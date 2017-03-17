package com.example.hargr.constrant;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by hargr on 13/03/2017.
 */

public class ListAdapterItens extends ArrayAdapter<Itens_home> {

    private Context context;
    private ArrayList<Itens_home> lista;
    public ListAdapterItens (Context context, ArrayList<Itens_home> lista){
        super(context,0,lista);
        this.context = context;
        this.lista = lista;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Itens_home itemposicao = this.lista.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.item,null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        imageView.setImageResource(itemposicao.getImg());

        return convertView;
    }
}
