package curso.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idadeAluno = 30;
        String categoria;

        if (idadeAluno < 15) {
            categoria = "Aluno na categoria infantil!";
        } else if (idadeAluno >= 15 && idadeAluno < 18) {
            categoria = "Aluno na categoria juvenil!";
        } else {
            categoria = "Aluno na categoria adulta!";
        }
        System.out.println(categoria);
    }
}
