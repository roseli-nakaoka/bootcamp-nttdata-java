package dev.roselinakaoka.curso4.exercicio01;

/*
 * Subclasse de Ingresso que representa um ingresso meia-entrada.
 * Calcula o preço com desconto de 50% sobre o valor base do ingresso.
 */

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double preco, String titulo, FormatoAudio formatoAudio) {
        super(preco,titulo,formatoAudio);
    }

    @Override
    public double CalculaPreco() {
        return getPreco()/2;
    }

}
