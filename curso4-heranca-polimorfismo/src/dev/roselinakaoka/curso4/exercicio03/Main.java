package dev.roselinakaoka.curso4.exercicio03;

public class Main {

    public static void main(String[] args) {

        try {
            // Criação do relógio no formato brasileiro (24h)
            Clock clockBR = new BRClock(22, 45, 59);

            // Criação do relógio no formato americano (12h com AM/PM)
            Clock clockUS = new USClock(12, 0, 0, Periodo.PM);

            System.out.println("----------- Conversão Relógio Brasileiro para US -----------");
            System.out.println("Relógio Padrão Brasileiro");
            System.out.println(clockBR);

            // Conversão do relógio brasileiro para o formato US
            clockUS = clockUS.convertClock(clockBR);
            System.out.println("Relógio Convertido para o Padrão US");
            System.out.println(clockUS);

            // Criação de outro relógio US e um brasileiro vazio para testar nova conversão
            Clock clockUS2 = new USClock(12, 15, 0, Periodo.AM);
            Clock clockBR2 = new BRClock(0, 0, 0);

            System.out.println("----------- Conversão Relógio US para Brasileiro -----------");
            System.out.println("Relógio Padrão US");
            System.out.println(clockUS2);

            // Conversão do relógio US para o formato brasileiro
            clockBR2 = clockBR2.convertClock(clockUS2);
            System.out.println("Relógio Convertido para o Padrão Brasileiro");
            System.out.println(clockBR2);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar Clock: " + e.getMessage());
        }
    }
}
