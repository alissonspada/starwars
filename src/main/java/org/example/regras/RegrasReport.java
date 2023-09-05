package org.example.regras;

import org.example.exceptions.ReportarException;
import org.example.rebelde.Rebelde;

import java.util.ArrayList;
import java.util.List;

public class RegrasReport {

    public void reportRegras(Rebelde traidor) throws ReportarException {

        List<String> erro = new ArrayList<>();


        if(traidor == null){
            erro.add("valor invalido");
        }else if (traidor.getTraidor()){
            System.out.println("traidor reportado");
        }
    }

}
