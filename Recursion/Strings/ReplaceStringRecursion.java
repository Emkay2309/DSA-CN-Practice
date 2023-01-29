package JAVA.Recursion.Strings;

public class ReplaceStringRecursion {

    public static void main(String[] args) {
        System.out.println(replace("xpix"));
    }

    public static String replace(String input){

        return helper(input,"",0);

    }

    private static String helper(String input, String s, int i) {


        if(input.length()==i){
            return s;
        }

        String temp = input.substring(i);


        if(temp.startsWith("pi")){
            s=s+"3.14";
            i=i+1;
        }else{
            s=s+input.charAt(i);
        }

        return helper(input,s,i+1);
    }
}
