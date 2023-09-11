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

        Rebelde rebelde = new Rebelde();
        registroService.registrarRebelde("xupinga", 12, "masculino", 12,13, 14, "aruja", "comida", "agua", "municao", "arma");
        rebeldeRepository.addRebelde(new Rebelde());
        Assert.assertEquals(rebelde, rebeldeRepository.getListaRebelde());
    }

    @Test
    public void shouldNotRespondWhenNameIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras(null, 12, "homem", 324,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("Nome inválido"));
    }

    @Test
    public void shouldNotRespondWhenAgeIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", null, "homem", 324,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("Idade Inválida"));
    }

    @Test
    public void shouldNotRespondWhenGeneroIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, null, 324,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("Genero Indefinido"));
    }

    @Test
    public void shouldNotRespondWhenTraidorIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", null,324,432,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }

    @Test
    public void shouldNotRespondWhenLatitudeIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", null,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }

    @Test
    public void shouldNotRespondWhenLongitudeIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", 321,null,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }

    @Test
    public void shouldNotRespondWhenGalaxiaIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", 321,12,null,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }

    @Test
    public void shouldNotRespondWhenItemIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", 321,12,2,null, new ArrayList<>(Arrays.asList(null,null,null,null))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }
}
