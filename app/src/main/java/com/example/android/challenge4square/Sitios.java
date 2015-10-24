package com.example.android.challenge4square;

import java.io.Serializable;

/**
 * Created by katherine on 23/10/15.
 */
public class Sitios implements Serializable {
    public String getUrl() {
        return url;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSitios() {
        return sitios;
    }

    private final String sitios;
    private final String url;
    private final String direccion;

    public Sitios(String sitios, String direccion, String url) {
        this.direccion = direccion;
        this.sitios = sitios;
        this.url = url;
    }


}
