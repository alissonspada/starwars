package org.example.repository;

import org.example.rebelde.Rebelde;

import java.util.ArrayList;
import java.util.List;

public class RebeldeRepository {
    private static final List<Rebelde> listaRebelde = new ArrayList<>();
    public List<Rebelde> getListaRebelde(){
        return listaRebelde;
    }
    public void addRebelde(Rebelde rebelde) {
        listaRebelde.add(rebelde);

    }
}
