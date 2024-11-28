package one.oop.primo;

public class GeradorPrimo extends VerificarPrimalidade {
    public void geradorPrimo(int numero){
        int numeroSucessor = numero + 1;
        while(!verificarPrimo(numeroSucessor)){
            numeroSucessor++;
        }

        System.out.println("O próximo número primo é: " + numeroSucessor);
    }
}
