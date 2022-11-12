package classes;

import java.util.ArrayList;

public class Login {

    ArrayList<Usuario> listaDeUsuario = new ArrayList<Usuario>();
    Usuario usuarioLogado = new Usuario();

    public void cadastrarUser(String nome_, String email_,
            String senha_, String cidade_,
            String nascimento_) {
        Usuario user = new Usuario();
        user.setNome(nome_);
        user.setEmail(email_);
        user.setSenha(senha_);
        user.setCidade(cidade_);
        user.setNascimento(nascimento_);
        user.setLogado(true);
        listaDeUsuario.add(user);
    }

    public void efetuarLogin(String email_, String senha_) {
        for (int i = 0; i < listaDeUsuario.size(); i++) {
            if (email_.equals(listaDeUsuario.get(i).getEmail())) {
                if (senha_.equals(listaDeUsuario.get(i).getSenha())) {
                    listaDeUsuario.get(i).setLogado(true);
                    usuarioLogado = listaDeUsuario.get(i);
                } else {
                    // imprimir senha incorreta
                }
            } else {
                // imprimir email incorreto
            }
        }
    }

    public void excluirUser(String email_, String senha_) {
        // Confirmar exclusão de conta na interface
        for (int i = 0; i < listaDeUsuario.size(); i++) {
            if (email_.equals(listaDeUsuario.get(i).getEmail()))
                listaDeUsuario.remove(i);
        }
    }

    public void logout() {
            for (int i = 0; i < listaDeUsuario.size(); i++) {
                if (listaDeUsuario.get(i).getEmail().equals(usuarioLogado.getEmail())) {
                    listaDeUsuario.get(i).setLogado(false);
                    usuarioLogado.setLogado(false);
                }
        }
    }

}
