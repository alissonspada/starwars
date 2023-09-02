package org.example.rebelde;

public class Localizacao {


    private Integer id;
    private Integer latitude;
    private Integer longitude;
    private Integer galaxia;
    private String base;

    public Localizacao(Integer latitude, Integer longitude, Integer galaxia, Integer id, String base) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.galaxia = galaxia;
        this.base = base;
    }

    public void setNewLocation(Integer latitude, Integer longitude, Integer galaxia, String base){
        this.latitude = latitude;
        this.longitude = longitude;
        this.galaxia = galaxia;
        this.base = base;
    }

    public Localizacao() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
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
