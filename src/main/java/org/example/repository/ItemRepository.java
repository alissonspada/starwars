package org.example.repository;

import org.example.rebel.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private final List<Item> listaItens = new ArrayList<>();
    public List<Item> getListaItens(){
        return listaItens;
    }

    public void addListaItens(Item item){
        listaItens.add(item);
    }
}
