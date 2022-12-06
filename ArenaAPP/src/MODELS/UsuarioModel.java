package MODELS;

import REPOSITORY.BancoDeDados;

public class UsuarioModel {

    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String cidade;
    private String nascimento;
    private String descricao;
    private String posicaoEsporte;
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
        this.idUsuario = BancoDeDados.SEQUENCIAL;
        BancoDeDados.SEQUENCIAL += 1;
    }

    public int getIdUsuario() {
        return idUsuario;
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

    public String getDescricao() {
        return descricao;
    }

    public String getPosicaoEsporte() {
        return posicaoEsporte;
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

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPosicaoEsporte(String posicaoEsporte) {
        this.posicaoEsporte = posicaoEsporte;
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
