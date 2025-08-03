package dev.roselinakaoka.curso6.exercicio02;

import java.util.List;

public class PhoneFormatter {

    public static String phoneFormat(String input) {

        if (input == null) return "Entrada Inválida";

        String numbers = input.replaceAll("\\D", "");

        List<RuleFormat> rules = List.of(
                new RuleFormat(11, "Celular", "(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3"),
                new RuleFormat(10, "Telefone Fixo","(\\d{2})(\\d{4})(\\d{4})", "($1) $2-$3"),
                new RuleFormat(9,  "Celular","(\\d{5})(\\d{4})",         "$1-$2"),
                new RuleFormat(8,  "Telefone Fixo","(\\d{4})(\\d{4})",         "$1-$2")
        );

        return rules.stream()
                .filter(rule -> rule.findSize(numbers))
                .findFirst()
                .map(rule -> {
                    String formatted = rule.format(numbers);
                    // Se já estiver formatado exatamente como o resultado, imprime tipo
                    if (input.equals(formatted)) {
                        System.out.println("Tipo de dispositivo: " + rule.getDevice());
                    }
                    return formatted;
                })
                .orElse("Entrada Inválida");
    }
}
