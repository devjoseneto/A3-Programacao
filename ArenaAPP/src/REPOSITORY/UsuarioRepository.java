package REPOSITORY;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import MODELS.UsuarioModel;
import VIEW.FormCadastroLoginVIEW;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioRepository {

    Connection conn;
    
    public void cadastrarUsuario(UsuarioModel usuario) {
        
        try {
            String sql = "insert into usuario (nome, email, senha, cidade, dataDeNascimento, sexo) values (?, ?, ?, ?, ?, ?);";
            conn = new ConexaoBD().conectaDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getSenha());
            pstm.setString(4, usuario.getCidade());
            pstm.setString(5, usuario.getNascimento());
            pstm.setString(6, String.valueOf(usuario.getSexo()));
            
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Não foi possivel cadastrar usuario");
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*String[] esporte = new String[5];
        for (int i = 0; i < 5; i++) {
        esporte[i] = "";
        }
        usuario.setEsporte(esporte);
        usuario.setLogado(true);
        BancoDeDados.listaDeUsuario.add(usuario);
        BancoDeDados.usuarioLogado = usuario;*/
    }
    
    public ResultSet efetuarLogin(UsuarioModel usuario) {
        conn = new ConexaoBD().conectaDB();
        
        try {
            String sql = "select * from usuario where email = ? and senha = ?;";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getEmail());
            pstm.setString(2, usuario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository: " + ex);
            return null;
        }
    }
    
    public void excluirUsuario(UsuarioModel usuario) {
        for (int i = 0; i < BancoDeDados.listaDeUsuario.size(); i++) {
            if (BancoDeDados.listaDeUsuario.get(i).isLogado()) {
                BancoDeDados.listaDeUsuario.remove(i);
                BancoDeDados.usuarioLogado = new UsuarioModel();
            }
        }
    }
    
    public void alterarDados(String nome, String email, String cidade, String nascimento, char sexo, String descricao, String[] esportes) {
        for (int i = 0; i < BancoDeDados.listaDeUsuario.size(); i++) {
            if (BancoDeDados.listaDeUsuario.get(i).getIdUsuario() == BancoDeDados.usuarioLogado.getIdUsuario()) {
                BancoDeDados.usuarioLogado.setNome(nome);
                BancoDeDados.usuarioLogado.setEmail(email);
                BancoDeDados.usuarioLogado.setCidade(cidade);
                BancoDeDados.usuarioLogado.setNascimento(nascimento);
                BancoDeDados.usuarioLogado.setSexo(sexo);
                BancoDeDados.usuarioLogado.setDescricao(descricao);
                BancoDeDados.usuarioLogado.setEsporte(esportes);
                BancoDeDados.listaDeUsuario.set(i, BancoDeDados.usuarioLogado);
            }
        }
    }
    
    public void sair(UsuarioModel usuario) {
        BancoDeDados.usuarioLogado = new UsuarioModel();
    }
    
    public int getIdade() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date nascimento_ = null;
        try {
            nascimento_ = formato.parse(BancoDeDados.usuarioLogado.getNascimento());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data de nascimento invalida!");
            Logger.getLogger(FormCadastroLoginVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Data de hoje.
        GregorianCalendar calendar = new GregorianCalendar();
        int ano = 0,
                mes = 0, dia = 0;

        // Data do nascimento.
        GregorianCalendar nascimento = new GregorianCalendar();
        int anoNasc = 0, mesNasc = 0, diaNasc = 0;

        // Idade.
        int idade = 0;
        
        if (nascimento_ != null) {
            nascimento.setTime(nascimento_);
            
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
    
    public Date convertToDate(String receivedDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(receivedDate);
        return date;
    }
}
