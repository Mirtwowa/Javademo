package sort;

import java.util.Arrays;

public class MPsort {
    public static void main(String[] args) {
        int nums[]=new int[]{7,4,3,2,1};
        for (int i=0;i<nums.length-1;++i){
            for (int j=0;j< nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int num =nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=num;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
