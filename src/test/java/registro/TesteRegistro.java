package registro;

import org.example.exceptions.RegistrarException;
import org.example.regras.RegrasRegistro;
import org.example.repository.ItemRepository;
import org.example.repository.LocalizacaoRepository;
import org.example.repository.RebeldeRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TesteRegistro {


    RegrasRegistro regrasRegistro = new RegrasRegistro();

    @Test
    public void shouldNotRespondWhenNameIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras(null, 12, "homem", true,324,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("Nome inválido"));
    }

    @Test
    public void shouldNotRespondWhenAgeIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", null, "homem", true,324,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("Idade Inválida"));
    }

    @Test
    public void shouldNotRespondWhenGeneroIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, null, true,324,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("Genero Indefinido"));
    }

    @Test
    public void shouldNotRespondWhenTraidorIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", null,324,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }

    @Test
    public void shouldNotRespondWhenLatitudeIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", true,null,432,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }

    @Test
    public void shouldNotRespondWhenLongitudeIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", true,321,null,2,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }

    @Test
    public void shouldNotRespondWhenGalaxiaIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", true,321,12,null,"osasco", new ArrayList<>(Arrays.asList(1,2,3,4))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }

    @Test
    public void shouldNotRespondWhenItemIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regrasRegistro.registroRegras("adalberto", 12, "masculino", true,321,12,2,null, new ArrayList<>(Arrays.asList(null,null,null,null))));
        Assert.assertTrue(e.getMessage().contains("valor invalido"));
    }
}
