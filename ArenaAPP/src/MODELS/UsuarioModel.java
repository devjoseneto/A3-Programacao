package MODELS;

public class UsuarioModel {

    private int id_usuario;
    private int id_equipe;
    private String nome;
    private String email;
    private String senha;
    private String cidade;
    private String nascimento;
    private String biografia;
    private boolean logado;
    private char sexo;
    private String[] esporte = new String[5];
    // Metódos Especiais

    public UsuarioModel() {}
    
    public UsuarioModel(String nome, String email, String senha, String cidade, String nascimento, char sexo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public int getId_equipe() {
        return id_equipe;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getBiografia() {
        return biografia;
    }

    public boolean isLogado() {
        return logado;
    }

    public char getSexo() {
        return sexo;
    }

    public String[] getEsporte() {
        return esporte;
    }

    public void setId_usuario(int idUsuario) {
        this.id_usuario = idUsuario;
    }

    public void setId_equipe(int id_equipe) {
        this.id_equipe = id_equipe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEsporte(String[] esporte) {
        this.esporte = esporte;
    }

       
}
