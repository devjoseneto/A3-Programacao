package REPOSITORY;

import MODELS.UsuarioModel;
import VIEW.TelaInicialVIEW;
import java.util.Arrays;

public class UsuarioRepository {

    public void cadastrarUser(UsuarioModel usuario) {
        usuario.setLogado(true);
        BancoDeDados.listaDeUsuario.add(usuario);
        BancoDeDados.usuarioLogado = usuario;
    }

    public boolean efetuarLogin(String email, char[] senha) {
        boolean login = false;
        for (UsuarioModel usuario : BancoDeDados.listaDeUsuario) {
            if (email.equals(usuario.getEmail()) && Arrays.equals(senha, usuario.getSenha())) {
                BancoDeDados.usuarioLogado = usuario;
                login = true;
            } else {
                System.out.println("Login falhou");
            }
        }
        return login;
    }

    public UsuarioModel getUsuario() {
        UsuarioModel usuario = null;
        for (int i = 0; i < BancoDeDados.listaDeUsuario.size(); i++) {
            if (BancoDeDados.listaDeUsuario.get(i).isLogado()) {
                usuario = BancoDeDados.listaDeUsuario.get(i);
            }
        }
        return usuario;
    }

    public void excluirUser(String email_, String senha_) {

    }

    public void sair(UsuarioModel usuario) {
        BancoDeDados.usuarioLogado = new UsuarioModel();
    }
}
