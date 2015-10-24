package com.example.android.challenge4square;

/**
 * Created by katherine on 23/10/15.
 */
public class Sitios {
    public String getUrl() {
        return url;
    }

    public String getDirección() {
        return dirección;
    }

    public String getSitios() {
        return sitios;
    }

    private final String sitios;
    private final String url;
    private final String dirección;

    public Sitios(String sitios,String url,String dirección){
        this.dirección=dirección;
        this.sitios=sitios;
        this.url=url;
    }


}
