package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n=4;
        int i = 1;
        while(i<=n){
            int j=n;
            while(j>i){
                System.out.print(" ");
                j--;
            }
            j=1;
            while(j<=2*i-1){
                if(j==1 ||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                j++;
            }

            i++;
            System.out.println();
        }

        i=n-1;

        while(i>=1){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }

            j=1;
            while(j<=2*i-1){

                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }  
                
                j++;
            }

            i--;
            System.out.println();
        }

    }
}
