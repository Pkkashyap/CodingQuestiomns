package Year_2023.July_07.recursion;

public class print1ToN {
    public static void print(int n,int k){
        if(n==0){
            return;
        }
        System.out.print(k+" ");

        print(n-1,k+1);
    }
    public static void printReverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");

        printReverse(n-1);
    }

    public static void main(String[] args) {
        print(5,1);
        printReverse(5);
    }
}
