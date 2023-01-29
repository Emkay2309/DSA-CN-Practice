package Practice;

public class Zero {

    public static void main(String[] args) {
        int arr[] = {1,0,2,0,2,2,0,1,0};

        sort012(arr, 9);


        
    }

    public static void sort012(int a[], int n)
    {
        // code here 
        
        int start = 0;
        int end = n-1;
        int zero = 0;
        
        
        while(start<=end){
            if(a[start]==2){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                end--;
            }
            
            if(a[start]==0){
                int temp = a[start];
                a[start] = a[zero];
                a[zero] = temp;
                zero++;
                start++;
            }

            else{
                start++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
