package dev.roselinakaoka.curso5.exercicio01;

/*
 * Classe: SocialMedia
 *
 * Descrição:
 * Esta classe representa o envio de mensagens por meio de redes sociais,
 * implementando a interface `Messager`. A implementação do metodo `sendMessage`
 * simula o envio de uma mensagem através de plataformas sociais (como Instagram,
 * Facebook, X/Twitter etc.), imprimindo o conteúdo no console.
 *
 * A classe é usada no contexto de polimorfismo, permitindo ao sistema principal
 * tratar diversos meios de comunicação de forma uniforme por meio da interface
 * comum `Messager`.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 * Linguagem: Java
 */

public class SocialMedia implements Messager {
    public void sendMessage(String message) {
        System.out.printf("Enviando mensagem via Redes Sociais: %s", message);
    }
}
