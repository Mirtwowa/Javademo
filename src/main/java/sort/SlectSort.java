package sort;

import java.util.Arrays;

public class SlectSort {
    public static void main(String[] args) {
        int nums[] = new int[]{7, 5, 4, 3, 2};
        for (int i = 0; i < nums.length; i++) {
            int ARR = nums[i];
            int minnum = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < ARR) {
                    minnum = j;
                }
            }
            if (minnum != i) {
                nums[i] = nums[minnum];
                nums[minnum] = ARR;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
