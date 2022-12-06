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
            
            String url = "jbc:mysql://localhost:3308/arenaapp?connectionTimeZone=UTC ";     
            String user = "root";
            String password = "87654321";
            conn = DriverManager.getConnection(url, user, password); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

}
