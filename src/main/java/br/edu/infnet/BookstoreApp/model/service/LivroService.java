package br.edu.infnet.BookstoreApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.BookstoreApp.model.domain.Livro;

@Service
public class LivroService {
    
    private Map<String, Livro> mapa = new HashMap<>();

    public void incluir(Livro livro){
        mapa.put(livro.getTitulo(), livro);
    }
    
    public Livro obterPorTituloIgnoreCase(String titulo) {
        for (Livro livro : mapa.values()) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
    
    public Collection<Livro> obterLista(){
        return mapa.values();
    }
    
    public Livro obterPorTitulo(String titulo) {
        return mapa.get(titulo);
    }
}
