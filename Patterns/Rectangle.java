package Patterns;

public class Rectangle {
    public static void main(String[] args) {
        int n =4;
        int i =1;
        while(i<=n){
            int j =1;
            while(j<=n+1){
                if(j==1 || i==1|| i==n || j==n+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            i++;
            System.out.println();
            
        }
    }
}
