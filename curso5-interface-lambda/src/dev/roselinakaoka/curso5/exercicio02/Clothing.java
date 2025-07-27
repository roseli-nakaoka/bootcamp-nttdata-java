package dev.roselinakaoka.curso5.exercicio02;

/*
 * Classe: Clothing
 *
 * Descrição:
 * Esta classe representa a categoria de produtos de vestuário e implementa
 * a interface `TaxGetter`. Define uma taxa de imposto fixa de 2,5% (0.025)
 * aplicada sobre o valor do produto.
 *
 * A taxa é armazenada como constante (`static final`) e o metodo `getTaxRate`
 * retorna o valor calculado do imposto com base no valor fornecido.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

public class Clothing implements TaxGetter{
    private static final double taxRate = 2.5/100;

    @Override
    public double getTaxRate(double valorProduto) {
        return taxRate * valorProduto;
    }
}
