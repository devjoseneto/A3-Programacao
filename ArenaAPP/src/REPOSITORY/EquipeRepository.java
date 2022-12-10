package REPOSITORY;

import MODELS.EnderecoModel;
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

    public void createEquipe(EquipeModel equipe, int id_endereco) throws SQLException {
        try {

            String sql = "insert into equipe (nome, descricao, fk_dono, PraticaDom, PraticaSeg, PraticaTer, PraticaQua, PraticaQui, PraticaSex, PraticaSab, esporte, fk_endereco)\n"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, equipe.getNome());
            pstm.setString(2, equipe.getDescricao());
            pstm.setString(3, "3"/*Integer.toString(UsuarioRepository.usuarioLogado.getIdUsuario())*/);
            pstm.setString(4, equipe.getDom());
            pstm.setString(5, equipe.getSeg());
            pstm.setString(6, equipe.getTer());
            pstm.setString(7, equipe.getQua());
            pstm.setString(8, equipe.getQui());
            pstm.setString(9, equipe.getSex());
            pstm.setString(10, equipe.getSab());
            pstm.setString(11, equipe.getEsporte());
            pstm.setString(12, Integer.toString(id_endereco));// Buscar o id de endereco;

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "O nome já está em uso "+ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public EquipeModel readEquipe(EquipeModel equipe) {
        // equipe - informações para pesquisar no banco de dados
        EquipeModel equipeReturn = new EquipeModel();
        String sql = "select * from equipe WHERE nome = ?;";
        conn = new ConexaoBD().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, equipe.getNome());

            ResultSet rs = pstm.executeQuery();

            /* equipe_ - para receberem informações do bando de dados */
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
                equipe_.setId_endereco(rs.getInt("fk_endereco"));

                return equipe_;

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository Read Equipe" + ex);
            return null;
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
