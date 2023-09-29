package Year_2023.July_07.recursion;

public class toh {
    public static void solve(int n,char a, char b, char c){
        if(n==1){
            System.out.println("Move 1 from "+ a + " to " + c);
            return;
        }

        solve(n-1,a,c,b);
        System.out.println("Move "+n+" from "+a+" to "+ c);
        solve(n-1,b,a,c);
    }

    public static void main(String[] args) {
        solve(4,'A','B','C');
    }
}
