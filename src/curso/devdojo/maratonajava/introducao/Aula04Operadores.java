package curso.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - * /
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 * numero2;

        System.out.println("Valor = " + resultado);

        // %
        int resto = 20 %2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteDeVinte);

<<<<<<< HEAD
        // += -= *= /= %=
        double bonus = 1500;
        bonus += 200;
        bonus -= 300;
        bonus += 100;
        bonus *= 2;
        bonus /= 3;
        System.out.println(bonus);

        //++ --
        int contador = 0;
        contador--;
        contador++;
        System.out.println(++contador);
=======
>>>>>>> 6dbd8322cbe0ab16ec57c4c9a6bd3158758e05d2

    }
}
