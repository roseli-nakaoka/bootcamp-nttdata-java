package dev.roselinakaoka.curso6.exercicio01;

import java.util.List;
import java.util.function.BiFunction;

public enum Operation {

    SOMA {
        @Override
        public double calculate(List<Integer> numbers) {
            return numbers.stream()
                    .reduce(0, (a, b) -> a + b);
        }
    },
    SUBTRACAO {
        @Override
        public double calculate(List<Integer> numbers) {
            // Subtrai na ordem em que os números aparecem
            return numbers.stream()
                    .reduce((a, b) -> a - b)
                    .orElse(0);
        }
    };

    public abstract double calculate(List<Integer> numbers);
}

