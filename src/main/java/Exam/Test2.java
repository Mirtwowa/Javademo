package Exam;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums1 = scanner.next();
        String nums2 = scanner.next();
        //比较第一张手牌和第二张手牌是单张还是对子，不考虑三张牌
        if (nums1.length() != nums2.length() && nums1.length() != 3 && nums2.length() != 3) {
            System.out.println(2);
            return;
        }
        //开始初步考虑三张牌
        if (nums1.length() == 3 && nums2.length() != 3) {
            System.out.println(1);
            return;
        }
        if (nums2.length() == 3 && nums1.length() != 3) {
            System.out.println(-1);
            return;
        }
        //下面开始考虑对子和单张的情况
        HashMap<String, Integer> order = new HashMap<>();
        int val = 1;
        order.put("3", val++);
        order.put("4", val++);
        order.put("5", val++);
        order.put("6", val++);
        order.put("7", val++);
        order.put("8", val++);
        order.put("9", val++);
        order.put("T", val++);
        order.put("J", val++);
        order.put("Q", val++);
        order.put("K", val++);
        order.put("A", val++);
        order.put("2", val++);
        //获取nums1的首元素即可获得对应HASPMAP的val值进行比较，下列都是nums.length长度相等的情况
        String st1 = String.valueOf(nums1.charAt(0)), st2 = String.valueOf(nums2.charAt(0));
        int v1 = order.get(st1), v2 = order.get(st2);
        if (nums1.length() == 3) {
            if (v1 == v2) {
                System.out.println(0);
            } else if (v1 > v2) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
        //开始比较对子和单张，但是由于取的是第一张，所以可以直接看成比较单张
        else {
            if (st1.equals("2") && st2.equals("2")) {
                System.out.println(0);
                return;
            } else if (st1.equals("2")) {
                System.out.println(1);
                return;
            } else if (st2.equals("2")) {
                System.out.println(-1);
                return;
            }
            if (Math.abs(v1 - v2) != 1) {
                System.out.println(2);
                return;
            }
            if (v1 == v2) {
                System.out.println(0);
            } else if (v1 > v2) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }

        }

    }

}

