package org.example.regras;

import org.example.exceptions.RegistrarException;

import java.util.ArrayList;
import java.util.List;

public class RegrasRegistro {

        public void registroRegras(String nome, Integer idade, String genero, Boolean traidor, Integer latitude, Integer longitude, Integer galaxia, String base, List<Integer> inventory) throws RegistrarException{

            List<String> erro = new ArrayList<>();

            if (nome == null){
                erro.add("Nome inválido");
            }else if (nome.isBlank()){
                erro.add("nome em branco");
            }

            if (idade == null) {
                erro.add("idade nula");
            } else if (idade < 18){
                erro.add("menor de idade");
            }

            if (genero == null){
                erro.add("genero indefinido");
            } else if (!genero.equals("homem") &&
            !genero.equals("mulher")){
                erro.add("genero incorreto: escola homem ou mulher");
            }

            if (traidor == null){
                erro.add("valor invalido");
            }   else if (!traidor.equals("sim") &&
                !traidor.equals("nao")){
                erro.add("valor invalido: escolha sim ou nao");
            };

            if (latitude == null){
                erro.add("valor invalido");
            }

            if (longitude == null){
                erro.add("valor invalido");
            }

            if (galaxia == null){
                erro.add("valor invalido");
            }

            if (base == null){
                erro.add("valor invalido");
            }

            if (inventory == null){
                erro.add("valor invalido");
            }


        }
}
