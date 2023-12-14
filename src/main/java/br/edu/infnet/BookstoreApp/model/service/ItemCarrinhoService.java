package br.edu.infnet.BookstoreApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.BookstoreApp.model.domain.ItemDeCarrinho;

@Service
public class ItemCarrinhoService {
    
    private Map<Integer, ItemDeCarrinho> mapa = new HashMap<>();

    public void incluir(ItemDeCarrinho itemCarrinho){
        mapa.put(itemCarrinho.getId(), itemCarrinho);
    }
    
    public Collection<ItemDeCarrinho> obterLista(){
        return mapa.values();
    }
}
