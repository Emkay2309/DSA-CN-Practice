package JAVA.Recursion.Strings;

public class ReplacePI {

    public static void main(String[] args) {
        String s = "xpixpix";

        String n="";

        for(int i=0;i<s.length();i++){
            String temp = s.substring(i);

            if(temp.startsWith("pi")){
                n+="3.14";
                i=i+1;
            }else{
                n+=s.charAt(i);
            }
        }

        System.out.println(n);
    }
}
