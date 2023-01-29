package JAVA.Recursion;

public class Prod2Nums {
    public static void main(String[] args) {
        int x = 12;
        int y = 3;

        System.out.println(Prod(x,y));
    }

    private static int Prod(int x, int y) {
        if(y==1){
            return x;
        }
        return x + Prod(x,y-1);
    }
}
