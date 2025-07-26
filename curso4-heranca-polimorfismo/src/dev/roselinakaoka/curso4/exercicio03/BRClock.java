package dev.roselinakaoka.curso4.exercicio03;

/*
 * Classe BRClock
 *
 * Representa um relógio no formato brasileiro de 24 horas (00h às 23h).
 * Estende a classe abstrata Clock e implementa a lógica de conversão de
 * relógios no formato americano (12 horas com AM/PM) para o formato 24h.
 *
 * É declarada como non-sealed, permitindo extensão futura caso desejado.
 *
 * Autor: Roseli Nakaoka
 * Data: 26/07/2025
 */

public non-sealed class BRClock extends Clock {

/* Construtor do relógio em formato brasileiro (24h).*/

    public BRClock(int hour, int minute, int second){
        super(hour, minute, second);
    }


/*
 * Converte um relógio no formato americano (12h com AM/PM) para formato brasileiro (24h).
 * Se o relógio de entrada não for um USClock, mantém o horário original.
 */

 @Override
    public Clock convertClock(Clock clock) {

        int hour = clock.hour;
        if (clock instanceof USClock usclock) {
            if ((usclock.getPeriodo() == Periodo.PM) && (usclock.getHour()<12)) {
                hour = usclock.getHour() + 12;
            } else if ((usclock.getPeriodo() == Periodo.AM) && (usclock.getHour()==12)){
                hour = usclock.getHour() - 12;
            }
        }
        return new BRClock(hour, clock.getMinute(), clock.getSecond());

    }

}
