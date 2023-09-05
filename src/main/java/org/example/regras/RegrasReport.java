package org.example.regras;

import org.example.exceptions.ReportarException;
import org.example.rebelde.Rebelde;

import java.util.ArrayList;
import java.util.List;

public class RegrasReport {

    public void reportRegras(Boolean traidor) throws ReportarException {

        List<String> erro = new ArrayList<>();


        if(traidor == null){
            erro.add("valor invalido");
        }else if (traidor.equals(true)){
            erro.add("traidor reportado");
        }

        if (!erro.isEmpty()) {
            throw new ReportarException(String.join("\n, erro"));
        }
    }

}
