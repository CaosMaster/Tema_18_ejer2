package com.example.dm2.tema_18_ejer2;

import android.widget.ImageView;

/**
 * Created by dm2 on 23/10/2017.
 */

public class Info {

    private String nombre;
    private String url;
    private String foto;


    public Info(String nombre,String url,String foto){
        this.foto=foto;
        this.nombre=nombre;
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public String getFoto() {

        return foto;
    }

    public String getNombre() {

        return nombre;
    }



}
