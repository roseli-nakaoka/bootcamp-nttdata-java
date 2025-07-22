package dev.roselinakaoka.curso3.exercicio01;

/*
 * * A classe BankService centraliza as operações bancárias oferecidas no
 * menu principal, como cadastro de conta, depósito, saque, pagamento de boletos,
 * e consultas de saldo e cheque especial. Também gerencia a entrada de dados do usuário,
 * validações e regras de negócio, incluindo o cálculo de taxas ao usar o cheque especial
 * e o tratamento de depósitos que cobrem esse valor.
 *
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Java e a Arte da Abstração com Classes e Encapsulamento
 * Autor: Roseli Nakaoka
 * Data: 21/07/2025
 */

import java.time.LocalDate;
import java.util.List;

public class BankService {

    // Métodos referente à cada uma das opções do Menu Principal

    public void payBill(List<BankAccount> contas){
        BankAccount conta = findCpf(contas);
        if(conta!=null){

            LocalDate dataPagamento = InputReader.readDate( "Digite a data de vencimento da fatura (dd/MM/yyyy): ");
            LocalDate hoje = LocalDate.now();

            if (dataPagamento.isBefore(hoje)) {
                System.out.println("Boleto vencido, pagar em qualquer banco, " +
                        "lotérica ou agência dos Correios\n");
            } else {
                double amount = inputAmount("pagamento", conta);
                if (amount != -1) {
                    debitAmount("pagamento", amount, conta);
                    printAccountSummary(conta);
                }
            }
        }
    }

    public void cashWithdrawal(List<BankAccount> contas) {

        BankAccount conta = findCpf(contas);

        if(conta!=null){
            double amount = inputAmount("Saque", conta);
            if (amount!=-1) {
                debitAmount("Saque", amount, conta);
                printAccountSummary(conta);
            }
        }
    }

    public void cashDeposit(List<BankAccount> contas) {

        BankAccount conta = findCpf(contas);

        if(conta!=null){
            double amount = inputAmount("depósito", conta);
            if (amount!=-1) {
                depositAmount(amount, conta);
            }
        }
    }

    public void viewOverdraft(List<BankAccount> contas) {

        BankAccount conta = findCpf(contas);

        if(conta!=null) {

            double overdraftUsed = conta.getAccountBalance() < 0 ? Math.abs(conta.getAccountBalance()):0.0;
            System.out.printf("\nLimite de Cheque Especial : %.2f ", conta.getOverdraftLimit());
            System.out.printf("\nSaldo Utilizado de Cheque Especial : %.2f ", overdraftUsed);
            System.out.printf("\nSaldo Disponível de Cheque Especial : %.2f \n", conta.availableBalance());

        }

    }

    public void verifyOverdraft(List<BankAccount> contas){

        BankAccount conta = findCpf(contas);

        if(conta!=null) {
            if(conta.usingOverdraft())
                System.out.printf("Está utilizando R$ %.2f do limite de cheque especial.",
                        Math.abs(conta.getAccountBalance()));
            else
                System.out.println("Não está utilizando o limite de cheque especial.");
        }

    }

    public void viewAccountBalance(List<BankAccount> contas) {

        BankAccount conta = findCpf(contas);

        if(conta!=null)

            printAccountSummary(conta);

    }

    public void registerBankAccount(List<BankAccount> contas) {

        BankAccount conta = inputRegisterAccount();

        System.out.printf("A conta %s foi gerada com sucesso !\n", conta.getAccountNumber());
        System.out.println("\n-------------- Resumo da Nova Conta Bancária --------------");
        System.out.printf("\nConta = %s ", conta.getAccountNumber());
        System.out.printf("\nCPF = %s  Nome = %s ", conta.getCpf(), conta.getName());
        System.out.printf("\nSaldo = %.2f ", conta.getAccountBalance());
        System.out.printf("\nLimite de Cheque Especial = %.2f ", conta.getOverdraftLimit());
        System.out.printf("\nSaldo Disponível = %.2f \n",  conta.availableBalance());

        contas.add(conta);
    }

    // Métodos utilitários

    public BankAccount searchAccount(String cpf, List<BankAccount> contas){

        for (BankAccount conta : contas) {
            if (conta.getCpf().equals(cpf)) {
                return conta;
            }
        }
        return null;
    }

    public BankAccount findCpf(List<BankAccount> contas) {

        String cpfBusca = InputReader.readString("\nDigite o CPF: ");

        BankAccount conta = searchAccount(cpfBusca, contas);

        if (contas.equals(null)) {
            System.out.println("Conta não encontrada.");
            return null;
        } else {
            System.out.printf(" Conta Número: %s \n", conta.getAccountNumber());
            System.out.printf(" CFP: %s Nome: %s \n", conta.getCpf(), conta.getName());
            return conta;
        }
    }

