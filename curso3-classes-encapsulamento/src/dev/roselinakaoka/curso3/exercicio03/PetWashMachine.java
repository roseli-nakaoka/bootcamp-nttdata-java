package dev.roselinakaoka.curso3.exercicio03;

/**
 * Simula a máquina de banho utilizada no petshop.
 * Gerencia os recursos (água, shampoo), o estado da máquina (limpa ou suja),
 * e as ações como dar banho, limpar a máquina, abastecer e controlar o pet dentro da máquina.
 * Apenas um pet por vez pode estar na máquina.
 */

public class PetWashMachine {

    private final double maxShampoo = 10;
    private final double maxWater = 30;
    private double shampooLevel = maxShampoo;
    private double waterLevel = maxWater;
    private Pet petInMachine = null;
    private boolean machineClean = true;
    private boolean petLeftClean = true;

    // Indica se a máquina está limpa/suja
    public boolean isMachineClean() {
        return machineClean;
    }

    // Dar banho no Pet
    public void petBath(Pet pet) {
        if (pet.isPetClean()) {
            System.out.printf("%s já está de banho tomado.\n", pet.getPetName());
        } else if (petInMachine!=null) {
            if(petInMachine.getPetName().equals(pet.getPetName())) {
                if (isMachineClean()) {
                    if (waterLevel >= 10 && shampooLevel >= 2) {
                        waterLevel -= 10;
                        shampooLevel -= 2;
                        pet.setPetClean(true);
                        petLeftClean = true;
                        System.out.printf("%s terminou o banho.\n", pet.getPetName());
                    } else {
                        machineClean = false;
                        petLeftClean = false;
                        System.out.println("Não foi possível dar banho no Pet. Nível insuficiente de água ou shampoo.\n");
                    }
                } else {
                    petLeftClean = false;
                    System.out.println("Não foi possível dar banho no Pet. A máquina está suja.\n");
                }
            }else {
                System.out.printf("Não foi possível dar banho em %s. %s ainda está na máquina.\n", pet.getPetName(), petInMachine.getPetName());
            }
        } else {
            System.out.println("A máquina está vazia. Favor colocar o Pet na máquina.\n");
        }

    }

    // Encher o reservatório de água, 2L por vez

    public void fillWater() {
        if(waterLevel < maxWater) {
            waterLevel += 2;
            System.out.printf("Foi adicionado 2L de água.\n");
        } else {
            System.out.printf("O reservatório de água já está na capacidade máxima de %.2f L.\n", maxWater);
        }
    }

    // Encher o reservatório de shampoo, 2L por vez

    public void fillShampoo() {
        if(shampooLevel < maxShampoo) {
            shampooLevel += 2;
            System.out.printf("Foi adicionado 2L de shampoo.\n");
        } else {
            System.out.printf("O reservatório de shampoo já está na capacidade máxima de %.2f L.\n", maxShampoo);
        }
    }

    // Verificar o nível de água do reservatório
    public void verifyWaterLevel() {
        System.out.printf("Nível de água atual : %.2f\n", waterLevel);
    }

    // Verifica o nível de shampoo do reservatório
    public void verifyShampooLevel() {
        System.out.printf("Nível de shampoo atual : %.2f\n", shampooLevel);
    }

    // Verifica se tem Pet dentro da máquina de lavagem
    public void verifyPetInMachine() {
        if (petInMachine != null) {
            System.out.printf("%s está na máquina de lavagem.\n", petInMachine.getPetName());
        } else {
            System.out.printf("A máquina está vazia.\n");
        }
    }

    // Coloca o Pet dentro da máquina de lavagem
    public void putPetInMachine(Pet pet) {
        if(petInMachine == null) {
            if(isMachineClean()) {
                petInMachine = pet;
                System.out.printf("%s foi colocado(a) na máquina de lavagem.\n", petInMachine.getPetName());
            } else {
                System.out.println("A máquina precisa ser limpa antes da utilização.\n");
            }
        } else {
            System.out.printf("A máquina está ocupada. %s está na máquina de lavagem.\n", petInMachine.getPetName());
        }
    }

    // Retira o Pet da máquina de lavagem
    public void removePetFromMachine(Pet pet) {
        if(petInMachine != null) {
            System.out.printf("%s foi retirado(a) da máquina e está %s.\n", petInMachine.getPetName(), petLeftClean ? "limpo(a)" : "sujo(a)");
            petLeftClean = petInMachine.isPetClean();
            if(!petLeftClean) machineClean = false;
            petInMachine = null;
        } else {
            System.out.printf("A máquina já está vazia.\n");
        }
    }

    // Limpa a máquina de lavagem. Cada lavagem consome 3L de água e 1L de shampoo
    public void cleanMachine() {
        if (!isMachineClean()) {
            if (petInMachine!=null) {
                System.out.println("A máquina não pode ser limpa. Tem Pet na máquina!\n");
            } else if (waterLevel >= 3 && shampooLevel >= 1) {
                waterLevel -= 3;
                shampooLevel -= 1;
                machineClean = true;
                petLeftClean = true;
                System.out.println("A máquina foi limpa.\n");
            } else {
                System.out.println("Não foi possível limpar a máquina. Nível de água ou shampoo insuficiente.\n");
            }
        } else {
            System.out.println("A máquina já está limpa.\n");
        }
    }

    // Mostra o Status da máquina de lavagem
    public void machineStatus() {
        System.out.printf("Status da máquina:\n");
        System.out.printf("- Limpa: %b\n", machineClean);
        System.out.printf("- Água: %.2fL\n", waterLevel);
        System.out.printf("- Shampoo: %.2fL\n", shampooLevel);
        System.out.printf("- Pet na máquina: %s\n", petInMachine == null ? "Nenhum" : petInMachine.getPetName());
    }
}
