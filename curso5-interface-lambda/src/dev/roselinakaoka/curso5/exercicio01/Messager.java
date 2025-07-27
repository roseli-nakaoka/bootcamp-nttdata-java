package dev.roselinakaoka.curso5.exercicio01;

/*
 * Interface: Messager
 *
 * Descrição:
 * Esta interface define o contrato para envio de mensagens por diferentes meios
 * de comunicação. Qualquer classe que implementar `Messager` deve fornecer sua
 * própria implementação do metodo `sendMessage`, que recebe uma mensagem do tipo
 * `String` como parâmetro.
 *
 * A interface permite o uso de polimorfismo no programa principal, tornando
 * possível alternar entre diferentes formas de envio (como Email, SMS, WhatsApp,
 * Redes Sociais) sem alterar a lógica principal do sistema.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

@FunctionalInterface
public interface Messager {
    void sendMessage(String message);
}
