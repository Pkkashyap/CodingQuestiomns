package Year_2023.July_07.recursiion;

public class ropeCutting {
    public static int solve(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }

        if(n<0)return -1;
        int aa = solve(n-a,a,b,c);
        int bb = solve(n-b,a,b,c);
        int cc = solve(n-c,a,b,c);

        int ans = Math.max(aa,Math.max(bb,cc));
        if(ans==-1)
            return -1;
        return 1+ans;
    }
    public static void main(String[] args) {
        System.out.print(solve(23,12,9,11));
    }
}
