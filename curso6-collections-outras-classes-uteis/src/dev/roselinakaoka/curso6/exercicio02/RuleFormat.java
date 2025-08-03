package dev.roselinakaoka.curso6.exercicio02;

public class RuleFormat{

    int size;
    String device;
    String regex;
    String replacement;

    RuleFormat(int size, String device, String regex, String replacement) {
        this.size = size;
        this.device = device;
        this.regex = regex;
        this.replacement = replacement;
    }

    boolean findSize(String numbers) {
        return numbers.length() == size;
    }

    String format(String numbers) {
        return numbers.replaceAll(regex, replacement);
    }

    String getDevice() {
        return device;
    }
}
