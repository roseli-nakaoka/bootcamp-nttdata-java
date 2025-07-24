package dev.roselinakaoka.curso3.exercicio03;

/**
 * Classe responsável por gerenciar a aplicação de banho em pets via menu interativo.
 * Permite cadastrar pets, selecionar um pet e operar a máquina de banho de acordo com as opções escolhidas.
 * Gerencia a comunicação entre o usuário e a PetWashMachine.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetWashApp {
    private final Scanner scanner = new Scanner(System.in);
    private final PetWashMachine petWashMachine = new PetWashMachine();
    private final List<Pet> listPet = new ArrayList<>();

    //O metodo run() é o ponto de partida da aplicação, responsável por iniciar o
    // programa, registrar o Pet e gerenciar o loop principal de interação com o
    // usuário, permitindo a execução das funcionalidades conforme as opções escolhidas
    // no menu.

    public void run() {

        int option = 999;
        while (option != 0) {
            System.out.println("\n------------ Cadastrar Pet -------------\n");
            System.out.println("----  1 - Cadastrar Pet");
            System.out.println("----  2 - Selecionar Pet");
            System.out.println("----  0 - Sair\n");

            option = inputInt("Digite a opção desejada: ");
            //scanner.nextLine();

            if (option == 1) {
                Pet pet = inputPet();
                listPet.add(pet);
                mostraListaPets();
            } else if (option == 2) {
                Pet pet = buscaPet();
                if(pet != null) {
                    int option2 = 999;
                    while (option2 != 0) {
                        printMenu();
                        option2 = inputInt("Digite a opção desejada: ");
                        handleOption(pet, option2);
                    }
                } else {
                    System.out.println("Pet não encontrado !");
                }

            } else if (option != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    // Metodo que exibe o Menu de opções de Controle da Máquina de Lavagem de Pet

    private void printMenu() {

        // Menu de Opções de Controle da Máquina de Lavagem de Pet

        System.out.println("\n------------ Máquina de Lavagem de Pet -------------\n");
        System.out.println("----  1  - Dar Banho no Pet");
        System.out.println("----  2  - Abastecer com Água");
        System.out.println("----  3  - Abastecer com Shampoo");
        System.out.println("----  4  - Verificar Nível de Água");
        System.out.println("----  5  - Verificar Nível de Shampoo");
        System.out.println("----  6  - Verificar se tem Pet no Banho");
        System.out.println("----  7  - Colocar Pet na Máquina");
        System.out.println("----  8  - Retirar Pet da Máquina");
        System.out.println("----  9  - Limpar a Máquina");
        System.out.println("----  10 - Verificar Status da Máquina");
        System.out.println("----  0  - Sair\n");
    }

    // handleOption: executa a ação correspondente à opção escolhida
    // pelo usuário no menu de Máquina de Lavagem de Pet

    private void handleOption(Pet pet, int option) {

        // Executa o method correspondente à opção escolhida

        switch (option) {
            case 1 -> petWashMachine.petBath(pet);
            case 2 -> petWashMachine.fillWater();
            case 3 -> petWashMachine.fillShampoo();
            case 4 -> petWashMachine.verifyWaterLevel();
            case 5 -> petWashMachine.verifyShampooLevel();
            case 6 -> petWashMachine.verifyPetInMachine();
            case 7 -> petWashMachine.putPetInMachine(pet);
            case 8 -> petWashMachine.removePetFromMachine(pet);
            case 9 -> petWashMachine.cleanMachine();
            case 10 -> petWashMachine.machineStatus();
            case 0 -> System.out.println("Programa Encerrado");
            default -> System.out.println("Opção Inválida!");
        }
    }

    // Exibe a lista de Pets Cadastrados

    private void mostraListaPets() {
        System.out.println("Pets cadastrados:");
        for (Pet pet : listPet) {
            System.out.printf("Nome: %s (%s) - Status: %s\n", pet.getPetName(), pet.getPetType(), pet.isPetClean()?"Limpo": "Sujo");
        }
    }
    // buscaPet() : Procura o Pet na lista de Pets
    private Pet buscaPet() {

        String inputNome = readString("Digite o nome do Pet: ");

        for (Pet pet : listPet) {
            if(inputNome.equalsIgnoreCase(pet.getPetName())){
                return pet;
            }
        }
        return null;
    }

    // inputPet() : Cria um registro de Pet
    private Pet inputPet() {
        String inputName = readString("Digite o nome do Pet: ");
        String inputTipo = readString("Digite o tipo de Pet (ex.cachorro, gato): ");
        return new Pet(inputName, inputTipo);
    }

    // readString : Lê uma linha de texto
    private String readString(String prompt) {
        String inputString = "";
        while (inputString.isBlank()) {
            System.out.print(prompt);
            inputString = scanner.nextLine();

            if (inputString.isBlank()) {
                System.out.println("Por favor, preencha o campo para prosseguir.\n");
            }
        }
        return inputString;
    }

    // readString : Faz a leitura de um número inteiro
    private int inputInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Opção Inválida. Tente novamente: ");
            scanner.next();
        }
        int result = scanner.nextInt();
        scanner.nextLine(); // consome quebra de linha
        return result;
    }

}

