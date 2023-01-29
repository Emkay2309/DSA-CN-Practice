package JAVA.Arrays;

public class Triplets {
    public static void main(String[] args) {
        int A [] = {-1,0,1,2,-1,-4};
        int n = A.length;

        int count = 0;
        for(int i=0; i<n-2 ; i++) {
            for(int j=i+1 ; j<n-1 ; j++) {
                for(int k = j+1 ; k<n ; k++) {
                    if(A[i]+A[j]+A[k]==0) {
                        count++;
                    }
                }
            }
        }
        
        int index = 0;
        int [] [] completeAns = new int [count] [];
        for(int i=0; i<n-2 ; i++) {
            for(int j=i+1 ; j<n-1 ; j++) {
                int ans [] = new int [3]; 
                //index = 0;
                for(int k = j+1 ; k<n ; k++) {
                    if(A[i]+A[j]+A[k]==0) {
                        ans[0] = A[i];
                        ans[1] = A[j];
                        ans[2] = A[k];
                        completeAns[index] = ans;
                        index++;
                    }
                }
                
            }
            
        }

        //print

        for (int i = 0; i < completeAns.length; i++) {
            for (int j = 0; j < completeAns[0].length; j++) {
                if(j==2) {
                    System.out.print(completeAns[i][j]+"]");
                }
                else {
                    System.out.print(completeAns[i][j]+",");
                }
            }
            System.out.println();
        }
    }
}