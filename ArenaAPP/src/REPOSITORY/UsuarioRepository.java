package REPOSITORY;

import MODELS.EquipeModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import MODELS.UsuarioModel;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        ResultSet rsVerificar = this.verificarSeExiste(usuario);
        if (rsVerificar.next()) {
            JOptionPane.showMessageDialog(null, "Esse email já está cadastrado");
        } else {
            try {

                String sql = "insert into usuario (nome, email, senha, cidade, dataDeNascimento, sexo) values (?, ?, ?, ?, ?, ?);";
                conn = new ConexaoBD().conectaDB();
                pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pstm.setString(1, usuario.getNome());
                pstm.setString(2, usuario.getEmail());
                pstm.setString(3, usuario.getSenha());
                pstm.setString(4, usuario.getCidade());
                pstm.setString(5, usuario.getNascimento());
                pstm.setString(6, String.valueOf(usuario.getSexo()));

                pstm.execute();

                ResultSet rs = pstm.getGeneratedKeys();
                if (rs.next()) {
                    usuarioLogado.setId_usuario(rs.getInt(1));
                }

                pstm.close();
                usuarioLogado.setLogado(true);

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
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository: " + ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public UsuarioModel readUsuario(UsuarioModel usuario) {
        // usuario - informações para pesquisar no banco de dados
        // usuario_ - para receberem informações do bando de dados
        UsuarioModel usuario_ = new UsuarioModel();
        String sql = "select * from usuario WHERE id_usuario = ?;";
        conn = new ConexaoBD().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, Integer.toString(usuario.getId_usuario()));

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                usuario_.setId_usuario(rs.getInt("id_usuario"));
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
    
    public ArrayList<UsuarioModel> readAllUsuarios() {
        ArrayList<UsuarioModel> jogadores = new ArrayList<>();
        String sql = "select * from usuario where fk_equipe = ?;";
        conn = new ConexaoBD().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(usuarioLogado.getId_equipe()));
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                UsuarioModel usuario = new UsuarioModel();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCidade(rs.getString("cidade"));
                
                jogadores.add(usuario);
            }
            pstm.close();
            return jogadores;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository readAllMedicamentos"+ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }

    public void updateUsuario(UsuarioModel usuario) {
        try {
            String sql = "update usuario\n"
                    + "set nome = ?,\n"
                    + "email = ?,\n"
                    + "dataDeNascimento = ?,\n"
                    + "senha = ?,\n"
                    + "sexo = ?,\n"
                    + "biografia = ?,\n"
                    + "cidade = ?\n"
                    + "where id_usuario = ?;";
            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getNascimento());
            pstm.setString(4, usuario.getSenha());
            pstm.setString(5, String.valueOf(usuario.getSexo()));
            pstm.setString(6, usuario.getBiografia());
            pstm.setString(7, usuario.getCidade());
            pstm.setString(8, String.valueOf(usuario.getId_usuario()));

            pstm.execute();
            pstm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository: " + ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteUsuario(UsuarioModel usuario) {
        try {
            String sql = "delete from usuario where id_usuario = ?";

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(usuario.getId_usuario()));

            pstm.execute();
            pstm.close();

            usuarioLogado = new UsuarioModel();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository delete: " + ex);
            Logger.getLogger(EquipeRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setEquipe(UsuarioModel usuario, EquipeModel equipe) throws SQLException {
        boolean verificar = this.verificarSeJaTemEquipe(usuario);
        // true = ele ja tem equipe
        if (verificar) {
            JOptionPane.showMessageDialog(null, "Esse usuario já pertence a uma equipe");
        } else {
            usuario = readUsuario(usuario);
            String label = "Você quer mesmo adicionar o " + usuario.getNome() + " ( UserID: " + usuario.getId_usuario() + ") a sua equipe?";
            int confirmar = JOptionPane.showConfirmDialog(null, label);
            if (confirmar == JOptionPane.YES_OPTION) {
                try {

                    String sql = "update usuario set fk_equipe = ? where id_usuario = ?;";
                    conn = new ConexaoBD().conectaDB();
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, String.valueOf(equipe.getIdEquipe()));
                    pstm.setString(2, String.valueOf(usuario.getId_usuario()));

                    pstm.execute();
                    pstm.close();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "UsuarioRepository setEquipe: " + ex);
                    Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void removeEquipe(UsuarioModel usuario) {
        usuario = readUsuario(usuario);
        String label = "Você quer mesmo remover o " + usuario.getNome() + " ( UserID: " + usuario.getId_usuario() + ") da sua equipe?";
        int confirmar = JOptionPane.showConfirmDialog(null, label);
        if (confirmar == JOptionPane.YES_OPTION) {
            try {

                String sql = "update usuario set fk_equipe = null where id_usuario = ?;";
                conn = new ConexaoBD().conectaDB();
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, String.valueOf(usuario.getId_usuario()));

                pstm.execute();
                pstm.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "UsuarioRepository removeEquipe: " + ex);
                Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void sair(UsuarioModel usuario) {
        usuarioLogado.setLogado(false);
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

    public boolean verificarSeJaTemEquipe(UsuarioModel usuario) {
        conn = new ConexaoBD().conectaDB();
        boolean verificar = false;

        try {
            String sql = "select * from usuario where id_usuario = ?;";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(usuario.getId_usuario()));

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) // se fk_equipe for diferente de nulo ele já pertence a uma equipe
            {
                verificar = rs.getInt("fk_equipe") != 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository: " + ex);
        }
        return verificar;
    }

    public int getIdade(String nascimentoUsuario) {
        // nascimentoUsuario traz os dados de data do mysql (yyyy/mm/dd)

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date nascimento_ = null;
        try {
            nascimento_ = formato.parse(nascimentoUsuario.replace("-", "/"));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data de nascimento invalida!");
            Logger
                    .getLogger(UsuarioRepository.class
                            .getName()).log(Level.SEVERE, null, ex);
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
