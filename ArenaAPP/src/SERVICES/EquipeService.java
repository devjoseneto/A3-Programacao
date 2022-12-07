package SERVICES;

import MODELS.EquipeModel;
import REPOSITORY.EquipeRepository;
import java.sql.SQLException;

public class EquipeService {
    public void cadastrarEquipe(EquipeModel equipe) throws SQLException{
        EquipeRepository repository = new EquipeRepository();
        repository.cadastrarEquipe(equipe);
    }
}
