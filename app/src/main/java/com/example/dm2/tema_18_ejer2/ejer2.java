package com.example.dm2.tema_18_ejer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ejer2 extends AppCompatActivity {

    private ListView opciones;
    private Info[] datos= new Info [] {new Info ("league of legends","https://euw.leagueoflegends.com/es/","lol"),
                                       new Info ("facebook","https://es-la.facebook.com/","face"),
                                       new Info ("tuenti","https://www.tuenti.es/","tuenti"),
                                       new Info ("twitter","https://twitter.com/?lang=es","twitter")};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer2);

        opciones=(ListView) findViewById(R.id.ListaView);

        AdaptadorInfo adaptador=new AdaptadorInfo(this,datos);

        opciones.setAdapter(adaptador);
    }




}
