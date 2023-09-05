import org.example.rebelde.Localizacao;
import org.example.regras.RegrasId;
import org.example.regras.RegrasLocalizacao;
import org.example.repository.LocalizacaoRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestesLocalizacao {

   private final LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();
    private final Localizacao localizacao = new Localizacao();
     private final RegrasId regrasId = new RegrasId();

     @Test
     public void shouldUpdateLocation(){
          localizacaoRepository.addLocal(new Localizacao(1, 2, 3, 4, "itaquaquecetuba"));

     }

}
