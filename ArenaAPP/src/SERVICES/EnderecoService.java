package SERVICES;

import MODELS.EnderecoModel;
import MODELS.EquipeModel;
import REPOSITORY.EnderecoRepository;

public class EnderecoService {
    public EnderecoModel readEndereco(EquipeModel equipe) {
        EnderecoModel endereco = new EnderecoModel();
        EnderecoRepository repository = new EnderecoRepository();
        endereco = repository.readEndereco(equipe);
        return endereco;
    }
}
