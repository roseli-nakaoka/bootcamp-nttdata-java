package dev.roselinakaoka.curso3.exercicio01;

/*
 * * A classe BankApp representa a interface principal de um sistema bancário
 * simples via console. Ela exibe um menu de opções e delega as funcionalidades
 * (como cadastro de contas, consulta de saldo, depósitos, saques, pagamentos e
 * verificação de cheque especial) para a classe BankService. As contas são
 * armazenadas em uma lista e manipuladas conforme a opção escolhida pelo usuário.
 *
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Java e a Arte da Abstração com Classes e Encapsulamento
 * Autor: Roseli Nakaoka
 * Data: 21/07/2025
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {

    private final BankService service = new BankService();
    private final Scanner scanner = new Scanner(System.in);
    private final List<BankAccount> contas = new ArrayList<>();

    public void run() {
        int option = 999;

        while (option != 0) {
            printMenu();
            option = InputReader.readInt("Digite a opção desejada: ");
            handleOption(option);
        }
        scanner.close();
    }

    private void printMenu() {
        // Menu de Opções do Sistema Bancário
        System.out.println();
        System.out.println("------------  Sistema Bancário -------------\n");
        System.out.println("----  1 - Cadastrar Conta Bancária");
        System.out.println("----  2 - Consultar Saldo");
        System.out.println("----  3 - Consultar Cheque Especial");
        System.out.println("----  4 - Depositar Dinheiro");
        System.out.println("----  5 - Sacar Dinheiro");
        System.out.println("----  6 - Pagar um boleto");
        System.out.println("----  7 - Verificar uso de cheque especial");
        System.out.println("----  0 - Sair\n");
    }

    private void handleOption(int option) {
        // Executa o method correspondente à opção escolhida
        switch (option) {
            case 1 -> service.registerBankAccount(contas);
            case 2 -> service.viewAccountBalance(contas);
            case 3 -> service.viewOverdraft(contas);
            case 4 -> service.cashDeposit(contas);
            case 5 -> service.cashWithdrawal(contas);
            case 6 -> service.payBill(contas);
            case 7 -> service.verifyOverdraft(contas);
            case 0 -> System.out.println("Programa Encerrado");
            default -> System.out.println("Opção Inválida!");
        }
    }

    private int inputInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Opção Inválida. Tente novamente: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
