package Year_2023.July_07;

import java.util.HashMap;
import java.util.Map;

public class Smallest_Positive_missing_number {
    static int missingNumber(int arr[], int size)
    {
        int small = 1;
        int high = Integer.MIN_VALUE;
        Map<Integer,Integer> frq = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<1){
                continue;
            }

            high = Math.max(high,arr[i]);
            frq.put(arr[i],frq.getOrDefault(arr[i],0)+1);
        }
        for(int i=small;i<=high+1;i++){
            if(frq.get(i)==null){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int temp[] = {0, -2, 2, -2, 0, 0, -2, 0 ,0};
        System.out.print(missingNumber(temp,5));
    }
}
