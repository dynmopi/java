package one.screenmatch.calculos;

import one.screenmatch.modelo.Titulo;

public class Calculadora {
    private int tempoTotal;

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoDeMinutos();
    }

    public int getTempoTotal(){
        return tempoTotal;
    }
}
