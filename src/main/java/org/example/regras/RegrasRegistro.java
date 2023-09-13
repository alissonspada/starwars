package org.example.regras;

import org.example.exceptions.RegistrarException;

import java.util.ArrayList;
import java.util.List;

public class RegrasRegistro{

        public void registroRegras(String nome, Integer idade, String genero, Integer latitude, Integer longitude, Integer galaxia, String base) throws RegistrarException{

            List<String> erro = new ArrayList<>();


            if (nome == null){
                throw new RegistrarException("Nome inválido");
            }else if (nome.isBlank()){
                throw new RegistrarException("nome em branco");
            }

            if (idade == null) {
                throw new RegistrarException("Idade Invalida");
            }

            if (genero == null){
                throw new RegistrarException("Genero Indefinido");
            } else if (!genero.equals("masculino") &&
            !genero.equals("feminino")){
                throw new RegistrarException("genero incorreto: escolha homem ou mulher");
            }


            if (latitude == null){
                throw new RegistrarException("valor invalido");
            }

            if (longitude == null){
                throw new RegistrarException("valor invalido");
            }

            if (galaxia == null){
                throw new RegistrarException("valor invalido");
            }

            if (base == null){
                throw new RegistrarException("valor invalido");
            }


            if(!erro.isEmpty()){
                throw new RegistrarException(String.join("null", erro));
            }
        }
}
