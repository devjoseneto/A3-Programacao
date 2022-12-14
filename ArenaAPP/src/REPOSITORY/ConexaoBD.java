package REPOSITORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {

    public Connection conectaDB() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/arenaapp?serverTimezone=UTC";
            String usuario = "root";
            String senha = "10121012";
            conn = DriverManager.getConnection(url, usuario, senha);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public void fecharDB(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possival fechar conexao com o banco de dados");
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
