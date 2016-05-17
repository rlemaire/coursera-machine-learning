/**
 *
 */
public class Product {
    public static void main(String[] args) {
        double nbFalseNegatives = 40;
        double nbFalsePositives = 1900;
        double nbTruePositives = 5600;
        double nbTrueNegatives = 2460;
        double precision = nbTruePositives / (nbTruePositives + nbFalsePositives);
        double recall = nbTruePositives / (nbTruePositives + nbFalseNegatives);
        double erreur = (nbFalseNegatives + nbFalsePositives) / (nbTruePositives + nbTrueNegatives +  nbFalseNegatives + nbFalsePositives);
        System.out.println("Précision : " + precision);
        System.out.println("Recall : " + recall);
        System.out.println("Erreur : " + erreur);
        System.out.println("Nb non pos : " + (nbTrueNegatives + nbFalseNegatives + nbTrueNegatives));
        System.out.println("Lowest score : " + 1 / (1 + Math.exp(-0.9)));
    }
}
