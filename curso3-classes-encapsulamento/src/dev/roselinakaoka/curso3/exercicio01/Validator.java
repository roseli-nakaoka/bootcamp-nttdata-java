package dev.roselinakaoka.curso3.exercicio01;

/*
 * * A classe Validator oferece métodos utilitários para validar entradas de nome e CPF.
 * Garante que o nome contenha apenas letras (inclusive com acentos) e que o CPF tenha
 * exatamente 11 dígitos numéricos. Todos os métodos são estáticos e a classe funciona
 * como auxiliar de validação de dados.
 *
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Java e a Arte da Abstração com Classes e Encapsulamento
 * Autor: Roseli Nakaoka
 * Data: 21/07/2025
 */


public class Validator {

    // Validação de formatos de inputs de cpf e nome

    public static boolean validName(String name) {
        // \\p{L}+ aceita qualquer caracter que seja letra, incluindo acentos
        return name.matches("[\\p{L} ]+") ? true : false;

    }

    public static boolean validCpf(String cpf) {
        return cpf.matches("\\d{11}") ? true : false;
    }


}
