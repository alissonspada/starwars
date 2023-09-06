package org.example.services;

import org.example.exceptions.ReportarException;
import org.example.rebelde.Rebelde;
import org.example.regras.RegrasReport;
import org.example.repository.RebeldeRepository;

public class ReportarService {

    private final RebeldeRepository rebeldeRepo = new RebeldeRepository();

    private final RegrasReport regrasReport = new RegrasReport();


    public void reportarTraidor(Integer id, Rebelde traidor) throws ReportarException {

        regrasReport.reportRegras(traidor.getTraidor());
        rebeldeRepo.getListaRebelde().get(id).setTraidor(true);
    }
}
