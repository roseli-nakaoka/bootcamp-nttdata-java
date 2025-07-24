package dev.roselinakaoka.curso3.exercicio03;
/**
 * Representa um Pet com nome, tipo (ex: cachorro, gato) e estado de limpeza.
 * É utilizado no controle da máquina de banho para registrar os pets atendidos.
 */
public class Pet {

    private String petName;
    private String petType;
    private boolean petClean;

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;
        this.petClean = false;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public boolean isPetClean() {
        return petClean;
    }

    public void setPetClean(boolean petClean) {
        this.petClean = petClean;
    }
}
