package org.example.repository;

import org.example.rebel.Rebelde;

import java.util.ArrayList;
import java.util.List;

public class RebeldeRepository {
    private final List<Rebelde> listaRebelde = new ArrayList<>();
    public List<Rebelde> getListaRebelde(){
        return listaRebelde;
    }
    public void addRebelde(Rebelde rebelde) {
        listaRebelde.add(rebelde);
    }
}
