package localizacao;

import org.example.exceptions.IdException;
import org.example.exceptions.LocalizacaoException;
import org.example.rebelde.Localizacao;
import org.example.regras.RegrasLocalizacao;
import org.example.repository.LocalizacaoRepository;
import org.example.services.LocalizacaoService;
import org.example.services.RegistroService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestesLocalizacao {

   private final LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();
    private final Localizacao localizacao = new Localizacao();

     private  final RegrasLocalizacao localRegras = new RegrasLocalizacao();

     private final LocalizacaoService localizacaoService = new LocalizacaoService();

     @Test
     public void shouldUpdateLocation() throws LocalizacaoException, IdException {
         Localizacao local;
         localizacaoRepository.addLocal(local = new Localizacao(1,13,12,0,"teste"));
            localizacaoService.atualizarLocal(2,15,12,"teste", 0);
        Assert.assertEquals(local, localizacaoRepository.getListaLocal().get(0));

     }

}
