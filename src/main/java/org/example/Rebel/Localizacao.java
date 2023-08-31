package org.example.Rebel;

public class Localizacao {

    public Integer latitude;
    public Integer longitude;
    public Integer galaxia;

    public Localizacao(Integer latitude, Integer longitude, Integer galaxia) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.galaxia = galaxia;
    }

    public Localizacao() {
    }


    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(Integer galaxia) {
        this.galaxia = galaxia;
    }
}
