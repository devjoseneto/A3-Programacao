package REPOSITORY;

import MODELS.UsuarioModel;

public class UsuarioRepository {

    public void cadastrarUser(UsuarioModel usuario) {
        usuario.setLogado(true);
        BancoDeDados.listaDeUsuario.add(usuario);
    }

    public boolean efetuarLogin(String email_, char[] senha_) {
        
        return false;
        
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

    public void logout() {
        
    }
}
