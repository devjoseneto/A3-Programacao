package REPOSITORY;

import MODELS.UsuarioModel;
import java.util.ArrayList;
import java.util.Arrays;

public class UsuarioRepository {
    ArrayList<UsuarioModel> listaDeUsuario = new ArrayList<UsuarioModel>();

    public void cadastrarUser(UsuarioModel usuario) {
        listaDeUsuario.add(usuario);
    }

    public boolean efetuarLogin(String email_, char[] senha_) {
        
        return false;
        
    }

    public void excluirUser(String email_, String senha_) {
        
    }

    public void logout() {
        
    }
}
