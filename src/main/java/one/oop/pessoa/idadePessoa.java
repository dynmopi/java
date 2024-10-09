package one.oop.pessoa;

public class idadePessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
        if (idade < 18){
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }
    }

}
