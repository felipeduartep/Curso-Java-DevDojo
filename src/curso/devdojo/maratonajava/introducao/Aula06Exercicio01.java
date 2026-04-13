package curso.devdojo.maratonajava.introducao;

public class Aula06Exercicio01 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 ate 1000000

        for (int par = 0; par <= 100; par++){
            if (par % 2 == 0){
                System.out.println("Numero: " + par);
            }
        }
    }
}
