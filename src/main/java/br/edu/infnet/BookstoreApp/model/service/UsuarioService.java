package br.edu.infnet.BookstoreApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.BookstoreApp.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.BookstoreApp.model.domain.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    private Map<String, Usuario> mapaUsuarios = new HashMap<>();

    public void incluir(Usuario usuario) {
        usuarioRepository.save(usuario);
        atualizarMapaUsuarios();
    }

    public Usuario obterPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public Collection<Usuario> obterLista() {
        return (Collection<Usuario>) usuarioRepository.findAll();
    }

    private void atualizarMapaUsuarios() {
        mapaUsuarios.clear();
        for (Usuario usuario : obterLista()) {
            mapaUsuarios.put(usuario.getEmail(), usuario);
        }
    }
}
