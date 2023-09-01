package org.example.repository;

import org.example.rebel.Localizacao;

import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {

    private final List<Localizacao> listaLocal = new ArrayList<>();
    public List<Localizacao> getListaLocal(){
        return listaLocal;
    }
    public void addLocal(Localizacao local){
        listaLocal.add(local);
    }
}
