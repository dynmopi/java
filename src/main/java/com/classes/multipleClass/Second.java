package com.classes.multipleClass;
// 2
class Second {

    public static void main(String[] args){
        Main objeto = new Main();
        System.out.println(objeto.x);

        // System.out.println(objeto.texto); não tem como acessar, pois
        // o modifier é private.
    }
}
