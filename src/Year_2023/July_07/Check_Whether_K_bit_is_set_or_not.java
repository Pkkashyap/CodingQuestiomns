package Year_2023.July_07;

public class Check_Whether_K_bit_is_set_or_not {
    public static boolean checkKthBit(int n, int k){
        return (n&(1<<k))!=0;
    }

    public static void main(String[] args) {
       System.out.println(checkKthBit(5,2));
    }
}
