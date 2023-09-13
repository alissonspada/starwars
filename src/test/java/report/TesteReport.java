package report;

import org.example.exceptions.RegistrarException;
import org.example.exceptions.ReportarException;
import org.example.rebelde.Rebelde;
import org.example.regras.RegrasReport;
import org.example.repository.RebeldeRepository;
import org.example.services.RegistroService;
import org.example.services.ReportarService;
import org.junit.Test;

import java.util.Collections;

public class TesteReport {

    private final RebeldeRepository rebeldeRepo = new RebeldeRepository();
    private final RegrasReport regrasReport = new RegrasReport();

    private final Rebelde rebelde = new Rebelde();
    private final RegistroService registro = new RegistroService();

    private final ReportarService reportService = new ReportarService();


    @Test
    public void shouldReturnTraitor() throws ReportarException, RegistrarException {
        Rebelde rebel;
        rebeldeRepo.addRebelde(rebel = new Rebelde("rozivaldo",1,"masculino",2,0));
        registro.registrarRebelde("xupinga", 12, "masculino", 12,13, 14, "aruja", "comida", "agua", "municao", "arma", 0);
        rebeldeRepo.getListaRebelde().get(0).getReport();
        reportService.reportarRebelde(0);


    }
}
