package com.classes;
// 3

// veja com calma, confesso que o código está bem poluído.
public class ClassAtributtes {
    // os atributos de classe são variáveis dentro de uma classe
    int x;
    final int y = 5; // lembrando que o final atribui uma variável como constante.
    public static void main(String[] args){
        ClassAtributtes meuObj = new ClassAtributtes(); // criando o obj.
        ClassAtributtes meuObj2 = new ClassAtributtes(); // criando segundo objeto
        meuObj.x = 3; // o x é um atributo
        meuObj2.x = 4; // reatribuindo outro valor para um objeto diferente com o mesmo atributo "x";

//        meuObj.y = 10;
        // repare que foi alterado o value do atributo x
        // antes, o value era zero, agora é 3.
        System.out.println(meuObj.x); // meuObj é um objeto criado através do new
        // pelo o fato que houve a criação do segundo objeto com um nome diferente, eu posso utilizar do mesmo atributo, desde que seja reatribuido novamente.
        System.out.println(meuObj2.x); // veja linha 13.

        System.out.println(meuObj.y);
    }
}
