package sort;

import java.util.Arrays;

public class ShellSort_2 {
    public static void main(String[] args) {
        int nums[]=new int[]{7,1,2,4,3,5,8,6,9,10};
        int i,j,inc,temp;
        for (inc= nums.length/2;inc>0;inc/=2){
            for (i=inc;i< nums.length;i++){
                temp=nums[i];
                for (j=i-inc;j>=0&&nums[j]>temp;j-=inc){
                    nums[j+inc]=nums[j];
                }
                nums[j+inc]=temp;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
