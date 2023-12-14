package br.edu.infnet.BookstoreApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.BookstoreApp.model.domain.Avaliacao;

@Service
public class AvaliacaoLivroService {

    private Map<Integer, Avaliacao> mapa = new HashMap<>();

    public void incluir(Avaliacao avaliacao) {
        mapa.put(avaliacao.getId(), avaliacao);
    }

    public Collection<Avaliacao> obterLista() {
        return mapa.values();
    }
}
