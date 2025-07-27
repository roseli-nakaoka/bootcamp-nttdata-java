package dev.roselinakaoka.curso5.exercicio03;

/*
 * Representa um círculo e permite o cálculo de sua área.
 * Implementa a interface GeometricShapes.
 *
 * Fórmula usada para calcular a área: A = π * r²
 *
 * autor: Roseli Nakaoka
 * data : 27/07/2025
 */

public class Circle implements GeometricShapes {

    private static final double pi = 3.14159265359;
    private double radius;

    /* Construtor da classe Circle */

    public Circle(double radius) {
        this.radius = radius;
    }

    /*
     * Calcula a área do círculo e retorna a área calculada
     */

    @Override
    public double calculateArea() {
        return pi * radius * radius;
    }
}

