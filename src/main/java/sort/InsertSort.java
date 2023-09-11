package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String args[]) {
        int[] nums = new int[]{1, 5, 6, 3, 7};
        for (int i = 1; i < nums.length; i++) {
            int insertval = nums[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertval < nums[insertIndex]) {
                nums[insertIndex + 1] = nums[insertIndex];
                insertIndex--;
            }
            nums[insertIndex + 1] = insertval;
            System.out.println(Arrays.toString(nums));
        }


    }
}
