package org.example.services;

import org.example.exceptions.ReportarException;
import org.example.rebelde.Rebelde;
import org.example.regras.RegrasId;
import org.example.regras.RegrasReport;
import org.example.repository.RebeldeRepository;

public class ReportarService {

    private final RebeldeRepository rebeldeRepo = new RebeldeRepository();
    private final RegrasId regrasId = new RegrasId();
    private final RegrasReport regrasReport = new RegrasReport();


    public void reportarTraidor(Integer id, Rebelde traidor) throws ReportarException {
        regrasId.idRegras(id);
        regrasReport.reportRegras(traidor);
        rebeldeRepo.getListaRebelde().get(id).setTraidor(true);
    }
}
