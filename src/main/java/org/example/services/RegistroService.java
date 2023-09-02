package org.example.services;

import org.example.exceptions.RegistrarException;
import org.example.rebelde.Item;
import org.example.rebelde.Localizacao;
import org.example.rebelde.Rebelde;
import org.example.regras.RegrasRegistro;
import org.example.repository.ItemRepository;
import org.example.repository.LocalizacaoRepository;
import org.example.repository.RebeldeRepository;

import java.util.List;

public class RegistroService {

    private final ItemRepository itemRepo = new ItemRepository();
    private final LocalizacaoRepository localRepo = new LocalizacaoRepository();
    private final RebeldeRepository rebeldeRepo = new RebeldeRepository();
    private final RegrasRegistro regrasRegistro = new RegrasRegistro();

    public void registrarRebelde (String nome, Integer idade, String genero, Integer latitude, Integer longitude, Integer galaxia, String base, Boolean traidor, List<Integer> item) throws RegistrarException {

            regrasRegistro.registroRegras(nome, idade, genero, traidor, latitude, longitude, galaxia, base, item);
            Integer pegarId = rebeldeRepo.getListaRebelde().size();

        Rebelde novoRebelde = new Rebelde(nome, idade, genero, traidor, pegarId);
        Localizacao novaLoca = new Localizacao(latitude, longitude, galaxia, pegarId,base);
        Item novoItem = new Item();

        rebeldeRepo.addRebelde(novoRebelde);
        localRepo.addLocal(novaLoca);
        itemRepo.addListaItens(novoItem);
    }
}
