package SERVICES;

import MODELS.EquipeModel;
import REPOSITORY.EquipeRepository;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EquipeService {
    public void cadastrarEquipe(EquipeModel equipe) {
        EquipeRepository repository = new EquipeRepository();
        try {
            repository.cadastrarEquipe(equipe);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeService"+ex);
            Logger.getLogger(EquipeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
