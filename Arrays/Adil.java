package Arrays;

public class Adil {

    public static void main(String[] args) {
        String s = "helloo";

        String ans ="";
        int i=0;
        for( ; i<s.length()-1 ; i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch==ch2) {
                ans += ch2;
                ans += '*';
                
            }
            else {
                ans += ch;
            }
        }
        System.out.println(ans+s.charAt(i));
    }
    
}
//hel*lo*o