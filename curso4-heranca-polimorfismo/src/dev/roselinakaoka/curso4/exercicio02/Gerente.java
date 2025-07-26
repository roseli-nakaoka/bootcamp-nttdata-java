package dev.roselinakaoka.curso4.exercicio02;

/**
 * Representa o gerente da empresa, com privilégios de administrador.
 * Pode gerar relatórios financeiros, consultar vendas e gerenciar seus dados.
 */

public final class Gerente extends Funcionario {

    public Gerente (String nome, String email, String senha, boolean administrador) {
      super(nome,email, senha, administrador);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório Financeiro gerado");
    }

    public void consultarVendas() {
        System.out.println("Consultando as Vendas");
    }

}
