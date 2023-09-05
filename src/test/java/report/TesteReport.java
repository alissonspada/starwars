package report;

import org.example.exceptions.RegistrarException;
import org.example.exceptions.ReportarException;
import org.example.rebelde.Rebelde;
import org.example.regras.RegrasReport;
import org.example.repository.RebeldeRepository;
import org.example.repository.ReportRepository;
import org.junit.Assert;
import org.junit.Test;

public class TesteReport {

    private final RebeldeRepository rebeldeRepo = new RebeldeRepository();
    private final RegrasReport regrasReport = new RegrasReport();


    @Test
    public void shouldReturnTraitor() throws ReportarException {

        Exception e = Assert.assertThrows(ReportarException.class, () ->
            regrasReport.reportRegras(true));
        Assert.assertTrue(e.getMessage().contains("teste"));

    }
}
