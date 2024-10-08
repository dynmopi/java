package one.screenmatch;

public class Principal {
    public static void main(String[] args) {
        Filme umFilme = new Filme();

        // Primeiro Filme
        umFilme.nome = "poderoso chefão";
        umFilme.anoDeLancamento = 2010;
        umFilme.duracaoDeMinutos = 180;
        umFilme.incluidoNoPlano = true;
        //

        umFilme.exibeFichaTecnica();
        umFilme.avalia(2);
        umFilme.avalia(8);

        System.out.println("A média do filme é de: " + umFilme.adquireMedia());
        System.out.println("O total de avaliações é de: " + umFilme.getTotalDeAvaliacoes());


    }
}
