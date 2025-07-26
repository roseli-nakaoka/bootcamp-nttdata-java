package dev.roselinakaoka.curso4.exercicio03;
/*
 * Classe abstrata Clock (Relógio)
 *
 * Representa um modelo base de relógio com hora, minuto e segundo.
 * Serve como superclasse para diferentes implementações de relógio, como BRClock (formato 24h)
 * e USClock (formato 12h com AM/PM).
 *
 * Utiliza validação para garantir integridade dos dados.
 * Declarada como sealed, permitindo apenas BRClock e USClock como subclasses.
 *
 * Métodos principais:
 * - Validação de hora e tempo
 * - Conversão de relógios (metodo abstrato)
 * - Formatação para exibição (toString)
 *
 * Autor: Roseli Nakaoka
 * Data: 26/07/2025
 */

public abstract sealed class Clock permits USClock, BRClock {

    protected int hour;
    protected int minute;
    protected int second;

/*
 * Construtor com validação de hora, minuto e segundo.
 */
    protected Clock(int hour, int minute, int second) {

        if (!isValidHour(hour)) {
            throw new IllegalArgumentException("Hora inválida. A hora deve estar entre 0 e 23.");
        }
        if (!isValidTime(minute)) {
            throw new IllegalArgumentException("Minuto inválido. O minuto deve estar entre 0 e 59.");
        }
        if (!isValidTime(second)) {
            throw new IllegalArgumentException("Segundo inválido. O segundo deve estar entre 0 e 59.");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    /* Verifica se a hora está no intervalo válido (0 a 23).*/

    public boolean isValidHour (int hour){
        return (hour>=0 && hour<24);
    }

    /* Verifica se minutos ou segundos estão no intervalo válido (0 a 59). */
    public boolean isValidTime (int time) {
        return (time>=0 && time<60);
    }

    /* Geters */
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    /* Setters */
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    /* Metodo abstrato que define como um relógio deve ser convertido para outro formato. */

    public abstract Clock convertClock(Clock clock);

    /* Retorna uma string formatada no padrão HH:mm:ss. */
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
