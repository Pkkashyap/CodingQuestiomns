package Year_2023.July_07.recursiion;

public class factorial {
    public static int fact(int n,int k){
        if(n<=1){
            return k;
        }

        return fact(n-1,k*n);
    }

    public static void main(String[] args) {
        System.out.print(fact(5,1));
    }
}
