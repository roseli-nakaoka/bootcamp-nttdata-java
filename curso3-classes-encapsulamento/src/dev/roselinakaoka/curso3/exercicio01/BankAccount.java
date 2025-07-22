package dev.roselinakaoka.curso3.exercicio01;

/*
 * * A classe BankAccount simula uma conta bancária simples com geração automática
 * de número da conta, controle de saldo, cálculo de limite de cheque especial baseado
 * no saldo inicial e verificação do uso do limite. Armazena dados como CPF, nome, saldo,
 * limite e taxa de cheque especial. Fornece métodos para consultar e atualizar informações
 * da conta, além de calcular o saldo disponível e verificar se o usuário está utilizando o
 * cheque especial.
 *
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Java e a Arte da Abstração com Classes e Encapsulamento
 * Autor: Roseli Nakaoka
 * Data: 21/07/2025
 */

public class BankAccount {

    private static int accountNumberCounter = 0;

    private final String cpf;
    private final String accountNumber;
    private final double overdraftLimit;
    private String name="";
    private double accountBalance=0.0;
    private double overdraftFee=0.0;

// BankAccount Constructor

    public BankAccount(String cpf,String name, double accountBalance) {

        this.cpf = cpf;
        this.name = name;
        this.accountNumber = generateAccountNumber();
        this.accountBalance = accountBalance;

        // Regra de negócio para limite de cheque especial

        if(accountBalance <= 500.00)
            this.overdraftLimit = 50.00;
        else
            this.overdraftLimit = accountBalance * 0.50;

    }

    private String generateAccountNumber() {
        return "CC000"+(++accountNumberCounter);
    }

    //Getters
    public String getCpf() {
        return cpf;
    }
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }
    public Double getOverdraftLimit() {
        return overdraftLimit;
    }

    public Double getOverdraftFee() {
        return overdraftFee;
    }

    public double availableBalance() {
        return (this.getOverdraftLimit() + this.getAccountBalance());
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setOverdraftFee(Double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public boolean usingOverdraft(){
        return (this.accountBalance < 0) ? true: false;
    }

}
