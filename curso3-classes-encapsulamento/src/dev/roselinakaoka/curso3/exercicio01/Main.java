package dev.roselinakaoka.curso3.exercicio01;

/*
 * * Exercício 01 - Este programa simula uma conta bancária que permite ao usuário
 * realizar operações básicas de um banco: consultar saldo, consultar o limite de cheque
 * especial, depositar dinheiro, sacar dinheiro, pagar boletos e verificar se está usando
 * o cheque especial.
 * A conta é criada com um saldo inicial e um cheque especial, cujo valor é calculado
 * com base no depósito inicial:
 * Se o depósito for até R$500,00, o limite do cheque especial é fixo em R$50,00.
 * Se for acima de R$500,00, o cheque especial equivale a 50% do valor depositado.
 * Sempre que o cliente usa o cheque especial, o sistema registra o valor utilizado.
 * Assim que houver saldo suficiente, é cobrada uma taxa de 20% sobre o valor usado
 * do cheque especial. O programa garante que as operações respeitem o saldo total
 * (saldo + cheque especial) e informa o usuário sobre o uso do cheque especial.
 *
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Java e a Arte da Abstração com Classes e Encapsulamento
 * Autor: Roseli Nakaoka
 * Data: 21/07/2025
 */
public class Main {

    public static void main(String[] args) {
        new BankApp().run();
    }

}





