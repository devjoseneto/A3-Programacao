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

        if (rsverificar.next()) {
            JOptionPane.showMessageDialog(null, "Esse equipe já está cadastrado");
        } else {
            try {

                String sql = "";
                conn = new ConexaoBD().conectaDB();
                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.execute();
                pstm.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, " Não foi possivel cadastrar equipe");
                Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            JOptionPane.showMessageDialog(null, "UsuarioRepository: " + ex);
            return null;
        }
    }
}
