package org.example.services;

import org.example.exceptions.IdException;
import org.example.exceptions.LocalizacaoException;
import org.example.rebelde.Localizacao;
import org.example.regras.RegrasLocalizacao;
import org.example.repository.LocalizacaoRepository;

public class LocalizacaoService {
    private final LocalizacaoRepository localRepo = new LocalizacaoRepository();
    private final RegrasLocalizacao regrasLocalizacao = new RegrasLocalizacao();



    public void atualizarLocal(Integer latitude, Integer longitude, Integer galaxia, String base, Integer id) throws LocalizacaoException, IdException {


        regrasLocalizacao.localizacaoRegras(latitude,longitude, galaxia, base);

        localRepo.addLocal(new Localizacao(latitude, longitude, galaxia, id, base));
        localRepo.getListaLocal().get(id).setNovaLoc(latitude,longitude, galaxia, base);

    }
}
