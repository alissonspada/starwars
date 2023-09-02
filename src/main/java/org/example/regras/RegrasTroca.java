package org.example.regras;

import org.example.rebelde.Item;

import java.util.Objects;

public class RegrasTroca {

    public void trocaRegras(){
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
