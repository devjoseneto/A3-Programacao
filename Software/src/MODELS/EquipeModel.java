package MODELS;

import MODELS.UsuarioModel;
import java.util.ArrayList;

public class EquipeModel {

    private String nome;
    private UsuarioModel dono;
    private UsuarioModel administrador;
    private String sobre;
    private String diasDePratica;
    private String cidade;
    private String local;
    private String esporte;
    private int numeroDeAtletas;
    private String linkInstagram;
    private String linkWhatsapp;
    private EquipeModel equipeUser;
    private ArrayList<UsuarioModel> listaJogadores = new ArrayList<UsuarioModel>();

    // Metódos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UsuarioModel getDono() {
        return dono;
    }

    public void setDono(UsuarioModel dono) {
        this.dono = dono;
    }

    public UsuarioModel getAdministrador() {
        return administrador;
    }

    public void setAdministrador(UsuarioModel administrador) {
        this.administrador = administrador;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getDiasDePratica() {
        return diasDePratica;
    }

    public void setDiasDePratica(String diasDePratica) {
        this.diasDePratica = diasDePratica;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public int getNumeroDeAtletas() {
        return numeroDeAtletas;
    }

    public void setNumeroDeAtletas(int numeroDeAtletas) {
        this.numeroDeAtletas = numeroDeAtletas;
    }

}
