package SERVICES;

import MODELS.EquipeModel;
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
                usuarioLogado.setId_usuario(rsEfetuarLogin.getInt("id_usuario"));
                usuarioLogado.setId_equipe(rsEfetuarLogin.getInt("fk_equipe"));
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
        usuario = repository.readUsuario(usuario);
        return usuario;
    }

    public void uptadeUsuario(UsuarioModel usuario){
        UsuarioRepository repository = new UsuarioRepository();
        repository.updateUsuario(usuario);
    }

    public void deleteUsuario(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.deleteUsuario(usuario);
    }
    
    public void setEquipe(UsuarioModel usuario, EquipeModel equipe) throws SQLException {
        UsuarioRepository repository = new UsuarioRepository();
        repository.setEquipe(usuario, equipe);
    }
    
    public void removeEquipe(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        repository.removeEquipe(usuario);
    }

    public void sair(UsuarioModel usuario) {
        UsuarioRepository repository = new UsuarioRepository();
        //repository.sair(usuarioLogado);
    }
    
    public int getIdade(String nascimento) {
        UsuarioRepository usuario = new UsuarioRepository();
        int idade = usuario.getIdade(nascimento);
        return idade;
    }
}
