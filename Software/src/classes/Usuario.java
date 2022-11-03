package classes;

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
    
    public void verDados() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
        System.out.println("Senha: "+this.senha);
        System.out.println("Cidade: "+this.cidade);
        System.out.println("Data de Nascimento: "+this.nascimento);
        System.out.println("Status Login: "+this.logado);
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
