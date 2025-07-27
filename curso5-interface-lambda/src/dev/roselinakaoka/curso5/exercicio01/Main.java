package dev.roselinakaoka.curso5.exercicio01;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

/*
 * Programa: Enviador de Mensagens via Interface Messager
 *
 * Descrição:
 * Este programa permite ao usuário escolher um meio de envio de mensagem
 * (SMS, Email, Redes Sociais ou WhatsApp) e enviar uma mensagem utilizando
 * o polimorfismo via interface Messager. Cada meio de envio é representado
 * por uma classe concreta que implementa a interface.
 *
 * O uso da interface permite tratar todas as implementações de forma genérica,
 * tornando o sistema flexível e extensível.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Messager messager = null;

        System.out.println("Escolha o meio de envio (sms, email, redes, whatsapp): ");
        String escolha = scanner.nextLine().toLowerCase();

        switch (escolha) {
            case "sms":
                messager = new Sms();
                break;
            case "email":
                messager = new Email();
                break;
            case "redes":
                messager = new SocialMedia();
                break;
            case "whatsapp":
                messager = new WhatsApp();
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        System.out.println("Digite a mensagem a ser enviada:");
        String mensagem = scanner.nextLine();

        // Chama o metodo de envio de mensagem, independentemente do tipo
        messager.sendMessage(mensagem);
    }
}

