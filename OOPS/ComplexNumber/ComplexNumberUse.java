package JAVA.OOPS.ComplexNumber;

public class ComplexNumberUse {

    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(2,3);
        ComplexNumber n2 = new ComplexNumber(2,3);
        ComplexNumber n3 = ComplexNumber.add(n1,n2);
        ComplexNumber n4 = n1.conjugate();
        n4.print();
    }
}
