package org.example.services;

import org.example.rebelde.Item;
import org.example.rebelde.Rebelde;
import org.example.repository.ItemRepository;
import org.example.repository.RebeldeRepository;

public class TrocaService {

    RebeldeRepository rebeldeRepository = new RebeldeRepository();
    ItemRepository itemRepository = new ItemRepository();

    public void trocarItem(int idOrigem, int idDestino, int idItem, int quantidade){
        Rebelde origem = rebeldeRepository.getListaRebelde().get(idOrigem);
        Rebelde destino = rebeldeRepository.getListaRebelde().get(idDestino);

        Item item = itemRepository.getListaItens().get(idOrigem);

        itemRepository.plusQuantity();
    }
}
