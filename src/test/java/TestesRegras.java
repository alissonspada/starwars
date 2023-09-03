import org.example.exceptions.RegistrarException;
import org.example.regras.RegrasRegistro;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestesRegras {
    RegrasRegistro regraRegistro = new RegrasRegistro();

    @Test
    public void shouldNotRespondWhenNameIsNull(){
        Exception e = Assert.assertThrows(RegistrarException.class, () ->
                regraRegistro.registroRegras(null, 12, "homem", true,324,432,2,"osasco", new ArrayList<>(Arrays.asList(0,0,0,0))));
            Assert.assertTrue(e.getMessage().contains("Nome vazio"));
    }
}
