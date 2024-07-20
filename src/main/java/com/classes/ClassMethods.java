package com.classes;
// 4
public class ClassMethods {
//    int x = 4;
    static void metodoStatic(){
        System.out.println("métodos static, podem ser chamados sem" +
                " a criação de objetos");
    }
    public void metodoPublic(){
        System.out.println("métodos public, DEVEM ser chamados criando objetos.");
    }

    public static void main(String[] args){
        metodoStatic();
//      metodoPublic(); compilaria um erro, já que não foi criado o objeto e é public

        ClassMethods objeto = new ClassMethods();
        objeto.metodoPublic(); // dessa vez compilou.
//        objeto.metodoStatic(); redudante, não necessariamente precisa
//        ser chamado atraves de objects, pois é um metodo public
    }


    // o método static, consegue ser acessado sem a criação de objetos
    // enquanto que o public, só pode ser acessado por objetos.
}
