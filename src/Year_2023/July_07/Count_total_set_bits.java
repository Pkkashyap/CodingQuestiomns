package Year_2023.July_07;

public class Count_total_set_bits {

    public static int countSetBits(int n){
        int power = 2;
        n=n+1;
        int ans = n/power;
        while (n>=power){
            int bits = n/power;
            int countBits = bits/2;
            int totalBinarySet = countBits*power;
            ans+=totalBinarySet;
            ans += (bits%2)!=0?n%power:0;
            power=power<<1;
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.print(countSetBits(17));
    }

}
