package MODELS;

import java.util.ArrayList;

public class EquipeModel {

    private int idEquipe;
    private String nome;
    private int id_dono;
    private int id_administrador;
    private String descricao;
    private String dom;
    private String seg;
    private String ter;
    private String qua;
    private String qui;
    private String sex;
    private String sab;
    private String id_endereco;
    private String cidade;
    private String rua;
    private String bairro;
    private String num;
    private String esporte;
    private int numeroDeAtletas;
    private String linkInstagram;
    private String linkWhatsapp;
    private ArrayList<UsuarioModel> Jogadores = new ArrayList<UsuarioModel>();

    public EquipeModel() {
    }
    
    public EquipeModel(String nome, String descricao, String dom, String seg, String ter, String qua, String qui, String sex, String sab, String cidade, String rua, String bairro, String num, String esporte) {
        this.nome = nome;
        this.descricao = descricao;
        this.dom = dom;
        this.seg = seg;
        this.ter = ter;
        this.qua = qua;
        this.qui = qui;
        this.sex = sex;
        this.sab = sab;
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

    public int getId_dono() {
        return id_dono;
    }

    public int getId_administrador() {
        return id_administrador;
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

    public String getId_endereco() {
        return id_endereco;
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

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId_dono(int id_dono) {
        this.id_dono = id_dono;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
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

    public void setId_endereco(String id_endereco) {
        this.id_endereco = id_endereco;
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
