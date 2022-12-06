package MODELS;

import java.util.ArrayList;

public class EquipeModel {

    private int idEquipe;
    private String nome;
    private UsuarioModel dono;
    private UsuarioModel administrador;
    private String descricao;
    private String diasDePratica;
    private String cidade;
    private String endereco;
    private String esporte;
    private int numeroDeAtletas;
    private String linkInstagram;
    private String linkWhatsapp;
    private EquipeModel equipeUser;
    private ArrayList<UsuarioModel> Jogadores = new ArrayList<UsuarioModel>();

    // Metódos Especiais

    public int getIdEquipe() {
        return idEquipe;
    }

    public String getNome() {
        return nome;
    }

    public UsuarioModel getDono() {
        return dono;
    }

    public UsuarioModel getAdministrador() {
        return administrador;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDiasDePratica() {
        return diasDePratica;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEsporte() {
        return esporte;
    }

    public int getNumeroDeAtletas() {
        return numeroDeAtletas;
    }

    public String getLinkInstagram() {
        return linkInstagram;
    }

    public String getLinkWhatsapp() {
        return linkWhatsapp;
    }

    public EquipeModel getEquipeUser() {
        return equipeUser;
    }

    public ArrayList<UsuarioModel> getJogadores() {
        return Jogadores;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(UsuarioModel dono) {
        this.dono = dono;
    }

    public void setAdministrador(UsuarioModel administrador) {
        this.administrador = administrador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDiasDePratica(String diasDePratica) {
        this.diasDePratica = diasDePratica;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public void setNumeroDeAtletas(int numeroDeAtletas) {
        this.numeroDeAtletas = numeroDeAtletas;
    }

    public void setLinkInstagram(String linkInstagram) {
        this.linkInstagram = linkInstagram;
    }

    public void setLinkWhatsapp(String linkWhatsapp) {
        this.linkWhatsapp = linkWhatsapp;
    }

    public void setEquipeUser(EquipeModel equipeUser) {
        this.equipeUser = equipeUser;
    }

    public void setJogadores(ArrayList<UsuarioModel> Jogadores) {
        this.Jogadores = Jogadores;
    }
    
    

}
