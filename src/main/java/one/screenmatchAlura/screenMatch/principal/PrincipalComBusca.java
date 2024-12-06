package one.screenmatchAlura.screenMatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import one.screenmatchAlura.screenMatch.excecoes.ErroDeConversaoDeAnoException;
import one.screenmatchAlura.screenMatch.modelos.Titulo;
import one.screenmatchAlura.screenMatch.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();
        try {
            String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=e3f4c7fd";

            // requisicao do server para o java local.
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            // response é o resultado do envio de request
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create(); // isso daqui é para manter as boas práticas de nomear variaveis;

//        Titulo titulo = gson.fromJson(json, Titulo.class);
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(json + "\n");
            escrita.close();

        } catch (NumberFormatException e){
            System.out.println("Erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Erro de formatação na busca");
            System.out.println(e.getMessage());
        } catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMensagem());
        }


        System.out.println("Finalizado");

    }
}