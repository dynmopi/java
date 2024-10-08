package one.screenmatch;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoDeMinutos;

    double getsomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoDeMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double adquireMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
