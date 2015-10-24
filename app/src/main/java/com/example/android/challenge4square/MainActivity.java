package com.example.android.challenge4square;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.Lugares);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Sitios> sitios = new ArrayList<>();
        sitios.add(new Sitios("Rapi perro", "Direccion : carrera 15-90", "http://mlv-s1-p.mlstatic.com/carrito-de-raspadoscarrito-de-perros-agencia-de-festejos-2177-MLV405522588_9555-O.jpg"));
        sitios.add(new Sitios("Las primas", "Dereccion : carrera 15-89", "http://www.campananews.com/wp-content/gallery/chica-campanela-417.jpg"));
        sitios.add(new Sitios("Los primos", "Dereccion : calle 85", "http://www.apolosmen.com.co/uploads/apolos/home_customers/90713568829844ccb245df5707d17c37.jpg"));
        sitios.add(new Sitios("Carulla", "Dereccion: calle 92", "http://www.smartbrands.com.co/_/rsrc/1376091032642/carulla/Carulla_Logo.png"));


    }
}
