package REPOSITORY;

import MODELS.EquipeModel;
import MODELS.UsuarioModel;
import static REPOSITORY.UsuarioRepository.usuarioLogado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class EquipeRepository {

    Connection conn;
    PreparedStatement pstm;

    public void createEquipe(EquipeModel equipe, int id_endereco) throws SQLException {
        try {
            String sql = "insert into equipe (nome, descricao, fk_dono, PraticaDom, PraticaSeg, PraticaTer, PraticaQua, PraticaQui, PraticaSex, PraticaSab, esporte, fk_endereco)\n"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, equipe.getNome());
            pstm.setString(2, equipe.getDescricao());
            pstm.setString(3, Integer.toString(UsuarioRepository.usuarioLogado.getId_usuario()));
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

            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                equipe.setIdEquipe(rs.getInt(1));
            }

            adicionarDono(usuarioLogado, equipe);
            pstm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "O nome já está em uso " + ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ConexaoBD().fecharDB(conn);
    }

    public EquipeModel readEquipe(EquipeModel equipe) {
        // equipe - informações para pesquisar no banco de dados
        String sql = "select * from equipe WHERE id_equipe = ?;";
        conn = new ConexaoBD().conectaDB();
        /* equipe_ - para receberem informações do bando de dados */
        EquipeModel equipe_ = new EquipeModel();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(equipe.getIdEquipe()));

            ResultSet rs = pstm.executeQuery();

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
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository Read Equipe" + ex);
        }
        new ConexaoBD().fecharDB(conn);
        return equipe_;
    }

    public ArrayList<EquipeModel> readEquipePorNome(EquipeModel equipe, int pagina) {
        ArrayList<EquipeModel> listaDeEquipe = new ArrayList<>();
        String sql = "select * from equipe where nome like concat('%', ?,'%') order by 'nome' LIMIT 5 OFFSET ?;";
        conn = new ConexaoBD().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(equipe.getNome()));
            pstm.setInt(2, pagina);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                EquipeModel equipe_ = new EquipeModel();
                equipe_.setIdEquipe(rs.getInt("id_equipe"));
                equipe_.setNome(rs.getString("nome"));

                listaDeEquipe.add(equipe_);
            }
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository readEquipePorNome" + ex);
            Logger.getLogger(EquipeRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ConexaoBD().fecharDB(conn);
        return listaDeEquipe;
    }
    
    public int contarPaginas(EquipeModel equipe) {
        int quant = 0;
        try {
            String sql = "select count(*) from equipe where nome like concat('%', ?,'%');";

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, equipe.getNome());

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                quant = rs.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ConexaoBD().fecharDB(conn);
        return (quant / 5);
    }

    public void updateEquipe(EquipeModel equipe) {
        try {
            String sql = "update Equipe\n"
                    + "set nome = ?,\n"
                    + "descricao = ?,\n"
                    + "PraticaDom = ?,\n"
                    + "PraticaSeg = ?,\n"
                    + "PraticaTer = ?,\n"
                    + "PraticaQua = ?,\n"
                    + "PraticaQui = ?,\n"
                    + "PraticaSex = ?,\n"
                    + "PraticaSab = ?,\n"
                    + "esporte = ?\n"
                    + "where id_equipe = ?;";
            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, equipe.getNome());
            pstm.setString(2, equipe.getDescricao());
            pstm.setString(3, equipe.getDom());
            pstm.setString(4, equipe.getSeg());
            pstm.setString(5, equipe.getTer());
            pstm.setString(6, equipe.getQua());
            pstm.setString(7, equipe.getQui());
            pstm.setString(8, equipe.getSex());
            pstm.setString(9, equipe.getSab());
            pstm.setString(10, equipe.getEsporte());
            pstm.setString(11, String.valueOf(equipe.getIdEquipe()));

            pstm.execute();
            pstm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository update: " + ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ConexaoBD().fecharDB(conn);
    }

    public void deleteEquipe(EquipeModel equipe) {
        try {
            String sql = "delete from equipe where id_equipe = ?";

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(equipe.getIdEquipe()));

            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository delete: " + ex);
            Logger.getLogger(EquipeRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ConexaoBD().fecharDB(conn);
    }

    public void adicionarDono(UsuarioModel usuario, EquipeModel equipe) {
        try {

            String sql = "update usuario set fk_equipe = ? where id_usuario = ?;";
            String sqlSetDono = "update equipe set fk_dono = ? where id_equipe = ?";

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(equipe.getIdEquipe()));
            pstm.setString(2, String.valueOf(usuario.getId_usuario()));

            pstm.execute();

            conn = new ConexaoBD().conectaDB();
            pstm = conn.prepareStatement(sqlSetDono);
            pstm.setString(1, String.valueOf(usuario.getId_usuario()));
            pstm.setString(2, String.valueOf(equipe.getIdEquipe()));

            pstm.execute();
            pstm.close();

            UsuarioRepository.usuarioLogado.setId_equipe(equipe.getIdEquipe());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioRepository adicionarDono: " + ex);
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ConexaoBD().fecharDB(conn);
    }

    public void vincularLinkWhatsapp() {

    }

    public void vincularLinkInstagram() {

    }

    public void excluirEquipe() {

    }
}
