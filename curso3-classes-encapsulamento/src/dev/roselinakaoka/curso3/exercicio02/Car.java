package dev.roselinakaoka.curso3.exercicio02;

/**
 * Car.java
 *
 * Esta classe modela um carro simples com controle de estado (ligado/desligado),
 * velocidade e marcha. Ela encapsula regras de operação que simulam comportamentos
 * realistas de um veículo, como aceleração, desaceleração, curvas, troca de marchas
 * e desligamento seguro. As operações são condicionadas a regras de segurança, como
 * só permitir curvas dentro de uma faixa de velocidade ou não permitir acelerar em
 * ponto morto.
 *
 * Funcionalidades principais:
 * - Ligar/desligar o carro (com validações)
 * - Acelerar/desacelerar dentro das regras de marcha
 * - Virar o carro com restrição de velocidade
 * - Exibir a velocidade atual e marcha
 * - Verificar se a velocidade está compatível com a marcha atual
 * - Impedir operações se o carro estiver desligado
 *
 * Uso em conjunto com a classe CarApp para interação via terminal.
 *
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Java e a Arte da Abstração com Classes e Encapsulamento
 * Exercício 02 : Simulação de um carro
 * Autor: Roseli Nakaoka
 * Data: 22/07/2025
 */

public class Car {
    private final String name;
    private boolean carOn;
    private int speed;
    private int gear;

    // Construtor
    public Car(String name) {
        this.name = name;
        this.carOn = false;
        this.speed = 0;
        this.gear = 0;
    }

    //Get e Set das propriedades
    public boolean isCarOn() {
        return carOn;
    }

    public void setCarOn(boolean carOn) {
        this.carOn = carOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    // Métodos para o Controle do Carro

    // Ligar o carro
    public void turnOnCar() {

        if(isCarOn()) {
            System.out.println("O carro já está ligado.");

        } else {
            setCarOn(true);
            setGear(0);
            setSpeed(0);
            System.out.println("O carro foi ligado.");
        }
    }


    //Desligar o carro
    public void turnOffCar() {

        if(isCarOn()) {

            if (this.speed == 0 && this.gear == 0){
                this.setCarOn(false);
                System.out.println("O carro foi desligado.");
            } else {
                System.out.println("O carro não pode ser desligado. Está em movimento.\n");
                System.out.printf("Velocidade: %d Marcha: %d\n", this.speed, this.gear);
            }

        } else {
            System.out.println("O carro já está desligado.");
        }

    }

    //Acelerar o carro, se estiver ligado e com velocidade inferior ao máxomo de 120 km/h
    public void accelerateCar() {

        if (!verifyCarOn()) return;

        if(this.speed < 120) {
            int speed = this.speed + 1;
            if(isSpeedPermitted(this.gear, speed)) {
                this.speed = speed;
                System.out.printf("O carro acelerou para %d km/h.\n", this.speed);
            } else
                System.out.printf("Velocidade incompatível com a marcha atual = %d.\nPor favor, troque de marcha.\n", this.gear);
        } else {
            System.out.printf("O carro não pode ser acelerado." +
                    " Está na velocidade máxima de %d km/h.\n", this.speed);
        }

    }

    //Desacelerar o carro, se estiver ligado e com velocidade superior 0 km/h

    public void deccelerateCar() {

        if (!verifyCarOn()) return;

        if(this.speed > 0) {
            int speed = this.speed - 1;
            if(isSpeedPermitted(this.gear, speed)) {
                this.speed = speed;
                System.out.printf("O carro desacelerou para %d km/h.\n", this.speed);
            } else
                System.out.printf("Velocidade incompatível com a marcha atual = %d.\n Por favor, troque de marcha.\n", this.gear);
        } else {
            System.out.println("O carro não pode ser desacelerado. Ele está parado.\n");
        }

    }

    // Virar o carro, para esquerda/direita. O carro só pode virar para esquerda/direita
    // se sua velocidade for de no mínimo 1km/h e no máximo 40km/h;

    public void turnCar() {

        if (!verifyCarOn()) return;

        if(this.speed<1) {
            System.out.println("Não é possível fazer a curva. Velocidade inferior a 1km/h.\n");
        }else if(this.speed>40) {
            System.out.println("Não é possível fazer a curva. Velocidade superior a 40km/h.\n");
        }else{
            System.out.println("Curva efetuada com sucesso.\n");
        }

    }

    // Verificar a velocidade

    public void verifySpeed(){
        System.out.printf("Velocidade Atual: %d km/h\n", this.speed);
        System.out.printf("Marcha Atual: %d \n", this.gear);
    }

    //-----------------------------------------------------------------------
    // Metodos utilitários
    //-----------------------------------------------------------------------

    // Verifica a marcha de acordo com a lógica de cotrole de velocidade
    public boolean isSpeedPermitted(int gear, int speed) {

        switch (gear) {
            case 0:
                return speed == 0;  // ponto morto, não pode acelerar
            case 1:
                return speed > 0 && speed <= 20;
            case 2:
                return speed > 20 && speed <= 40;
            case 3:
                return speed > 40 && speed <= 60;
            case 4:
                return speed > 60 && speed <= 80;
            case 5:
                return speed > 80 && speed <= 100;
            case 6:
                return speed > 100 && speed <= 120;
            default:
                return false; // marcha inválida
        }
    }

    // Verifica se carro está desligado e emite mensagem.

    public boolean verifyCarOn() {

        if (!isCarOn()) {
            System.out.println("Operação Inválida! O carro está desligado.\n");
            return false;
        }
        return true;
    }
}
