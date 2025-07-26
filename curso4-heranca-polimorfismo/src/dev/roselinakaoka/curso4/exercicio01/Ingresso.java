package dev.roselinakaoka.curso4.exercicio01;

/*
* Enumeração que define os formatos de áudio possíveis para um ingresso:
* LEGENDADO ou DUBLADO.
*/

enum FormatoAudio {
    LEGENDADO,
    DUBLADO
}

/*
* Classe que representa um ingresso de cinema genérico.
* Contém informações sobre o preço, título do filme e formato de áudio.
* Possui metodo para calcular o preço do ingresso e para emitir os detalhes do ingresso.
*/

public class Ingresso {

    protected double preco;
    protected String titulo;
    protected FormatoAudio formatoAudio;

    public Ingresso(double preco, String titulo, FormatoAudio formatoAudio) {
        this.preco = preco;
        this.titulo = titulo;
        this.formatoAudio = formatoAudio;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public FormatoAudio getFormatoAudio() {
        return formatoAudio;
    }

    public double CalculaPreco() {
        return getPreco();
    }

    public void EmiteIngresso(){
        System.out.printf("Filme             : %s\n", this.getTitulo() );
        System.out.printf("Formato de Audio  : %s\n", this.getFormatoAudio() );
        System.out.printf("Valor Total       : R$ %.2f\n", CalculaPreco() );

    }
}
