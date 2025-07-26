package dev.roselinakaoka.curso4.exercicio02;

/**
 * Classe abstrata base que representa um funcionário da empresa.
 * Contém atributos e métodos comuns a todos os tipos de usuário,
 * como nome, email, senha e status de administrador.
 * Fornece métodos para login, logoff, alteração de dados e senha.
 */

public abstract sealed class Funcionario permits Gerente, Vendedor, Atendente {

        protected String nome;
        protected String email;
        protected String senha;
        protected boolean administrador;

    public Funcionario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public void realizarLogin() {
        System.out.println(this.nome + " fez login.");
    }

    public void realizarLogoff() {
        System.out.println(this.nome + " fez logoff.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdministrador() {
        return administrador;
    }
}

