package one.oop.primo;

public class VerificarPrimalidade {
    public boolean verificarPrimo(int numero){


        if (numero <= 1){
            return false;
        }
        for (int i = 2; i*i <= numero; i++){

            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
