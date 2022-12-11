package SERVICES;

import java.sql.ResultSet;
import MODELS.UsuarioModel;
import REPOSITORY.UsuarioRepository;
import static REPOSITORY.UsuarioRepository.usuarioLogado;
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
                usuarioLogado.setIdUsuario(rsEfetuarLogin.getInt("id_usuario"));
                usuarioLogado.setLogado(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou Senha Inválida!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioService" + ex);
        }
        return autenticacao;
    }
    
    public UsuarioModel readUsuario(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        usuario = repository.readEquipe(usuario);
        return usuario;
    }
    
    public int getIdade(String nascimento) {
        UsuarioRepository usuario = new UsuarioRepository();
        int idade = usuario.getIdade(nascimento);
        return idade;
    }

    public void uptadeUsuario(UsuarioModel usuario){
        UsuarioRepository repository = new UsuarioRepository();
        repository.updateUsuario(usuario);
    }

    public void deleteUsuario(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.deleteUsuario(usuario);
    }

    public void sair(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        //repository.sair(usuarioLogado);
    }
}
