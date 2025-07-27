package dev.roselinakaoka.curso5.exercicio03;

/*
 * Classe: Square
 *
 * Descrição:
 * Representa um quadrado com um lado de tamanho definido.
 * Implementa a interface GeometricShapes para cálculo da área.
 *
 * Possui construtor para inicializar o lado e metodo para calcular a área.
 *
 * Autor: Roseli Nakaoka
 * Data: 27/07/2025
 */

public class Square implements GeometricShapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
