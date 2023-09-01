package org.example.rebel;

public class Item {

    private Integer id;
    private String nomeItem;
    private Integer pontos;

    public Item(String nomeItem, Integer pontos, Integer id) {
        this.nomeItem = nomeItem;
        this.pontos = pontos;
    }

    public Item() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nomeItem='" + nomeItem + '\'' +
                ", pontos=" + pontos +
                '}';
    }

}




