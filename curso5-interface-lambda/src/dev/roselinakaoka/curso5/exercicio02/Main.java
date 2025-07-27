package dev.roselinakaoka.curso5.exercicio02;
/*
 * Programa: Cálculo de Tributos por Categoria de Produto
 *
 * Descrição:
 * Este programa simula um sistema de cálculo de tributos (impostos) aplicados sobre produtos,
 * com base na categoria selecionada pelo usuário. O cálculo do imposto é realizado de forma
 * polimórfica através da interface `TaxGetter`, que é implementada por classes como `Food`,
 * `HealthWellBeing`, `Clothing` e `Culture`.
 *
 * O usuário escolhe uma categoria de produto no menu e insere o valor do produto.
 * O sistema, então, instancia dinamicamente a classe correspondente e calcula o valor do imposto.
 *
 * Funcionalidades:
 * - Exibe menu com categorias de produto
 * - Lê a opção do usuário e o valor do produto
 * - Calcula o imposto de acordo com a categoria
 * - Imprime o valor do imposto
 *
 * Conceitos aplicados:
 * - Interface e polimorfismo
 * - Boas práticas de separação de responsabilidades
 * - Estrutura condicional com switch expression
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

import dev.roselinakaoka.curso3.exercicio01.InputReader;

public class Main {

    public static void main(String[] args) {

        int option = -1;
        while (option!=0) {
            TaxGetter taxRate = null;
            printMenu();
            option = InputReader.readInt("Digite a opção desejada : ");
            handleOption(taxRate, option);
        }
    }

    private static void printMenu() {
        // Menu de Opções do Sistema Bancário
        System.out.println();
        System.out.println("------------ Tributos de Produtos por Categoria -------------");
        System.out.println("----  1 - Alimentos");
        System.out.println("----  2 - Saúde e Bem Estar");
        System.out.println("----  3 - Vestuário");
        System.out.println("----  4 - Cultura");
        System.out.println("----  0 - Sair\n");
    }

    private static void handleOption(TaxGetter taxRate, int option) {
        // Executa o method correspondente à opção escolhida
        double valorProduto=0.0;

        if(option==1 || option==2 || option==3 || option==4) {
           valorProduto = InputReader.readDouble("Digite o valor do Produto em R$ : ");
        }

        switch (option) {
            case 1 -> taxRate = new Food();
            case 2 -> taxRate = new HealthWellBeing();
            case 3 -> taxRate = new Clothing();
            case 4 -> taxRate = new Culture();
            case 0 -> System.out.println("Programa Encerrado");
            default -> System.out.println("Opção Inválida!");
        }

        if(taxRate != null)
            System.out.printf("Valor do imposto : R$ %.2f\n", taxRate.getTaxRate(valorProduto));
    }
}


