import java.util.Arrays;
import java.util.Random;

/**
 *
 */
public class MatrixProduct {

    private static int[][] product(int[][] a, int[][] b) {
        int nbMultipli = 0;
        // Multiplication des lignes par les colonnes
        int[][] result = new int[a.length][b[0].length];
        for (int i =  0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {

                int resultIJ = 0;
                for (int k = 0; k < b.length; k++) {
                    resultIJ += a[i][k] * b[k][j];
                    nbMultipli++;
                }
                result[i][j] = resultIJ;

            }
        }
        System.out.println("Nombre de multiplications : " + nbMultipli);
        return result;
    }

    private static int[][] generateRandom(int nbLignes, int nbColonnes) {
        int[][] result = new int[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                result[i][j] = new Random().nextInt();
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = generateRandom(50, 10);
        int[][] b = generateRandom(10, 50);
        int[][] result= product(a, b);
        Arrays.stream(result).forEach(ligne -> {
            System.out.println(Arrays.toString(ligne));
        });
    }
}
