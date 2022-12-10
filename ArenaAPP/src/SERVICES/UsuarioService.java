package SERVICES;

import MODELS.EquipeModel;
import java.sql.ResultSet;
import MODELS.UsuarioModel;
import REPOSITORY.EquipeRepository;
import REPOSITORY.UsuarioRepository;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioService {

    public void cadastrarUsuario(String nome, String email, char[] senha_, String cidade, String nascimento, char sexo) throws SQLException {
        String senha = new String(senha_);
        UsuarioModel usuario = new UsuarioModel(nome, email, senha, cidade, nascimento, sexo);
        UsuarioRepository repository = new UsuarioRepository();
        repository.cadastrarUsuario(usuario);
    }

    public boolean efetuarLogin(UsuarioModel usuario) {
        boolean autenticacao = false;
        try {
            UsuarioRepository repository = new UsuarioRepository();
            ResultSet rsEfetuarLogin = repository.efetuarLogin(usuario);

            if (rsEfetuarLogin.next()) {
                autenticacao = true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou Senha Inválida!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioService" + ex);
        }
        return autenticacao;
    }
    
    public UsuarioModel readEquipe(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        usuario = repository.readEquipe(usuario);
        return usuario;
    }
    
    public int getIdade(String nascimento) {
        UsuarioRepository usuario = new UsuarioRepository();
        int idade = usuario.getIdade(nascimento);
        return idade;
    }

    public void alterarDados(String nome, String email, String cidade, String nascimento, char sexo, String sobre, String[] esportes) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.alterarDados(nome, email, cidade, nascimento, sexo, sobre, esportes);
    }

    public void excluir(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.excluirUsuario(usuario);
    }

    public void sair(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.sair(UsuarioRepository.usuarioLogado);
    }
}
