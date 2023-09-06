package org.example.services;

import org.example.exceptions.TrocaException;
import org.example.repository.ItemRepository;
import org.example.repository.RebeldeRepository;

public class TrocaService {

    RebeldeRepository rebeldeRepository = new RebeldeRepository();
    ItemRepository itemRepository = new ItemRepository();

    public void trocarItem(int idOrigem, int idDestino, int idItem, int quantidade, String comida, String agua, String municao, String arma) throws TrocaException {





        }

}
