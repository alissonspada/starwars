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
     public void shuouldUpdateLatitude() throws LocalizacaoException, IdException {
        localizacaoRepository.addLocal(new Localizacao(0,11,12,13,"teste"));
            localizacaoService.atualizarLocal(0,11,12,"teste",0);
        Assert.assertEquals(Optional.of(0), localizacaoRepository.getListaLocal().get(0).getLatitude());

     }

}
