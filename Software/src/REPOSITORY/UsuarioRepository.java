package REPOSITORY;

import java.sql.Connection;
import java.sql.PreparedStatement;
import MODELS.UsuarioModel;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioRepository {
    
    Connection conn;
    
    public void cadastrarUsuario(UsuarioModel usuario) {
       
        try {
            String sql = "insert into usuario (email, nome, dataDeNascimento, senha, sexo, cidade) values(?,?,?,?,?,?)";
            
            conn = new ConexaoBD().conectaDB();
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getNome());
            stmt.setDate(3, (java.sql.Date) usuario.getDataDeNascimento());
            stmt.setCharacterStream(4, usuario.setSenha());
            stmt.setCharacterStream(5, usuario.setSexo());
            stmt.setString(6, usuario.getCidade());
            
            stmt.execute();
            stmt.close();
            
            
            /*String[] esporte = new String[5];
            for (int i = 0; i < 5; i++) {
            esporte[i] = "";
            }
            usuario.setEsporte(esporte);
            usuario.setLogado(true);
            BancoDeDados.listaDeUsuario.add(usuario);
            BancoDeDados.usuarioLogado = usuario;*/
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                BancoDeDados.usuarioLogado.setDataDeNascimento(nascimento);
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

        if (BancoDeDados.usuarioLogado.getDataDeNascimento() != null) {
            nascimento.setTime(BancoDeDados.usuarioLogado.getDataDeNascimento());

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
