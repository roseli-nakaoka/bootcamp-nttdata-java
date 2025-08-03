package dev.roselinakaoka.curso6.exercicio03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static dev.roselinakaoka.curso6.exercicio03.OutputFormat.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Map<String, Object> dados = new LinkedHashMap<>();

        while (true) {
            System.out.println("Digite no formato NOME;VALOR;TIPO; ou 'sair' para encerrar:");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("sair")) break;

            String[] parcels = input.split(";");
            if (parcels.length < 3) {
                System.out.println("Formato inválido. Tente novamente.");
                continue;
            }

            String nome = parcels[0].trim();
            String valor = parcels[1].trim();
            String tipo = parcels[2].trim().toLowerCase();

            Object convertido;

            try {
                switch (tipo) {
                    case "integer" -> convertido = Integer.parseInt(valor);
                    case "float" -> convertido = Double.parseDouble(valor);
                    case "boolean" -> convertido = Boolean.parseBoolean(valor);
                    case "date" -> convertido = LocalDate.parse(valor);
                    case "date time" -> convertido = LocalDateTime.parse(valor);
                    case "string" -> convertido = valor;
                    default -> {
                        System.out.println("Tipo desconhecido, armazenando como texto.");
                        convertido = valor;
                    }
                }
                dados.put(nome, convertido);
            } catch (NumberFormatException | DateTimeParseException e) {
                System.out.println("Erro na conversão do valor: " + e.getMessage());
            }
        }

        System.out.println("\nDados inseridos:");
        dados.forEach((k, v) -> System.out.println(k + ": " + v + " (" + v.getClass().getSimpleName() + ")"));

        System.out.println("JSON:");
        System.out.println(mapParaJson(dados));

        System.out.println("\nXML:");
        System.out.println(mapParaXml(dados));

        System.out.println("\nYAML:");
        System.out.println(mapParaYaml(dados));

        sc.close();

    }

}
