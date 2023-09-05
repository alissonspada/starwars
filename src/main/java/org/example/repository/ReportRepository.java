package org.example.repository;

import org.example.rebelde.Rebelde;

import java.util.ArrayList;
import java.util.List;

public class ReportRepository {

    private final List<Rebelde> listaTraidor= new ArrayList<>();

    private List<Rebelde> getListaTraidor(){
        return listaTraidor;
    }

}
