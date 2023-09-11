package sort;

import java.util.Arrays;

public class InsertSort_2 {
    public static void main(String[] args) {
        int nums[]=new int[]{7,1,2,4,3,5,8,6,9,10};
        int i,j,temp,index;
        for (i = 1;i<nums.length;i++){
             temp=nums[i];
             index=i;
            for ( j =i-1;j>=0 && nums[j]>temp;j--){
                    nums[j+1]=nums[j];

            }
            nums[j+1]=temp;
            System.out.println(Arrays.toString(nums));
        }
    }
}
