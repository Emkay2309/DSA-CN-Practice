package JAVA.Recursion;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumDig(234));
    }

    private static int sumDig(int i) {
        if(i==0){
            return 0;
        }
        return (i%10) + sumDig(i/10);
    }
}
