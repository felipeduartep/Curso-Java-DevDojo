package curso.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 4000;
        String mensagemDoar = "Vou doar 500 para o DevDojo!";
        String mensagemNaoDoar = "Ainda não tenho condições de doar";


        //(condição) ? verdadeiro : falso
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
