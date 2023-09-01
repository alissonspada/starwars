package org.example.rebel;

public class Localizacao {


    private Integer id;
    private Integer latitude;
    private Integer longitude;
    private Integer galaxia;

    public Localizacao(Integer latitude, Integer longitude, Integer galaxia, Integer id) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.galaxia = galaxia;
    }

    public void setNewLocation(Integer latitude, Integer longitude, Integer galaxia){
        this.latitude = latitude;
        this.longitude = longitude;
        this.galaxia = galaxia;
    }

    public Localizacao() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
