package com.example.android.challenge4square;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SegundaPaginaActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Lugar lugar;
    private TextView descripcionLugar;
    private TextView direccionLugar;
    private TextView latitudLugar;
    private TextView longitudLugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pagina);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        descripcionLugar = (TextView) findViewById(R.id.descripcion);
        direccionLugar = (TextView) findViewById(R.id.direccion);
        latitudLugar = (TextView) findViewById(R.id.latitud);
        longitudLugar = (TextView) findViewById(R.id.longitud);

        Sitios sitios = (Sitios) getIntent().getSerializableExtra("sitios");

        List<String> urlLugar = new ArrayList<>();

        urlLugar.add(new String("http://www.portafolio.co/sites/portafolio.co/files/imagecache/horizontal_articulo/PERROS%20calientes.jpg"));
        urlLugar.add(new String("http://www.vanguardia.com/sites/default/files/galerias/2012/12/07/gal_perro_0.jpg"));

        String descripcion = sitios.getSitios();

        String direccion = sitios.getDireccion();
        double latitud = 4.5;
        double longitud = -74.0;

        lugar = new Lugar(descripcion, direccion, latitud, longitud, urlLugar);

        LugarAdapter lugarAdapter = new LugarAdapter(this, lugar);
        viewPager.setAdapter(lugarAdapter);

        descripcionLugar.setText(descripcion);
        direccionLugar.setText(direccion);
        latitudLugar.setText(String.valueOf(latitud));
        longitudLugar.setText(String.valueOf(longitud));


    }

}
