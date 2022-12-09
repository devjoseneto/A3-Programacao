package REPOSITORY;

import MODELS.EquipeModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class EquipeRepository {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarEquipe(EquipeModel equipe) throws SQLException {
        int id_endereco = cadastrarEndereco(equipe);
        try {

            String sql = "insert into equipe (nome, descricao, fk_dono, PraticaDom, PraticaSeg, PraticaTer, PraticaQua, PraticaQui, PraticaSex, PraticaSab, esporte, fk_endereco)\n"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, equipe.getNome());
            pstm.setString(2, equipe.getDescricao());
            pstm.setString(3, "1"/*Integer.toString(UsuarioRepository.usuarioLogado.getIdUsuario())*/);
            pstm.setString(4, equipe.getDom());
            pstm.setString(5, equipe.getSeg());
            pstm.setString(6, equipe.getTer());
            pstm.setString(7, equipe.getQua());
            pstm.setString(8, equipe.getQui());
            pstm.setString(9, equipe.getSex());
            pstm.setString(10, equipe.getSab());
            pstm.setString(11, equipe.getEsporte());
            pstm.setString(12, Integer.toString(id_endereco));

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "O nome já está em uso");
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int cadastrarEndereco(EquipeModel equipe) {
        int id_endereco = 0;
        try {
            String sqlID = "select id_endereco from endereco where rua = ? and bairro = ? and numero = ? and cidade = ?;";
            
            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sqlID);
            pstm.setString(1, equipe.getRua());
            pstm.setString(2, equipe.getBairro());
            pstm.setString(3, equipe.getNum());
            pstm.setString(4, equipe.getCidade());

            ResultSet rsId = pstm.executeQuery();

            if (rsId.next()) {
                id_endereco = rsId.getInt("id_endereco");
            } else {
                String sql = "insert into endereco (rua, bairro, numero, cidade) values (?, ?, ?, ?);";
                conn = new ConexaoBD().conectaDB();
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, equipe.getRua());
                pstm.setString(2, equipe.getBairro());
                pstm.setString(3, equipe.getNum());
                pstm.setString(4, equipe.getCidade());

                pstm.execute();
                pstm.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar endereco");
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_endereco;
    }

    public EquipeModel readEquipe(EquipeModel equipe) {
        EquipeModel equipeReturn = new EquipeModel();
        String sql = "select * from equipe WHERE nome = ?;";
        String sqlEndereco = "select * from endereco WHERE id_endereco = ?;";
        conn = new ConexaoBD().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            System.out.println(equipe.getNome());
            pstm.setString(1, equipe.getNome());

            ResultSet rs = pstm.executeQuery();

            EquipeModel equipe_ = new EquipeModel();
            while (rs.next()) {
                equipe_.setIdEquipe(rs.getInt("id_equipe"));
                equipe_.setNome(rs.getString("nome"));
                equipe_.setId_dono(rs.getInt("fk_dono"));
                equipe_.setId_administrador(rs.getInt("fk_adm"));
                equipe_.setDescricao(rs.getString("descricao"));
                equipe_.setDom(rs.getString("PraticaDom"));
                equipe_.setSeg(rs.getString("PraticaSeg"));
                equipe_.setTer(rs.getString("PraticaTer"));
                equipe_.setQua(rs.getString("PraticaQua"));
                equipe_.setQui(rs.getString("PraticaQui"));
                equipe_.setSex(rs.getString("PraticaSex"));
                equipe_.setSab(rs.getString("PraticaSab"));
                equipe_.setLinkWhatsapp(rs.getString("linkWhatsapp"));
                equipe_.setLinkInstagram(rs.getString("linkInstagram"));
                equipe_.setEsporte(rs.getString("esporte"));
                equipe_.setId_endereco("1");

                try {
                    pstm = conn.prepareStatement(sqlEndereco);
                    pstm.setString(1, String.valueOf(equipe_.getId_endereco()));

                    rs = pstm.executeQuery();
                    if (rs != null && rs.next()) {
                        equipe_.setRua(rs.getString("rua"));
                        equipe_.setBairro(rs.getString("bairro"));
                        equipe_.setNum(rs.getString("numero"));
                        equipe_.setCidade(rs.getString("cidade"));
                    }
                    equipeReturn = equipe_;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "EquipeRepository Read Endereco" + ex);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository Read Equipe" + ex);
        }
        return equipeReturn;
    }

    public void vincularLinkWhatsapp() {

    }

    public void vincularLinkInstagram() {

    }

    public void excluirEquipe() {

    }
}
