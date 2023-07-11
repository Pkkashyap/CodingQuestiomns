package Year_2023.July_07.recursion;

public class checkPalindrome {
    public static boolean isPalindrome(String s){
        if(s.length()<=1){
            return true;
        }

        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }

        return isPalindrome(s.substring(1,s.length()-1));

    }
    public static void main(String[] args) {
        System.out.print(isPalindrome("abcevcba"));
    }
}
