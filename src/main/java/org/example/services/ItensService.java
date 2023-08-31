package org.example.services;

import org.example.Rebel.Item;

import java.util.Objects;

public class ItensService {

    public void valorItens(Integer valorItens){
        Item itens = new Item();
        if(Objects.equals(itens.getNomeItem(), "arma")){
            itens.setPontos(4);
        }else if (Objects.equals(itens.getNomeItem(), "municao")){
            itens.setPontos(3);
        }else if (Objects.equals(itens.getNomeItem(), "agua")) {
            itens.setPontos(2);
        }else if (Objects.equals(itens.getNomeItem(), "comida")){
            itens.setPontos(1);
        }else {
            System.out.println("Item Inexistente");
        }


    }
}
