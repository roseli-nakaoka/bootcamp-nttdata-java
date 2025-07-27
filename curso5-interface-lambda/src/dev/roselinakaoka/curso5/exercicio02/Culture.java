package dev.roselinakaoka.curso5.exercicio02;

/*
 * Classe: Culture
 *
 * Descrição:
 * Esta classe representa a categoria de produtos culturais e implementa
 * a interface `TaxGetter`. Define uma taxa de imposto fixa de 4,0% (0.04)
 * aplicada sobre o valor do produto.
 *
 * A taxa é armazenada como constante (`static final`) e o método `getTaxRate`
 * retorna o valor calculado do imposto com base no valor fornecido.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

public class Culture implements TaxGetter {
    private static final double taxRate = 4.0/100;
    @Override
    public double getTaxRate(double valorProduto) {
        return taxRate * valorProduto;
    }
}
