package Year_2023.July_07;

public class Find_first_set_bit {
    public static int getFirstSetBit(int n) {
        if(n==0)
            return 0;
        int index = 1;
        while (n>0){
            if((n&1)!=0){
                return index;
            }
            index++;
            n=n>>1;
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.print(getFirstSetBit(16));
    }

}
