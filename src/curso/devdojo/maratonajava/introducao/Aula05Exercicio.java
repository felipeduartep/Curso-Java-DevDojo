package curso.devdojo.maratonajava.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        double salario = 35000;
        double tax;

        if (salario <= 34712) {
            tax = 9.70;
        }else if (salario >= 34713 && salario <= 68508) {
            tax = 37.35;
        }else {
            tax = 49.50;
        }
        double menosTax = (salario / 100) * tax;
        double salarioFinal = salario - menosTax;

        System.out.println("Valor do salario: " + salario);
        System.out.println("Valor da taxa a ser descontada: " + menosTax);
        System.out.println("O salario final com o desconto das taxas é: " + salarioFinal);
    }
}
