package org.example.Rebel;

public class Item {

    public String nomeItem;
    public Integer pontos;

    public Item(String nomeItem, Integer pontos) {
        this.nomeItem = nomeItem;
        this.pontos = pontos;
    }

    public Item() {
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
}




