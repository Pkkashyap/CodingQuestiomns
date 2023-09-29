package Year_2023.July_07.recursion;

import java.util.HashMap;
import java.util.Map;

public class josephusProblem {

    public static int solve(int n, int kill){
        if(n==0){
            return 0;
        }

        return (solve(n-1,kill)+kill)%n;
    }
    public static void main(String[] args) {

        System.out.print(solve(4,2));
    }
}
