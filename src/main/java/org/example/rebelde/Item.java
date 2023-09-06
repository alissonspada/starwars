package org.example.rebelde;

public class Item {

    private Integer id;
    private String comida;
    private String agua;
    private String municao;
    private String arma;

    public Item(Integer id, String comida, String agua, String municao, String arma) {
        this.id = id;
        this.comida = comida;
        this.agua = agua;
        this.municao = municao;
        this.arma = arma;
    }

    public Item(String comida, String agua, String municao, String arma) {
        this.comida = comida;
        this.agua = agua;
        this.municao = municao;
        this.arma = arma;
    }


    public Item() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getMunicao() {
        return municao;
    }

    public void setMunicao(String municao) {
        this.municao = municao;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}





