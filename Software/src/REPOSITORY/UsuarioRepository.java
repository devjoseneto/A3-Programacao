package REPOSITORY;

import MODELS.UsuarioModel;
import VIEW.TelaInicialVIEW;
import java.util.Arrays;
import java.util.GregorianCalendar;

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

    public void excluirUsuario(UsuarioModel usuario) {
        for (int i = 0; i < BancoDeDados.listaDeUsuario.size(); i++) {
            if (BancoDeDados.listaDeUsuario.get(i).isLogado()) {
                BancoDeDados.listaDeUsuario.remove(i);
                BancoDeDados.usuarioLogado = new UsuarioModel();
            }
        }
    }

    public void sair(UsuarioModel usuario) {
        BancoDeDados.usuarioLogado = new UsuarioModel();
    }

    public int getIdade() {

        // Data de hoje.
        GregorianCalendar calendar = new GregorianCalendar();
        int ano = 0,
                mes = 0, dia = 0;

        // Data do nascimento.
        GregorianCalendar nascimento = new GregorianCalendar();
        int anoNasc = 0,
                mesNasc = 0, diaNasc = 0;

        // Idade.
        int idade = 0;

        if (BancoDeDados.usuarioLogado.getNascimento() != null) {
            nascimento.setTime(BancoDeDados.usuarioLogado.getNascimento());

            ano = calendar.get(calendar.YEAR);
            mes = calendar.get(calendar.MONTH) + 1;
            dia = calendar.get(calendar.DAY_OF_MONTH);

            anoNasc = nascimento.get(calendar.YEAR);
            mesNasc = nascimento.get(calendar.MONTH) + 1;
            diaNasc = nascimento.get(calendar.DAY_OF_MONTH);

            idade = ano - anoNasc;

            // Calculando diferencas de mes e dia.
            if (mes < mesNasc) {
                idade--;
            } else {
                if (dia < diaNasc) {
                    idade--;
                }
            }

            // Ultimo teste, idade "negativa".
            if (idade < 0) {
                idade = 0;
            }

        }

        return (idade);

    }
}
