package curso.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2, 4, 8, 16};
        arrayInt[1] = new int[]{3, 6, 9, 12};
        arrayInt[2] = new int[]{1, 1};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        int[][] arrayInt2 = {{1, 2, 4, 8, 16}, {3, 6, 9, 12}, {1, 1}};

        for (int[] base : arrayInt2) {
            System.out.println("\n");
            for (int num : base) {
                System.out.print(num + " ");
            }
        }
    }
}