    public double inputAmount(String amountType, BankAccount conta) {

        // Entrada e validação da propriedade initialDeposit

        boolean inputValid = false;
        double amount = 0.0;

        while (!inputValid) {
            //System.out.printf("\nDigite o valor do %s : ", amountType);
            String input = InputReader.readString("\nDigite o valor do " + amountType + " : ");

            try {
                amount = Double.parseDouble(input);
                if (amount < 0) {
                    System.out.println("Valor não pode ser negativo. Tente novamente.");
                } else if (amount > (conta.getAccountBalance() + conta.getOverdraftLimit()) &&
                        !amountType.equalsIgnoreCase("depósito")) {
                    System.out.printf("Valor do %s excede o limite do cheque especial.\n", amountType);
                    return -1;
                } else {
                    inputValid = true; // tudo certo
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um valor válido (ex: 100.50).");
            }
        }
        return amount;
    }

    public void debitAmount(String amountType, double amount, BankAccount conta) {

        double calculatedOverdraftFee;

        conta.setAccountBalance(conta.getAccountBalance() - amount);

        if (conta.getAccountBalance() < 0.0) { // se o amount < saldo, o cliente entrou no limite do cheque especial
            calculatedOverdraftFee = Math.abs(conta.getAccountBalance()*0.2);
            conta.setOverdraftFee(calculatedOverdraftFee);
            System.out.println("Você está utilizando o saldo de cheque especial.");

        }

        System.out.printf("O %s foi realizado com sucesso!\n", amountType);
    }

    public void depositAmount(double amount, BankAccount conta) {

        double depositRemain;
        double payedOverdraftFee;


        if(conta.getAccountBalance() < 0){ // Utilizando saldo de cheque especial

            depositRemain = amount - conta.getOverdraftFee();

            if(depositRemain >= 0) {
                conta.setAccountBalance(conta.getAccountBalance() + Math.abs(depositRemain));
                payedOverdraftFee = conta.getOverdraftFee();
                conta.setOverdraftFee(0.0);

            } else {
                conta.setOverdraftFee(Math.abs(depositRemain));
                payedOverdraftFee = amount;

            }
        } else { // Não está utilizando saldo de limite especial
            conta.setAccountBalance(conta.getAccountBalance() + amount);
            payedOverdraftFee = 0.0;
        }

        printAccountSummaryDeposit(payedOverdraftFee,conta);

    }

    public void printAccountSummaryDeposit(double payedOverdraftFee, BankAccount conta){

        System.out.println("\nValor adicionado com sucesso!\n");
        System.out.printf("\nSaldo : %.2f ", conta.getAccountBalance());
        System.out.printf("\nSaldo Disponivel : %.2f ", conta.availableBalance());
        System.out.printf("\nTaxa de cheque especial debitado : %.2f ", payedOverdraftFee);
        System.out.printf("\nTaxa de cheque especial : %.2f\n", conta.getOverdraftFee());

    }

    public void printAccountSummary(BankAccount conta){

        System.out.printf("\nSaldo : %.2f ", conta.getAccountBalance());
        System.out.printf("\nLimite do Cheque especial : %.2f ", conta.getOverdraftLimit());
        System.out.printf("\nSaldo Disponível : %.2f ", conta.availableBalance());
        System.out.printf("\nTaxas de cheque especial : %.2f \n", conta.getOverdraftFee());
    }

    public BankAccount inputRegisterAccount(){

        String name="";
        String cpf="";
        double initialDeposit = 0.0;
        String input;

        // Entrada e validação da propriedade nome

        boolean inputNameValid = false;

        while (!inputNameValid) {
            input = InputReader.readString("Digite o nome: ");
            if(input.isEmpty() || !Validator.validName(input)) {
                System.out.println("Nome inválido! Tente novamente.");
            } else {
                name = input;
                inputNameValid = true;
            }
        }

        // Entrada e validação de input da propriedade CPF

        boolean inputCpfValid = false;

        while (!inputCpfValid) {
            input = InputReader.readString("Digite o CPF: ");
            if(input.isEmpty() || !Validator.validCpf(input)) {
                System.out.println("CPF inválido! Tente novamente.");
            } else {
                cpf = input;
                inputCpfValid = true;
            }
        }

        // Entrada e validação da propriedade initialDeposit

        boolean inputDepositValid = false;

        while (!inputDepositValid) {
            input = InputReader.readString("Digite o valor do depósito inicial: ");
            try {
                initialDeposit = Double.parseDouble(input);

                if (initialDeposit < 0.0) {
                    System.out.println("Valor não pode ser negativo. Tente novamente.");
                } else {
                    inputDepositValid = true; // tudo certo
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um valor válido (ex: 100.50).");
            }
        }

        return new BankAccount(cpf,name,initialDeposit);
    }

}
