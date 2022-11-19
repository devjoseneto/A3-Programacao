package SERVICES;

import MODELS.UsuarioModel;
import REPOSITORY.UsuarioRepository;

public class UsuarioService {
    public void cadastrarUsuario(String nome, String email, char[] senha, String cidade, String nascimento, char sexo) {
        UsuarioModel usuario = new UsuarioModel(nome, email, senha, cidade, nascimento, sexo);
        UsuarioRepository repository = new UsuarioRepository();
        repository.cadastrarUser(usuario);
    }
}
