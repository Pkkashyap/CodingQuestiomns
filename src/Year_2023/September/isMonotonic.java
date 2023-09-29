package Year_2023.September;

public class isMonotonic {
    public static boolean isMonotonic(int[] nums) {
        if(nums.length ==0){
            return false;
        }

        if(nums.length ==1){
            return true;
        }

            boolean check1 = true;
            for (int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    check1 = false;
                }
            }
        boolean check2 = true;
            for (int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    check2 = false;
                }
            }

        return (check1 || check2) ;
    }

    public static void main(String[] args) {
        int temp[] = {1,1,1,1,5,1};
        System.out.print( isMonotonic(temp));
    }
}
