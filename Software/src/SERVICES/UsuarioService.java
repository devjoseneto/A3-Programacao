package SERVICES;

import MODELS.UsuarioModel;
import REPOSITORY.BancoDeDados;
import REPOSITORY.UsuarioRepository;
import java.util.Date;

public class UsuarioService {
    public void cadastrarUsuario(String nome, String email, char[] senha, String cidade, Date nascimento, char sexo) {
        UsuarioModel usuario = new UsuarioModel(nome, email, senha, cidade, nascimento, sexo);
        UsuarioRepository repository = new UsuarioRepository();
        repository.cadastrarUser(usuario);
    }
    
    public boolean efetuarLogin(String email, char[] senha) {
        UsuarioRepository repository = new UsuarioRepository();
        boolean login = repository.efetuarLogin(email, senha);
        return login;
    }
    
    public void alterarDados(String nome, String email, String cidade, Date nascimento, char sexo, String sobre, String[] esportes) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.alterarDados(nome, email, cidade, nascimento, sexo, sobre, esportes);
    }
    
    public void excluir(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.excluirUsuario(usuario);
    }

    public void sair(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.sair(BancoDeDados.usuarioLogado);
    }
}
