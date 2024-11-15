package one.oop.carro;

public class CarroTeste {
    public static void main(String[] args){
//        Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
        Carro qualquerCarro = new Carro();
        qualquerCarro.definirModelo("Sedan");
        qualquerCarro.definirPrecos(20000, 10000, 40000);


//        System.out.println(qualquerCarro.getModelo());

    }
}
