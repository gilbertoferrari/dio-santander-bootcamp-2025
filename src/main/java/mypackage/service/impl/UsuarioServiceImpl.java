package mypackage.service.impl;

import mypackage.domain.model.Usuario;
import mypackage.domain.repository.UsuarioRepository;
import mypackage.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioToCreate) {
        if(usuarioRepository.existsByAccountNumber(usuarioToCreate.getConta().getNumero())){
            throw new IllegalArgumentException("Este numero da conta ja existe!");
        }
        return usuarioRepository.save(usuarioToCreate);
    }
}
