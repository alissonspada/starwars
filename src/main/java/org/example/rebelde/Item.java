package org.example.rebelde;

import java.util.List;

public class Item {

    private Integer id;
    private String nomeItem;
    private Integer pontos;

    private List<Integer> listaItem;

    public Item(String nomeItem, Integer pontos, Integer id, List<Integer> listaItem) {
        this.listaItem = listaItem;
        this.nomeItem = nomeItem;
        this.pontos = pontos;
        this.id = id;
    }

    public Item() {
    }


    public List<Integer> getListaItem() {
        return listaItem;
    }

    public void setListaItem(List<Integer> listaItem) {
        this.listaItem = listaItem;
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



}





