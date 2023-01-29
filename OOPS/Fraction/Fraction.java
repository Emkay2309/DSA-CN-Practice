package JAVA.OOPS.Fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        simplify();
    }

    public void print(){
        if(denominator == 0){
            System.out.println(numerator);
        }else {
            System.out.println(numerator + "/"+ denominator);
        }
    }

    public void simplify(){
        int gcd = 1;
        int min = Math.min(this.numerator,this.denominator);
        for(int i=2;i<=min;i++){
            if(this.numerator%i==0 && this.denominator%i==0){
                gcd=i;
            }
        }

        this.numerator = this.numerator/gcd;
        this.denominator = this.denominator/gcd;
    }


    public void add (Fraction f2){
        this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public void multiply(Fraction f2){
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
    }

    public static Fraction add (Fraction f1, Fraction f2){
        int num = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int denom = f1.denominator * f2.denominator;
        return new Fraction(num,denom);
    }

}
