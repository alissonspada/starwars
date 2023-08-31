package org.example.services;

import org.example.Rebel.Localizacao;
import org.example.Rebel.Rebelde;

public class RebeldeService {

    public Rebelde rebelde;


    public Localizacao reportarLoc(){
        Localizacao loc = new Localizacao();
        loc.setLongitude(12321321);
        loc.setGalaxia(32);
        loc.setLatitude(3123);
        return loc;
    }

}
