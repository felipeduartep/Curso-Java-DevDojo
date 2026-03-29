package curso.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula01OlaDevDojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que quer verificar: ");
        int numero = sc.nextInt();

        if (numero %2 == 0)
            System.out.println("PAR!");
        else
            System.out.println("IMPAR!");
// apenas um comentario para testar o git
        sc.close();
    }
}