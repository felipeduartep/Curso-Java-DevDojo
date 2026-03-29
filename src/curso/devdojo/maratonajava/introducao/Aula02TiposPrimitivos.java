package curso.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = 10; //numeros inteiros
        long idadeGrande = 100000; //numeros inteiros
        float salarioFloat = 2000.0F; //numeros com virgulas
        double salarioDouble = 200000; //numeros com virgulas
        byte idadeByte = 127;
        short idadeShort = 90;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        String nome = "Goku";

        System.out.println (idade);
        System.out.println (idadeGrande);
        System.out.println (salarioFloat);
        System.out.println (salarioDouble);
        System.out.println (idadeByte);
        System.out.println (idadeShort);
        System.out.println (verdadeiro);
        System.out.println (falso);
        System.out.println (caractere);
        System.out.println("oi meu nome e " + nome);
    }
}
