package classes;

import java.util.ArrayList;

public class Equipe {
     private String nome;
     private Usuario dono;
     private Usuario administrador;
     private String sobre;
     private String diasDePratica;
     private String cidade;
     private String local;
     private String esporte;
     private int numeroDeAtletas;
     private String linkInstagram;
     private String linkTikTok;
     private String linkWhatsapp;
     private ArrayList<Usuario> listaJogadores = new ArrayList<Usuario>();
     
     // Metódos
     public void criarEquipe() {
         
     }
     
     public void vincularLinks() {
         
     }
     
     // Metódos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
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