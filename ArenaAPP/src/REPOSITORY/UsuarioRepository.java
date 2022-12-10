package REPOSITORY;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import MODELS.UsuarioModel;
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
    PreparedStatement pstm;
    public static UsuarioModel usuarioLogado = new UsuarioModel();

    public void cadastrarUsuario(UsuarioModel usuario) throws SQLException {
        ResultSet rsEfetuarLogin = this.verificarSeExiste(usuario);

        if (rsEfetuarLogin.next()) {
            JOptionPane.showMessageDialog(null, "Esse usuario já está cadastrado");
        } else {
            try {

                String sql = "insert into usuario (nome, email, senha, cidade, dataDeNascimento, sexo) values (?, ?, ?, ?, ?, ?);";
                conn = new ConexaoBD().conectaDB();
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, usuario.getNome());
                pstm.setString(2, usuario.getEmail());
                pstm.setString(3, usuario.getSenha());
                pstm.setString(4, usuario.getCidade());
                pstm.setString(5, usuario.getNascimento());
                pstm.setString(6, String.valueOf(usuario.getSexo()));

                pstm.execute();
                pstm.close();
                usuarioLogado = usuario;

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "UsuarioRepository: " + ex);
                Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ResultSet efetuarLogin(UsuarioModel usuario) {
        conn = new ConexaoBD().conectaDB();

        try {
            String sql = "select * from usuario where email = ? and senha = ?;";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getEmail());
            pstm.setString(2, usuario.getSenha());

            ResultSet rs = pstm.executeQuery();
            usuarioLogado = usuario;
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository: " + ex);
            return null;
        }
    }

    public UsuarioModel readEquipe(UsuarioModel usuario) {
        // usuario - informações para pesquisar no banco de dados
        // usuario_ - para receberem informações do bando de dados
        UsuarioModel usuario_ = new UsuarioModel();
        String sql = "select * from usuario WHERE id_usuario = ?;";
        conn = new ConexaoBD().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, Integer.toString(usuario.getIdUsuario()));

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                usuario_.setIdUsuario(rs.getInt("id_usuario"));
                usuario_.setNome(rs.getString("nome"));
                usuario_.setEmail(rs.getString("email"));
                usuario_.setCidade(rs.getString("cidade"));
                usuario_.setNascimento(rs.getString("dataDeNascimento"));
                usuario_.setBiografia(rs.getString("biografia"));
                usuario_.setSexo(rs.getString("sexo").charAt(0));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository Read Equipe" + ex);
            usuario_ = null;
        }
        return usuario_;
    }

    public void excluirUsuario(UsuarioModel usuario) {
        /*for (int i = 0; i < BancoDeDados.listaDeUsuario.size(); i++) {
        if (BancoDeDados.listaDeUsuario.get(i).isLogado()) {
        BancoDeDados.listaDeUsuario.remove(i);
        BancoDeDados.usuarioLogado = new UsuarioModel();
        }
        }*/
    }

    public void alterarDados(String nome, String email, String cidade, String nascimento, char sexo, String descricao, String[] esportes) {

    }

    public void sair(UsuarioModel usuario) {
        usuarioLogado = new UsuarioModel();
    }

    public ResultSet verificarSeExiste(UsuarioModel usuario) {
        conn = new ConexaoBD().conectaDB();

        try {
            String sql = "select * from usuario where email = ?;";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getEmail());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository: " + ex);
            return null;
        }
    }

    public int getIdade(String nascimentoUsuario) {
        // nascimentoUsuario traz os dados de data do mysql (yyyy/mm/dd)
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date nascimento_ = null;
        try {
            nascimento_ = formato.parse(nascimentoUsuario.replace("-", "/"));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data de nascimento invalida!");
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
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
}
