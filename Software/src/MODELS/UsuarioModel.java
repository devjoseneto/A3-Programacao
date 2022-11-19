package MODELS;

import java.util.ArrayList;
import java.util.Arrays;

public class UsuarioModel {

    private String nome;
    private String email;
    private char[] senha;
    private String cidade;
    private String nascimento;
    private String sobre;
    private String posicaoEsporte;
    private int numeroCamisa;
    private boolean logado;
    private char sexo;

    // Metódos Especiais

    public UsuarioModel(String nome, String email, char[] senha, String cidade, String nascimento, char sexo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        this.nascimento = nascimento;
        this.sexo = sexo;
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

    public String getNascimento() {
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

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isLogado() {
        return logado;
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

    public void setNascimento(String nascimento) {
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
    
}
