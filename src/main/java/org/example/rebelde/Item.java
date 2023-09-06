package org.example.rebelde;

import java.util.List;

public class Item {

    private Integer id;
    private String nomeItem;
    private Integer quantidade;

    private List<Integer> listaItem;

    public Item(String nomeItem, Integer quantidade, Integer id, List<Integer> listaItem) {
        this.listaItem = listaItem;
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.id = id;
    }

    public Item() {
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
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



}





