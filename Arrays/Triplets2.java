package Arrays;

public class Triplets2 {
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
            int j=i+1;
            int k = n-1;
            int [] ans= new int[3];
            while(j<k) {
                if(A[i]+A[j]+A[k]==0) {
                    ans[0] = A[i];
                    ans[1] = A[j];
                    ans[2] = A[k];
                    completeAns[index] = ans;
                    index++;
                }
                j++;
                k--;
            }
            
        }

        //print

        for (int a = 0; a < completeAns.length; a++) {
            for (int b = 0; b < completeAns[0].length; b++) {
                System.out.print(completeAns[a][b]+" ");
            }
            System.out.println();
        }
    }
}