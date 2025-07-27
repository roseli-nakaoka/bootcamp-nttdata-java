package dev.roselinakaoka.curso5.exercicio02;

/*
 * Interface: TaxGetter
 *
 * Descrição:
 * Esta interface define o contrato para classes que calculam o valor do imposto
 * sobre um produto. O metodo `getTaxRate` deve ser implementado por qualquer
 * classe que deseje fornecer uma lógica específica de cálculo de imposto.
 *
 * O metodo recebe o valor do produto como entrada e retorna o valor correspondente
 * do imposto a ser aplicado.
 *
 * É usada no programa principal para aplicar polimorfismo, permitindo que múltiplas
 * categorias de produto (como alimentos, vestuário, cultura etc.) definam sua própria
 * regra de tributação.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

@FunctionalInterface
public interface TaxGetter {
    double getTaxRate(double valorProduto);
}
