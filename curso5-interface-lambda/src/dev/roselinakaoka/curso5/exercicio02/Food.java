package dev.roselinakaoka.curso5.exercicio02;

import dev.roselinakaoka.curso3.exercicio01.Validator;

/*
 * Classe: Food
 *
 * Descrição:
 * Esta classe representa a categoria de produtos alimentícios e implementa
 * a interface `TaxGetter`. Define uma taxa de imposto fixa de 1,0% (0.01)
 * aplicada sobre o valor do produto.
 *
 * A taxa é armazenada como constante (`static final`) e o método `getTaxRate`
 * retorna o valor calculado do imposto com base no valor fornecido.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

public class Food implements TaxGetter {
    private static final double taxRate = 1.0/100;
    @Override
    public double getTaxRate(double valorProduto) {
        return taxRate * valorProduto;
    }
}
