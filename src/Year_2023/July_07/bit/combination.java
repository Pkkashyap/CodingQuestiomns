package Year_2023.July_07.bit;

public class combination {
    public static void print(String s){
        int n = s.length();
        int power = 1<<n;
        for (int i=0;i<power;i++){
            for (int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print("abc");
    }
}
