package org.example.services;

import org.example.exceptions.IdException;
import org.example.exceptions.LocalizacaoException;
import org.example.regras.RegrasId;
import org.example.regras.RegrasLocalizacao;
import org.example.repository.LocalizacaoRepository;

public class LocalizacaoService {
    private final LocalizacaoRepository localRepo = new LocalizacaoRepository();
    private final RegrasLocalizacao regrasLocalizacao = new RegrasLocalizacao();
    private final RegrasId regrasId = new RegrasId();

    public void atualizarLocal(Integer latitude, Integer longitude, Integer galaxia, String base, Integer id) throws LocalizacaoException, IdException {
        regrasId.idRegras(id);
        regrasLocalizacao.localizacaoRegras(latitude,longitude, galaxia, base);
        localRepo.getListaLocal().get(id).setNovaLoc(latitude,longitude, galaxia, base);
    }
}
