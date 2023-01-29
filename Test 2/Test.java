/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        String a = "abc de ghihjk a uvw h j";
        String[] b = a.split(" ");
        int min = Integer.MAX_VALUE;
        
        int min_index= 0;
        
        for (int i = 0; i < b.length; i++) {
            if(b[i].length()<min){
                min=b[i].length();
                min_index=i;
            }
        }
        System.out.println(b[min_index]);
    }
}