package MODELS;

import java.util.ArrayList;

public class EquipeModel {

    private int idEquipe;
    private String nome;
    private UsuarioModel dono;
    private UsuarioModel administrador;
    private String descricao;
    private String dom;
    private String seg;
    private String ter;
    private String qua;
    private String qui;
    private String sex;
    private String sab;
    private String cidade;
    private String rua;
    private String bairro;
    private String num;
    private String esporte;
    private int numeroDeAtletas;
    private String linkInstagram;
    private String linkWhatsapp;
    private ArrayList<UsuarioModel> Jogadores = new ArrayList<UsuarioModel>();

    public EquipeModel(String nome, UsuarioModel dono, String descricao, String dom, String seg, String ter, String qua, String qui, String sex, String cidade, String rua, String bairro, String num, String esporte) {
        this.nome = nome;
        this.dono = dono;
        this.descricao = descricao;
        this.dom = dom;
        this.seg = seg;
        this.ter = ter;
        this.qua = qua;
        this.qui = qui;
        this.sex = sex;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
        this.esporte = esporte;
    }

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

    public String getDom() {
        return dom;
    }

    public String getSeg() {
        return seg;
    }

    public String getTer() {
        return ter;
    }

    public String getQua() {
        return qua;
    }

    public String getQui() {
        return qui;
    }

    public String getSex() {
        return sex;
    }

    public String getSab() {
        return sab;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNum() {
        return num;
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

    public ArrayList<UsuarioModel> getJogadores() {
        return Jogadores;
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

    public void setDom(String dom) {
        this.dom = dom;
    }

    public void setSeg(String seg) {
        this.seg = seg;
    }

    public void setTer(String ter) {
        this.ter = ter;
    }

    public void setQua(String qua) {
        this.qua = qua;
    }

    public void setQui(String qui) {
        this.qui = qui;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSab(String sab) {
        this.sab = sab;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNum(String num) {
        this.num = num;
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

    public void setJogadores(ArrayList<UsuarioModel> Jogadores) {
        this.Jogadores = Jogadores;
    }

}
