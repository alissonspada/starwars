package registro;

import org.example.exceptions.RegistrarException;
import org.example.rebelde.Localizacao;
import org.example.rebelde.Rebelde;
import org.example.regras.RegrasRegistro;
import org.example.repository.ItemRepository;
import org.example.repository.LocalizacaoRepository;
import org.example.repository.RebeldeRepository;
import org.example.services.RegistroService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteRegistro {


    RegrasRegistro regrasRegistro = new RegrasRegistro();
    RebeldeRepository rebeldeRepository = new RebeldeRepository();
    RegistroService registroService = new RegistroService();

    @Test
    public void shouldRegisterARebel() throws RegistrarException {

        Rebelde rebelde;
        rebeldeRepository.addRebelde(rebelde = new Rebelde("teste",1,"masculino",0,1));
        registroService.registrarRebelde("teste",1,"masculino",3,4,1,"au","sim","sim", "sim","sim",1);
        Assert.assertEquals(rebelde, rebeldeRepository.getListaRebelde().get(0));
    }


}
