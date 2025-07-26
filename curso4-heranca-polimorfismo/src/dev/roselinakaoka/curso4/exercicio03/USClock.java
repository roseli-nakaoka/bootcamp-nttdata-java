package dev.roselinakaoka.curso4.exercicio03;

/*
 * Classe USClock
 *
 * Representa um relógio no formato americano de 12 horas com período (AM/PM).
 * Herda de Clock e redefine a lógica de validação da hora (1 a 12).
 * Também fornece conversão de um relógio em formato 24h (BRClock) para o formato 12h (USClock).
 *
 * Autor: Roseli Nakaoka
 * Data: 26/07/2025
 */

public non-sealed class USClock extends Clock {

    private Periodo periodo;


 /* Construtor do relógio americano (12h).*/

    public USClock(int hour, int minute, int second, Periodo periodo) {
        super(hour, minute, second);

        //Validação de hora e periodo (propriedades que são diferentes da superclasse Clock)

        if (!isValidHour(hour)) {
            throw new IllegalArgumentException("Hora inválida. A hora deve estar entre 0 e 23.\n");
        }
        if (!isValidTime(minute)) {
            throw new IllegalArgumentException("Minuto inválido. O minuto deve estar entre 0 e 59.\n");
        }
        if (!isValidTime(second)) {
            throw new IllegalArgumentException("Segundo inválido. O segundo deve estar entre 0 e 59.\n");
        }

        if (periodo == null) {
            throw new IllegalArgumentException("Periodo Inválido. Período (AM ou PM) não pode ser nulo\"");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.periodo = periodo;
    }

    //Get Periodo
    public Periodo getPeriodo() {
        return periodo;
    }

    //Set Periodo
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    /*
    * Redefine a validação de hora para o intervalo 1 a 12 (formato 12h).
    */

    @Override
    public boolean isValidHour (int hour) {
        return (hour >= 1 && hour <= 12);
    }

/*
 * Converte um Clock no formato brasileiro (24h) para USClock (12h com AM/PM).
 * Se o relógio de entrada não for BRClock, a lógica ainda funciona com base na hora.
 */

 @Override
    public Clock convertClock(Clock clock) {

        Periodo periodo = Periodo.AM;
        int convertedHour = 0;

        if(clock.hour > 12) {
            convertedHour = (clock.hour - 12);
            periodo = Periodo.PM;
        } else if (clock.hour < 12) {
            if (clock.hour ==  0)
                convertedHour = clock.hour + 12;
            else
                convertedHour = clock.hour;
             periodo = Periodo.AM;
        } else {
            convertedHour = clock.hour;
            periodo = Periodo.PM;
        }

        Clock convertedClock = new USClock(convertedHour,clock.minute, clock.second,periodo);
        return convertedClock;
    }

    /*
    * Retorna a string formatada no padrão HH:mm:ss AM/PM.
    */

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d %s", hour, minute, second, periodo);
    }
}
