package dev.roselinakaoka.curso3.exercicio01;

/*
 * * A classe InputReader fornece métodos utilitários estáticos para ler e validar
 * entradas do usuário via console. Ela trata exceções ao ler textos, números inteiros,
 * números decimais e datas no formato dd/MM/yyyy, garantindo que os dados inseridos sejam
 * válidos antes de prosseguir. A classe não pode ser instanciada.
 *
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Java e a Arte da Abstração com Classes e Encapsulamento
 * Autor: Roseli Nakaoka
 * Data: 21/07/2025
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class InputReader {

    private static final Scanner scanner = new Scanner(System.in);

    private InputReader() {
        // impede que alguém instancie essa classe
    }

    // Lê uma linha de texto
    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    // Lê um inteiro com tratamento de erro
    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    // Lê um número decimal (double) com tratamento de erro
    public static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número decimal.");
            }
        }
    }

    // Lê uma data no formato dd/mm/aaaa

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate readDate (String prompt) {

        LocalDate data = null;

        boolean formatoValido = false;

        while (!formatoValido) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim();

            try {
                data = LocalDate.parse(entrada, FORMATTER);
                formatoValido = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Tente novamente.");
            }
        }
        return data;
    }


}
