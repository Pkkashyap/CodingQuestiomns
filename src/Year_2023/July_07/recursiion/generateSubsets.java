package Year_2023.July_07.recursiion;

public class generateSubsets {
    public static String subsets(String s,String curr,int i){
        if(i==s.length()){
            System.out.print(curr);
            return curr;
        }

        subsets(s,(curr.replace(",",""))+",",i+1);
        subsets(s,(curr.replace(",","")+s.charAt(i))+",",i+1);
        return curr.replace(",","");
    }

    public static void main(String[] args) {
        System.out.print(subsets("abc","",0));
    }

}
