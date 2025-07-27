package dev.roselinakaoka.curso5.exercicio01;
/*
 * Classe: WhatsApp
 *
 * Descrição:
 * Esta classe representa o envio de mensagens por meio do aplicativo WhatsApp,
 * implementando a interface `Messager`. A implementação do metodo `sendMessage`
 * simula o envio de uma mensagem pelo WhatsApp, imprimindo o conteúdo no console.
 *
 * Utilizada em contextos onde se deseja abstrair o meio de envio da mensagem,
 * permitindo que diferentes canais de comunicação sejam tratados de forma uniforme
 * através da interface `Messager`.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

@FunctionalInterface
public class WhatsApp implements Messager {
    public void sendMessage(String message) {
        System.out.printf("Enviando WhatsApp : %s", message);
    }
}
