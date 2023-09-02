package org.example.services;

import org.example.repository.LocalizacaoRepository;

public class LocationService {
    private final LocalizacaoRepository localRepo = new LocalizacaoRepository();

    public void atualizarLocal(Integer id, Integer latitude, Integer longitude, Integer galaxia, String base){
        localRepo.getListaLocal().get(id).setNewLocation(latitude, longitude, galaxia, base);
        System.out.println("(Location Update) auau");
    }
}
