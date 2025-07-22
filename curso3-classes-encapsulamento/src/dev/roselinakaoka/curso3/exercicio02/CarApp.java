package dev.roselinakaoka.curso3.exercicio02;

/**
 * CarApp.java
 *
 * Esta classe representa a aplicação principal de simulação de um carro.
 * É responsável por registrar o veículo, exibir o menu interativo e gerenciar
 * as ações escolhidas pelo usuário, como ligar/desligar o carro, acelerar,
 * frear, virar, trocar de marcha e verificar a velocidade.
 *
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Java e a Arte da Abstração com Classes e Encapsulamento
 * Exercício 02 : Simulação de um carro
 * Autor: Roseli Nakaoka
 * Data: 22/07/2025
 */

import java.util.Scanner;

public class CarApp {

    private final Scanner scanner = new Scanner(System.in);

    //O metodo run() é o ponto de partida da aplicação, responsável por iniciar o
    // programa, registrar o carro e gerenciar o loop principal de interação com o
    // usuário, permitindo a execução das funcionalidades conforme as opções escolhidas
    // no menu.

    public void run() {

        Car car = registerCar();
        int option = 999;
        while (option != 0) {
            printMenu();
            option = inputInt("Digite a opção desejada: ");
            handleOption(car, option);
        }

        scanner.close();
    }


    // Metodo que exibe o Menu de opções de Controle do Carro
    private void printMenu() {

        // Menu de Opções de Controle do Carro

        System.out.println("\n------------  Controle do Carro -------------\n");
        System.out.println("----  1 - Ligar o Carro");
        System.out.println("----  2 - Desligar o Carro");
        System.out.println("----  3 - Acelerar");
        System.out.println("----  4 - Diminuir a Velocidade");
        System.out.println("----  5 - Virar para Esquerda/Direita");
        System.out.println("----  6 - Verificar a Velocidade");
        System.out.println("----  7 - Trocar a Marcha");
        System.out.println("----  0 - Sair\n");
    }

    //O metodo handleOption executa a ação correspondente à opção escolhida
    // pelo usuário no menu

    private void handleOption(Car car, int option) {

        // Executa o method correspondente à opção escolhida
        switch (option) {
            case 1 -> car.turnOnCar();
            case 2 -> car.turnOffCar();
            case 3 -> car.accelerateCar();
            case 4 -> car.deccelerateCar();
            case 5 -> car.turnCar();
            case 6 -> car.verifySpeed();
            case 7 -> changeGear(car);
            case 0 -> System.out.println("Programa Encerrado");
            default -> System.out.println("Opção Inválida!");
        }
    }

    // O metodo registerCar solicita ao usuário um nome válido para o carro, repetindo a entrada até que
    // seja fornecido um valor não vazio, e então cria e retorna um objeto Car com esse nome.

    private Car registerCar() {
        String inputName="";

        while (inputName.isBlank()) {
            System.out.print("Digite o nome do seu carro: ");
            inputName = scanner.nextLine();

            if (inputName.isBlank()) {
                System.out.println("Nome inválido. Por favor, tente novamente.\n");
            }
        }
        Car car = new Car(inputName.trim());
        System.out.println("O carro foi cadastrado.\n");
        return car;
    }

    //inputInt: Solicita um número inteiro ao usuário, repetindo até que uma entrada
    // válida seja fornecida.

    private int inputInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Opção Inválida. Tente novamente: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    //changeGear: Tenta trocar a marcha do carro, validando se o carro está ligado e
    // se a troca é válida com base na marcha e velocidade atual.

    private void changeGear(Car car) {

        if (!car.verifyCarOn()) return;

        int gear = inputInt("Entre com a marcha desejada (0-6): ");
        int speed;

        if (gear == car.getGear()+1) {
            speed = (car.getSpeed()+1);
        } else if (gear == car.getGear()-1) {
            speed = (car.getSpeed()-1);
        } else {
            System.out.println("Marcha inválida.");
            return;
        }

        if (car.isSpeedPermitted(gear, speed)) {
            car.setGear(gear);
            car.setSpeed(speed);
            System.out.printf("Trocada para a marcha %d.", car.getGear());
        } else {
            System.out.println("Troca de marcha inválida.");
        }
    }

}
