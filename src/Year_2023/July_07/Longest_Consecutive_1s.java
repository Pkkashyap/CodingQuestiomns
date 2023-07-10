package Year_2023.July_07;

public class Longest_Consecutive_1s {
    public static int maxConsecutiveOnes(int N) {
        int count=0;
        while (N!=0){
            N=N&(N>>1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.print(maxConsecutiveOnes(14));
    }
}
