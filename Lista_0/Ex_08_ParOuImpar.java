package Lista_0;

//Escreva uma classe que verifica se um dado número inteiro é par ou ímpar

public class Ex_08_ParOuImpar {
    int numero;
    boolean isPar;


    public Ex_08_ParOuImpar(int numero){
        this.numero = numero;
        isPar =  ePar(numero);
    }

    public boolean ePar(int numero) {
        return numero % 2 == 0;
    }


    @Override
    public String toString(){
        if(isPar){
            return "Número " + numero + ": é par.";
        }

        return "Número " + numero + ": é ímpar.";
    }
}
