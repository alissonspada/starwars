package org.example.regras;

import org.example.exceptions.ReportarException;

import java.util.ArrayList;
import java.util.List;

public class RegrasReport {

    public void reportRegras(Boolean traidor) throws ReportarException {

        List<String> erro = new ArrayList<>();


        if(traidor == null){
            throw new ReportarException("valor invalido");
        }else if (traidor.equals(true)){
            System.out.println("Rebelde Reportado");
        }


    }

}
