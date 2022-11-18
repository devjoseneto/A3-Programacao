package classes;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String cidade;
    private String nascimento;
    private String sobre;
    private String posicaoEsporte;
    private int numeroCamisa;
    private boolean logado;
    ArrayList<Usuario> listaDeUsuario = new ArrayList<Usuario>();
    Usuario usuarioLogado = new Usuario();
    
    public void verDados() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
        System.out.println("Senha: "+this.senha);
        System.out.println("Cidade: "+this.cidade);
        System.out.println("Data de Nascimento: "+this.nascimento);
        System.out.println("Status Login: "+this.logado);
    }
    
    public void cadastrarUser(String nome_, String email_,
            String senha_, String cidade_,
            String nascimento_) {
        Usuario user = new Usuario();
        user.setNome(nome_);
        user.setEmail(email_);
        user.setSenha(senha_);
        user.setCidade(cidade_);
        user.setNascimento(nascimento_);
        user.setLogado(true);
        listaDeUsuario.add(user);
    }

    public void efetuarLogin(String email_, String senha_) {
        for (int i = 0; i < listaDeUsuario.size(); i++) {
            if (email_.equals(listaDeUsuario.get(i).getEmail())) {
                if (senha_.equals(listaDeUsuario.get(i).getSenha())) {
                    listaDeUsuario.get(i).setLogado(true);
                    usuarioLogado = listaDeUsuario.get(i);
                } else {
                    // imprimir senha incorreta
                }
            } else {
                // imprimir email incorreto
            }
        }
    }

    public void excluirUser(String email_, String senha_) {
        // Confirmar exclusão de conta na interface
        for (int i = 0; i < listaDeUsuario.size(); i++) {
            if (email_.equals(listaDeUsuario.get(i).getEmail()))
                listaDeUsuario.remove(i);
        }
    }

    public void logout() {
            for (int i = 0; i < listaDeUsuario.size(); i++) {
                if (listaDeUsuario.get(i).getEmail().equals(usuarioLogado.getEmail())) {
                    listaDeUsuario.get(i).setLogado(false);
                    usuarioLogado.setLogado(false);
                }
        }
    }
    
    // Metódos Especiais
    public Usuario() {
        this.logado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getPosicaoEsporte() {
        return posicaoEsporte;
    }

    public void setPosicaoEsporte(String posicaoEsporte) {
        this.posicaoEsporte = posicaoEsporte;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    
    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
