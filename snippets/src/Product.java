/**
 *
 */
public class Product {
    public static void main(String[] args) {
        double calcul =
                (1.0 / (1 + Math.exp(-2.5))) *
                (1 - (1.0 / (1 + Math.exp(-0.3)))) *
                (1.0 / (1 + Math.exp(-2.8))) *
                (1.0 / (1 + Math.exp(-0.5)));
        System.out.println(calcul);
        double derivee =
                (2.5 ) * (1 - (1.0 / (1 + Math.exp(-2.5)))) +
                (0.3 ) * (1 - (1 - (1.0 / (1 + Math.exp(-0.3))))) +
                (2.8 ) * (1 - (1.0 / (1 + Math.exp(-2.8)))) +
                (0.5 ) * (1 - (1.0 / (1 + Math.exp(-0.5)))) ;
        System.out.println(derivee);
    }
}
