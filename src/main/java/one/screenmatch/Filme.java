package one.screenmatch;

public class Filme {
    // Organizando o código
    // Variaveis com os modifiers
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoDeMinutos;
    //

    // Operacao do sistema
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
    //

    // metodos getSetters (seguranca)
    public void setNome(String nome) {
        this.nome = nome; // o nome foi incluido atraves do setter
    }



    String getNome() {
        return nome; // o nome pode ser imprimido também
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento; // agora posso mostrar o ano de lancamento pelo get.
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setDuracaoDeMinutos(int duracaoDeMinutos) {
        this.duracaoDeMinutos = duracaoDeMinutos;
    }

    public int getDuracaoDeMinutos() {
        return duracaoDeMinutos;
    }


    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
