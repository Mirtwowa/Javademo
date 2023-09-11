package sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int nums[] = new int[]{7, 4, 5, 2, 3,1,6,8,10,9};
        for (int tag = nums.length / 2; tag > 0; tag /= 2) {
            for (int j = tag; j < nums.length; j++) {
                for (int i = j - tag; i >= 0; i -= tag) {
                    if (nums[i] > nums[i + tag]) {
                        int num = nums[i];
                        nums[i] = nums[i + tag];
                        nums[i + tag] = num;
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
  /*  public static void ShellSort(int[] array)
    {
        int n = array.Length;
        int inc;//希尔增量
        //这里采用朴素希尔增量，就是每次增量都是原来的一半，直到增量为1为止
        for (inc = n / 2; inc >= 1; inc = inc / 2)
        {//每一次循环都通过不断缩短增量达到排序的效果
            //在一次循环内，inc的值是固定的
            //下面的内容和插入排序的原理是一样的,只不过每个待排序元素的间隔是inc
            for (int i = inc; i < n; i++)
            {//i为什么是从inc开始,而不是从0开始?
                //因为插入排序中把排序元素分为两组，A组为已排好序的，B组为未排好序要插入的
                //A组开始时往往是第一个元素（0），那么B组的第一个元素就是整个待拍序列的第二个元素了（inc）
                int temp = array[i];//temp存储要插入的值
                int j;
                for (j = i-inc; j >= 0 && array[j] > temp; j = j - inc)
                {//j从i-inc开始往前遍历，每一步的距离是inc
                    array[j+inc] = array[j];如果当前遍历到的元素(这里说的遍历到的元素是(array[j])比待插入元素temp小，
                        //这个元素往后移动一位，后边的元素被元素覆盖
                        //一旦不满足条件，1.说明要么遍历到元素比temp小，这个时候所有比temp大的元素都后移完了
                        //2.遍历到头了，此时第一个元素就是要插入的地方
                }
                array[j+inc] = temp;
                //那么此时array[j+inc]也就是要插入的地方，把temp插入进去
            }
        }
    }*/
/*
			//插入排序，时间复杂度为O(n²),且是稳定的排序算法
 public static void InsertSort(int[] array)
        {
            //将数组分为两组，一组是已经排好序的（我们称为A组）另一组是还没有排好序的（称为B组）
            //在数组的刚开始，我们把数组的第一个元素array[0]将入A组，剩下的放入B组
            //从数组的第二个元素开始，逐步与A组的元素相比较（从A组的后边往前边比较）
            for (int i = 1; i < array.Length; i++)
            {
                int temp = array[i];//定义temp存储要插入的值
                int j;
                for (j = i-1; j>=0 && array[j]>temp; j--)//将temp逐步与A组的元素(array[j])相比较（从A组的后边往前边比较）
                {
                    array[j + 1] = array[j];//如果A组中的值大于要比较的值，A组就整个数组往后移动一个位置
                    //这样的移动当然会覆盖A组后边的那个元素的值，
                    //但是别忘了A组后边的那个元素，是要插入的值原本的位置，
                    //所以往后移动只会覆盖这个位置，不会对整个数组产生影响
                }
                array[j + 1] = temp;
                //退出上边的for循环有两种可能
                //1.在A组中找到了一个比temp小的元素，那么temp就可以插入在这个元素的后边，即array[j+1]的位置
                //2.全部遍历完毕，在A组中没有找到比这个temp更小的元素，此时应该把temp插入在A组的最前边（array[0]）
                //由于此时j退出循环时候的值为-1,array[j+1]为要插入的位置
            }
        }

 */
