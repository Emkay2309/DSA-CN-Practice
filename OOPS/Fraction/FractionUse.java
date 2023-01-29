package JAVA.OOPS.Fraction;

public class FractionUse {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,4);
        Fraction f2 = new Fraction(5,3);
       // f1.add(f2);
        //f1.print();

        Fraction f4 = Fraction.add(f1,f2);
        f4.print();

    }
}
