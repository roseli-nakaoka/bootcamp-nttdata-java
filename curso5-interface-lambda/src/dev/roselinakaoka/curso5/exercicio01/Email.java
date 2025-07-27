package dev.roselinakaoka.curso5.exercicio01;

/*
 * Classe: Email
 *
 * Descrição:
 * Esta classe representa um meio de envio de mensagens via e-mail, implementando
 * a interface `Messager`. Ao ser acionada, executa o metodo `sendMessage`,
 * que imprime no console a simulação do envio de uma mensagem por e-mail.
 *
 * A classe aplica o conceito de polimorfismo, permitindo que diferentes meios
 * de comunicação (como SMS, WhatsApp, etc.) sejam tratados de forma uniforme
 * no programa principal.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

public class Email implements Messager {
    @Override
    public void sendMessage(String message) {
        System.out.printf("Enviando E-mail : %s", message);
    }
}
