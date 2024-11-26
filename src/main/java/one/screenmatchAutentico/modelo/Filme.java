package one.screenmatch.modelo;

import one.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel  {
    private String diretor;

    public String getDiretor(){
        return this.diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

   public int getClassificacao(){
      return (int) adquireMedia() / 2;
   }
}
