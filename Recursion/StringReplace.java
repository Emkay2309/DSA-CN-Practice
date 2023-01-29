package Recursion;

/**
 * StringReplace with *
 */
public class StringReplace {

    public static void main(String[] args) {
        System.out.println(addStars("hello"));
    }

    public static String addStars(String s) {
        return helper(s,0,"");
	}

    private static String helper(String s, int i, String ans) {

        char ch = s.charAt(i);

        if (s.length()-1==i) {
            return ans+s.charAt(i);
        }

        if(s.charAt(i+1)==ch){
            ans+=ch;
            ans+="*";
        }else{
            ans+=ch;
        }

        return helper(s,i+1,ans);
    }
}

//he*l