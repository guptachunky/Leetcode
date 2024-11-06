package org.coding.leetcode.DailyContest;

public class Nov6 {
    public static void main(String[] args) {
        System.out.println(canSortArray(new int[]{3, 16, 8, 4, 2}));
        System.out.println(canSortArray(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(Integer.bitCount(5));
    }

    //https://leetcode.com/problems/find-if-array-can-be-sorted/
    public static boolean canSortArray(int[] nums) {
        int cur_min = nums[0], cur_max = nums[0];
        int prev_max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (Integer.bitCount(num) == Integer.bitCount(cur_min)) {
                cur_min = Math.min(num, cur_min);
                cur_max = Math.max(num, cur_max);
            } else {
                if (cur_min < prev_max) {
                    return false;
                }
                prev_max = cur_max;
                cur_min = cur_max = num;
            }
        }
        return !(cur_min < prev_max);
    }


}
