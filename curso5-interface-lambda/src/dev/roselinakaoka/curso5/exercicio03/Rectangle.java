package dev.roselinakaoka.curso5.exercicio03;

/*
 * Classe: Rectangle
 *
 * Descrição:
 * Representa um retângulo com base e altura, e permite calcular sua área.
 * Implementa a interface GeometricShapes.
 *
 * Possui métodos para acessar as dimensões e calcular a área.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 */


public class Rectangle implements GeometricShapes {

    private double height;
    private double base;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

}
