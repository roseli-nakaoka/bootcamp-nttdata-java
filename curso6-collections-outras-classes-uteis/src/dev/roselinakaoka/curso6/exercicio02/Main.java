package dev.roselinakaoka.curso6.exercicio02;

import java.util.Scanner;

import static dev.roselinakaoka.curso6.exercicio02.PhoneFormatter.phoneFormat;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do telefone: ");
        String inputPhoneString = scanner.nextLine().trim();
        System.out.println(phoneFormat(inputPhoneString));

    }
}
