package br.com.ebac.usuario_service.services;

import br.com.ebac.usuario_service.entities.Usuario;
import br.com.ebac.usuario_service.repositories.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Component
public class ServicoUsuario {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario novoUsuario(Usuario usuario) {
        usuario.setDataCadastro(Date.valueOf(LocalDate.now()));
        return repositorioUsuario.save(usuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return repositorioUsuario.findAll();
    }

}
