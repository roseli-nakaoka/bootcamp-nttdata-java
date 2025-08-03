package dev.roselinakaoka.curso6.exercicio01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)  {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a operação desejada (SOMA ou SUBTRACAO): ");
            String operationStr = scanner.nextLine().trim().toUpperCase();

            Operation operation;
            try {
                operation = Operation.valueOf(operationStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Operação inválida.");
                return;
            }

            System.out.print("Digite números inteiros separados por vírgula (ex: 1, 1, -20, 4): ");
            String numberEntries = scanner.nextLine();

            try {
                List<Integer> numbers = Arrays.stream(numberEntries.split(","))
                        .map(String::trim)
                        .map(Main::parseOrThrow)
                        .collect(Collectors.toList());

                double result = operation.calculate(numbers);
                System.out.println("Resultado: " + result);

            } catch (IllegalArgumentException e){
                System.err.println("Erro: " + e.getMessage());
            }

        }

    // metodo auxiliar que valida e converte
    private static Integer parseOrThrow(String valor) {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Valor inválido: \"" + valor + "\"");
        }
    }

}
