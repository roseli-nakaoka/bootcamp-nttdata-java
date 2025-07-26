package dev.roselinakaoka.curso4.exercicio02;

/**
 * Representa um vendedor da empresa, não possui privilégios administrativos.
 * Responsável por realizar e consultar vendas.
 */

public final class Vendedor extends Funcionario {

    protected int numeroVendas;

    public Vendedor (String nome, String email, String senha) {
        super(nome,email, senha, false);
        this.numeroVendas = 0;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void realizarVenda() {
        this.numeroVendas++;
        System.out.printf("Venda realizada! Número de Vendas: %d\n", this.numeroVendas);
    }

    public void consultarVendas() {
        System.out.printf("Minhas Vendas: %d\n", this.numeroVendas);
    }

}
