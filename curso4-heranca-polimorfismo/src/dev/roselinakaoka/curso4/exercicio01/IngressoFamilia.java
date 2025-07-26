package dev.roselinakaoka.curso4.exercicio01;

/*
 * Subclasse de Ingresso que representa um ingresso para grupo familiar.
 * Contém o número de pessoas e calcula o preço total multiplicando
 * o preço base pelo número de pessoas, aplicando um desconto de 5%
 * se o grupo for maior que 3 pessoas.
 * Também emite os detalhes do ingresso incluindo o total de entradas.
 */
public class IngressoFamilia extends Ingresso {
    protected int numeroPessoas;

    public IngressoFamilia(double preco, String titulo, FormatoAudio formatoAudio, int numeroPessoas){
        super(preco,titulo,formatoAudio);
        this.numeroPessoas = 4;
    }

    @Override
    public double CalculaPreco() {
        double preco = 0.0;
        if(this.numeroPessoas > 3)
            preco = (this.preco * this.numeroPessoas)*0.95;
        else
            preco = this.preco * this.numeroPessoas;

        return preco;
    }

    @Override
    public void EmiteIngresso(){
        System.out.printf("Total de Entradas : %d\n", this.numeroPessoas);
        System.out.printf("Filme             : %s\n", this.getTitulo() );
        System.out.printf("Formato de Audio  : %s\n", this.getFormatoAudio() );
        System.out.printf("Valor Total       : R$ %.2f\n", CalculaPreco() );
    }
}
