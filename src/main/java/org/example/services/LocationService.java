package org.example.services;

import org.example.repository.LocalizacaoRepository;

public class LocationService {
    private final LocalizacaoRepository localRepo = new LocalizacaoRepository();

    public void atualizarLocal(Integer id, Integer latitude, Integer longitude, Integer galaxia){
        localRepo.getListaLocal().get(id).setNewLocation(latitude, longitude, galaxia);
        System.out.println("(Location Update) auau");
    }
}
