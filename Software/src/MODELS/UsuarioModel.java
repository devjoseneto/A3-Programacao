package MODELS;

import REPOSITORY.BancoDeDados;
import java.io.Reader;
import java.util.Date;

public class UsuarioModel {

    private String nome;
    private String email;
    private char[] senha;
    private String cidade;
    private Date nascimento;
    private String sobre;
    private String posicaoEsporte;
    private int numeroCamisa;
    private boolean logado;
    private char sexo;
    private int id;
    private String[] esporte = new String[5];
    
    
    // Metódos Especiais

    public UsuarioModel() {}
    
    public UsuarioModel(String nome, String email, char[] senha, String cidade, Date nascimento, char sexo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.id = BancoDeDados.SEQUENCIAL;
        BancoDeDados.SEQUENCIAL += 1;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public char[] getSenha() {
        return senha;
    }

    public String getCidade() {
        return cidade;
    }

    public Date getDataDeNascimento() {
        return nascimento;
    }

    public String getSobre() {
        return sobre;
    }

    public String getPosicaoEsporte() {
        return posicaoEsporte;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public char getSexo() {
        return sexo;
    }

    public int getId() {
        return id;
    }
    
    public boolean isLogado() {
        return logado;
    }

    public String[] getEsporte() {
        return esporte;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setDataDeNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public void setPosicaoEsporte(String posicaoEsporte) {
        this.posicaoEsporte = posicaoEsporte;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEsporte(String[] esporte) {
        this.esporte = esporte;
    }

    public Reader setSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Reader setSexo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
