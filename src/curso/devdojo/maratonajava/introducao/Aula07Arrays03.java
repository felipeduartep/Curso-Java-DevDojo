package curso.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 4, 5};

        for (int i = 0; i < numeros.length; i++) {
           System.out.println(numeros[i]);
        }

        System.out.println();

        for (int num : numeros) {
            System.out.println(num);
        }

    }
}
