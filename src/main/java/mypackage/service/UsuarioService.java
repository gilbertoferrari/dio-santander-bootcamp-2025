package mypackage.service;

import mypackage.domain.model.Usuario;

public interface UsuarioService {
    Usuario findById(Long id);
    Usuario create(Usuario usuarioToCreate);
}
