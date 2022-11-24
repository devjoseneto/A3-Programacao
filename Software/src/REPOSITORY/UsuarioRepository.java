package REPOSITORY;

import MODELS.UsuarioModel;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsuarioRepository {

    public void cadastrarUser(UsuarioModel usuario) {
        String[] esporte = new String[5];
        for (int i = 0; i < 5; i++) {
            esporte[i] = "";
        }
        usuario.setEsporte(esporte);
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

    public void excluirUsuario(UsuarioModel usuario) {
        for (int i = 0; i < BancoDeDados.listaDeUsuario.size(); i++) {
            if (BancoDeDados.listaDeUsuario.get(i).isLogado()) {
                BancoDeDados.listaDeUsuario.remove(i);
                BancoDeDados.usuarioLogado = new UsuarioModel();
            }
        }
    }
    
    public void alterarDados(String nome, String email, String cidade, Date nascimento, char sexo, String sobre, String[] esportes) {
        for (int i = 0; i < BancoDeDados.listaDeUsuario.size(); i++) {
            if (BancoDeDados.listaDeUsuario.get(i).getId() == BancoDeDados.usuarioLogado.getId()) {
                BancoDeDados.usuarioLogado.setNome(nome);
                BancoDeDados.usuarioLogado.setEmail(email);
                BancoDeDados.usuarioLogado.setCidade(cidade);
                BancoDeDados.usuarioLogado.setNascimento(nascimento);
                BancoDeDados.usuarioLogado.setSexo(sexo);
                BancoDeDados.usuarioLogado.setSobre(sobre);
                BancoDeDados.usuarioLogado.setEsporte(esportes);
                BancoDeDados.listaDeUsuario.set(i, BancoDeDados.usuarioLogado);
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
        int anoNasc = 0, mesNasc = 0, diaNasc = 0;

        // Idade.
        int idade = 0;

        if (BancoDeDados.usuarioLogado.getNascimento() != null) {
            nascimento.setTime(BancoDeDados.usuarioLogado.getNascimento());

            ano = calendar.get(GregorianCalendar.YEAR);
            mes = calendar.get(GregorianCalendar.MONTH) + 1;
            dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);

            anoNasc = nascimento.get(GregorianCalendar.YEAR);
            mesNasc = nascimento.get(GregorianCalendar.MONTH) + 1;
            diaNasc = nascimento.get(GregorianCalendar.DAY_OF_MONTH);

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
