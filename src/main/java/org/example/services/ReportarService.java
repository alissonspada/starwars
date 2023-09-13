package org.example.services;

import org.example.rebelde.Rebelde;
import org.example.repository.RebeldeRepository;

public class ReportarService {

    Rebelde rebelde = new Rebelde();
    RebeldeRepository rebeldeRepo = new RebeldeRepository();

    public void reportarRebelde(Integer report){

            rebeldeRepo.getListaRebelde().get(0).aumentarReport();

    }

}
