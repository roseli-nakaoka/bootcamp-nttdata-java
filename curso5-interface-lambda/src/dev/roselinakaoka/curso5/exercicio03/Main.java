package dev.roselinakaoka.curso5.exercicio03;

/*
 * Programa: Calculadora de Área de Formas Geométricas
 * -----------------------------------------------
 * Este programa permite ao usuário calcular a área de diferentes formas geométricas:
 * Quadrado, Retângulo e Círculo. O usuário escolhe a forma pelo menu e insere os
 * parâmetros necessários. O sistema então calcula e exibe a área correspondente.
 *
 * Funcionalidades:
 * - Exibe um menu interativo com opções
 * - Lê dados do usuário com segurança usando a classe InputReader
 * - Calcula a área através de classes que implementam a interface GeometricShapes
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 */

import dev.roselinakaoka.curso3.exercicio01.InputReader;

public class Main {

    public static void main(String[] args) {

        int option = -1;
        while(option!=0) {
            printMenu();
            option = InputReader.readInt("Digite a opção desejada : ");
            handleOption(option);
        }

    }

    private static void printMenu() {
        // Menu de Opções do Sistema Bancário
        System.out.println();
        System.out.println("------------ Calculo de Área de Formas Geométricas -------------");
        System.out.println("----  1 - Quadrado");
        System.out.println("----  2 - Retangulo");
        System.out.println("----  3 - Círcunferência");
        System.out.println("----  0 - Sair\n");
    }

    private static void handleOption(int option) {
        // Executa o method correspondente à opção escolhida
        GeometricShapes geometricShape = null;
        switch (option) {

            case 1:
                double lado = InputReader.readDouble("Digite o lado do quadrado: ");
                geometricShape = new Square(lado);
                break;
            case 2:
                double base = InputReader.readDouble("Digite a base do retângulo: ");
                double altura = InputReader.readDouble("Digite a altura do retângulo: ");
                geometricShape = new Rectangle(base, altura);
                break;
            case 3:
                double raio = InputReader.readDouble("Digite o raio do circulo: ");
                geometricShape = new Circle(raio);
                break;
            case 0:
                System.out.println("Programa Encerrado");
                return;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        if (geometricShape != null) System.out.printf("Área: %.2f\n", geometricShape.calculateArea());
    }

}


