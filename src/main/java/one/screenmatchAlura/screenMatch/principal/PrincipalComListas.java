package one.screenmatchAlura.screenMatch.principal;

import one.screenmatchAlura.screenMatch.modelos.Filme;
import one.screenmatchAlura.screenMatch.modelos.Serie;
import one.screenmatchAlura.screenMatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 200);
        filmeDoPaulo.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>(); // var listaDeFilmes = new Array...
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){ // foreach - para cada
            System.out.println("Nome: " + item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista); // ordenando em ordem alfabética

        Collections.sort(lista);

        System.out.println(lista);
    }
}
