package Practice;

public class CountDigits {
    public static void main(String[] args) {
        int i =156;
        int count = 0;

    // while(i>0){
    //     //int rem = i%10;
    //     count++;
    //     i=i/10;
    // }

    System.out.println(count(1526));
    }

    public static int count(int i){

        if(i==0){
            return 0;
        }

        return count(i/10)+1;
    }



}
