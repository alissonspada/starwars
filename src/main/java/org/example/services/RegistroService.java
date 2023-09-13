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

    public void registrarRebelde (String nome, Integer idade, String genero, Integer latitude, Integer longitude, Integer galaxia, String base, String comida, String agua, String municao, String arma, Integer report) throws RegistrarException {


            Integer pegarId = rebeldeRepo.getListaRebelde().size();

        Rebelde novoRebelde = new Rebelde(nome, idade, genero, pegarId, report);
        Localizacao novaLoca = new Localizacao(latitude, longitude, galaxia, pegarId,base);
        Item novoItem = new Item(comida, agua, arma, municao);


        rebeldeRepo.addRebelde(novoRebelde);
        localRepo.addLocal(novaLoca);
        itemRepo.addListaItens(novoItem);
    }
}
