package JAVA.OOPS.Polynomial;

public class PolinomialUse {
    public static void main(String[] args) {
        Polinomial p1 = new Polinomial();
        p1.setCoefficients(3,1);
        p1.setCoefficients(2,2);

        Polinomial p2 = new Polinomial();
        p2.setCoefficients(3,1);
        p2.setCoefficients(2,2);


        p1.multiply(p2);

        p2.print();
    }
}
