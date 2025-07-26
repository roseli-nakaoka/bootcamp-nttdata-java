package dev.roselinakaoka.curso4.exercicio01;

import java.util.ArrayList;
import java.util.List;

/*
* Exercício 01 : Classe principal para testar a hierarquia de ingressos.
* Instancia diferentes tipos de ingressos (normal, meia-entrada e família),
* adiciona-os a uma lista e exibe seus detalhes e preços calculados.
*
* Bootcamp: NTT Data - Java e IA para Iniciantes
* Curso 4: Herança e Polimorfismo em Java
* Autor: Roseli Nakaoka
* Data: 02/07/2025
*/

public class Main {

    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso(30.00, "Procurando Nemo", FormatoAudio.LEGENDADO);
        Ingresso meiaEntrada = new MeiaEntrada(40.00, "O Fabuloso destino de Amelie Poulin", FormatoAudio.LEGENDADO);
        Ingresso ingressoFamilia = new IngressoFamilia(20.00, "Titanic", FormatoAudio.DUBLADO,4);

        List<Ingresso> listaIngressos = new ArrayList<>();
        listaIngressos.add(ingresso);
        listaIngressos.add(meiaEntrada);
        listaIngressos.add(ingressoFamilia);

        for(Ingresso ing : listaIngressos) {
            System.out.println("------------ Ingresso ------------");
            System.out.printf("Preço             : R$ %.2f\n", ing.getPreco());
            System.out.printf("Preço calculado   : R$ %.2f\n", ing.CalculaPreco());
            ing.EmiteIngresso();
        }

    }
}