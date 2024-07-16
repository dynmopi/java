package com.methods;
// 3

// quando o void é mencionado, estamos dizendo que o método
// não irá retornar o valor true. Se caso o void não é iterado
// então teremos o return dentro do método e o a tipagem do método
public class Return_methods {
    static int soma(int x){
        return x + 10;
    }

    public static void main(String[] args){
        System.out.println(soma(5));
    }
}
