package org.example.regras;

import org.example.exceptions.LocalizacaoException;

import java.util.ArrayList;
import java.util.List;

public class RegrasLocalizacao {

    public void localizacaoRegras (Integer latitude, Integer longitude, Integer galaxia, String base)throws LocalizacaoException {


        if (latitude == null){
          throw new LocalizacaoException ("valor invalido");
        }

        if(longitude == null){
            throw new LocalizacaoException ("valor invalido");
        }

        if(galaxia == null){
            throw new LocalizacaoException ("valor invalido");
        }

        if(base == null){
            throw new LocalizacaoException ("valor invalido");
        }


    }
}
