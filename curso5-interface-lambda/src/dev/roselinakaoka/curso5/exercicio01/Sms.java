package dev.roselinakaoka.curso5.exercicio01;

/*
 * Classe: Sms
 *
 * Descrição:
 * Esta classe representa um meio de envio de mensagens via SMS, implementando
 * a interface `Messager`. Sua implementação do método `sendMessage` simula o envio
 * de uma mensagem por SMS, imprimindo o conteúdo no console.
 *
 * A classe é utilizada em conjunto com outras implementações da interface `Messager`
 * (como Email, WhatsApp, Redes Sociais) para demonstrar o uso de polimorfismo
 * no envio de mensagens de acordo com a escolha do usuário.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

public class Sms implements Messager {
    public void sendMessage(String message) {
        System.out.printf("Enviando SMS : %s", message);
    }
}
