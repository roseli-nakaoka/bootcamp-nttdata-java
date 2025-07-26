package dev.roselinakaoka.curso4.exercicio02;

/**
 * Representa um atendente da empresa, não possui privilégios administrativos.
 * Responsável por receber pagamentos e fechar o caixa.
 */

public final class Atendente extends Funcionario {

    protected double valorEmCaixa;

    public Atendente (String nome, String email, String senha) {
        super(nome,email, senha, false);
        this.valorEmCaixa = 0.0;
    }

    public void receberPagamento(double valor){
        this.valorEmCaixa+=valor;
        System.out.printf("Valor recebido: RS %.2f. Valor em Caixa: R$ %.2f\n", valor, this.valorEmCaixa);
    }

    public void fecharCaixa(){
        System.out.printf("Caixa Fechando com : R$ %.2f\n", this.valorEmCaixa);
        this.valorEmCaixa=0.0;
    }

}


