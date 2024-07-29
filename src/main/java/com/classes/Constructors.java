package com.classes;
// 5
// constructors são métodos especiais que são usadas para inicializar objetos

public class Constructors{
    int x;

// criando uma classe construtora para a class Constructors
public Constructors(int y){
    x = y;
}

public static void main(String[] args){
    Constructors objeto = new Constructors(8); // criando um objeto da classe Constructors
    System.out.println(objeto.x);
}
}



