package curso.devdojo.maratonajava.introducao;

public class Aula06Exercicio02 {
    public static void main(String[] args) {
        double valorCarro = 30000;

        //break
        /*
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + ":" + "R$" + valorParcela);
        }
        */

        //continue
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + ":" + "R$" + valorParcela);
        }
    }
}
