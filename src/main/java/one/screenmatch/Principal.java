package one.screenmatch;

public class Principal {
    public static void main(String[] args) {
        Filme umFilme = new Filme();

        // Primeiro Filme
        umFilme.setNome("Poderoso chefão"); // note, enviou o nome de forma segura
        umFilme.setAnoDeLancamento(2010);
        umFilme.setDuracaoDeMinutos(180);
        umFilme.setIncluidoNoPlano(true);
        //

        umFilme.exibeFichaTecnica();
        umFilme.avalia(2);
        umFilme.avalia(8);

        System.out.println("O nome do filme é: " + umFilme.getNome()); // o nome é imprimido
        System.out.println("A média do filme é de: " + umFilme.adquireMedia());
        System.out.println("O total de avaliações é de: " + umFilme.getTotalDeAvaliacoes());


    }
}

