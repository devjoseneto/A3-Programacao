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

    public void cadastrarEquipe(EquipeModel equipe) throws SQLException {
        ResultSet rsverificar = this.verificarSeExiste(equipe);
        cadastrarEndereco(equipe);
        
        if (rsverificar.next()) {
            JOptionPane.showMessageDialog(null, "Esse equipe já está cadastrado");
        } else {
            try {

                String sql = "insert into equipe (nome, descricao, fk_dono, PraticaDom, PraticaSeg, PraticaTer, PraticaQua, PraticaQui, PraticaSex, PraticaSab, esporte, fk_endereco)\n" +
"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
                
                conn = new ConexaoBD().conectaDB();
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, equipe.getNome());
                pstm.setString(2, equipe.getDescricao());
                pstm.setString(3, "1");
                pstm.setString(4, equipe.getDom());
                pstm.setString(5, equipe.getSeg());
                pstm.setString(6, equipe.getTer());
                pstm.setString(7, equipe.getQua());
                pstm.setString(8, equipe.getQui());
                pstm.setString(9, equipe.getSex());
                pstm.setString(10, equipe.getSab());
                pstm.setString(11, equipe.getEsporte());
                pstm.setString(12, "1");
                
                pstm.execute();
                pstm.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar equipe");
                Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean cadastrarEndereco(EquipeModel equipe) {
        boolean verificacao = false;
        try {
            String sql = "insert into endereco (rua, bairro, numero, cidade) values (?, ?, ?, ?);";
            conn = new ConexaoBD().conectaDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, equipe.getRua());
            pstm.setString(2, equipe.getBairro());
            pstm.setString(3, equipe.getNum());
            pstm.setString(4, equipe.getCidade());
            verificacao = true;
            
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar endereco");
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verificacao;
    }

    public void vincularLinkWhatsapp() {

    }

    public void vincularLinkInstagram() {

    }

    public void excluirEquipe() {

    }

    public ResultSet verificarSeExiste(EquipeModel equipe) {
        conn = new ConexaoBD().conectaDB();

        try {
            String sql = "select * from equipe where nome = ?;";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, equipe.getNome());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeRepository: " + ex);
            return null;
        }
    }
}
