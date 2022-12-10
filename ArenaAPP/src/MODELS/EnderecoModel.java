/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELS;

/**
 *
 * @author netoi
 */
public class EnderecoModel {
    private int id_endereco;
    private String cidade;
    private String rua;
    private String bairro;
    private String num;

    public EnderecoModel() {
    }

    public EnderecoModel(String cidade, String rua, String bairro, String num) {
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }

    public int getId_endereco() {
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

    public void setId_endereco(int id_endereco) {
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
    
    
}
