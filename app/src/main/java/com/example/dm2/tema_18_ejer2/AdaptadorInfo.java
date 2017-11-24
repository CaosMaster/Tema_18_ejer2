package com.example.dm2.tema_18_ejer2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dm2 on 23/10/2017.
 */

public class AdaptadorInfo extends ArrayAdapter<Info> {

    private Info[] datos;

    public AdaptadorInfo(Context context, Info[] datos){
        super(context,R.layout.info,datos);
        this.datos = datos;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.info, null);

        TextView nombre = (TextView) item.findViewById(R.id.txtNombre);
        nombre.setText(datos[position].getNombre());

        TextView url = (TextView) item.findViewById(R.id.txtUrl);
        url.setText(datos[position].getUrl());

        String img = datos[position].getFoto();
        ImageView imagen = (ImageView) item.findViewById(R.id.foto);

        if (img.equalsIgnoreCase("lol")) {
            imagen.setImageResource(R.drawable.lol);
        }

        if (img.equalsIgnoreCase("face")){
            imagen.setImageResource(R.drawable.face);
        }

        if (img.equalsIgnoreCase("twitter")){
            imagen.setImageResource(R.drawable.twitter);
        }

        if (img.equalsIgnoreCase("tuenti")){
            imagen.setImageResource(R.drawable.tuenti);
        }


        return item;
    }
}
