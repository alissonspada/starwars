package org.example.regras;

import org.example.exceptions.LocalizacaoException;

import java.util.ArrayList;
import java.util.List;

public class RegrasLocalizacao {

    public void localizacaoRegras (Integer latitude, Integer longitude, Integer galaxia, String base)throws LocalizacaoException {

        List<String> erro = new ArrayList<>();

        if (latitude == null){
            erro.add("valor invalido");
        }

        if(longitude == null){
            erro.add("valor invalido");
        }

        if(galaxia == null){
            erro.add("valor invalido");
        }

        if(base == null){
            erro.add("valor invalido");
        }


    }
}
