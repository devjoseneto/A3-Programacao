package SERVICES;

import MODELS.UsuarioModel;
import REPOSITORY.BancoDeDados;
import REPOSITORY.UsuarioRepository;

public class UsuarioService {
    public void cadastrarUsuario(String nome, String email, char[] senha, String cidade, String nascimento, char sexo) {
        UsuarioModel usuario = new UsuarioModel(nome, email, senha, cidade, nascimento, sexo);
        UsuarioRepository repository = new UsuarioRepository();
        repository.cadastrarUser(usuario);
    }
    
    public boolean efetuarLogin(String email, char[] senha) {
        UsuarioRepository repository = new UsuarioRepository();
        boolean login = repository.efetuarLogin(email, senha);
        return login;
    }

    public void sair(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.sair(BancoDeDados.usuarioLogado);
    }
}
