package com.example.android.challenge4square;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOSHIBA on 23/10/2015.
 */
public class Lugar {


    private final String descripcion;
    private final String direccion;
    private final double latitud;
    private final double longitud;
    private final List<String> urlLugar;



    public Lugar(String descripcion, String direccion, double latitud, double longitud, List<String> urlLugar) {

        this.descripcion = descripcion;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.urlLugar = new ArrayList<>();
        this.urlLugar.addAll(urlLugar);

    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public List<String> getUrlLugar() {
        return urlLugar;
    }
}
