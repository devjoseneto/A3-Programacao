package SERVICES;

import MODELS.EnderecoModel;
import MODELS.EquipeModel;
import REPOSITORY.EnderecoRepository;
import REPOSITORY.EquipeRepository;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EquipeService {
    public void createEquipe(EquipeModel equipe, EnderecoModel endereco) {
        EquipeRepository repository = new EquipeRepository();
        EnderecoRepository repositoryEnde = new EnderecoRepository();
        try {
            int id_endereco = repositoryEnde.createEndereco(endereco);
            repository.createEquipe(equipe, id_endereco);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EquipeService"+ex);
            Logger.getLogger(EquipeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public EquipeModel readEquipe(EquipeModel equipe) {
        EquipeRepository repository = new EquipeRepository();
        equipe = repository.readEquipe(equipe);
        return equipe;
    }
    
    public void uptadeEquipe(EquipeModel equipe, EnderecoModel endereco){
        EquipeRepository repository = new EquipeRepository();
        EnderecoRepository repositoryEnde = new EnderecoRepository();
        repository.updateEquipe(equipe);
        repositoryEnde.updateEndereco(endereco);
    }
    
    public void deleteEquipe(EquipeModel equipe) {
        EquipeRepository repository = new EquipeRepository();
        EnderecoRepository repositoryEnde = new EnderecoRepository();
        repository.deleteEquipe(equipe);
        repositoryEnde.deleteEndereco(equipe);
    }
}
