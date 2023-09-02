package org.example.services;

import org.example.rebelde.Localizacao;
import org.example.rebelde.Rebelde;
import org.example.repository.ItemRepository;
import org.example.repository.LocalizacaoRepository;
import org.example.repository.RebeldeRepository;

public class RebeldeService {

    LocalizacaoRepository localRepo = new LocalizacaoRepository();
    RebeldeRepository rebelRepo = new RebeldeRepository();
    ItemRepository itemRepo = new ItemRepository();


    public void reportarLoc(){
        Localizacao loc = new Localizacao();
        loc.setLongitude(12321321);
        loc.setGalaxia(32);
        loc.setLatitude(3123);
    }

    public void reportTraidor(){
        Rebelde rebelde = new Rebelde();
        if(rebelde.getTraidor()){
            rebelde.setTraidor(true);
        }else {
            rebelde.setTraidor(false);}
    }

    public void traidorTrade(){
        Rebelde traidor = new Rebelde();
    }
}
