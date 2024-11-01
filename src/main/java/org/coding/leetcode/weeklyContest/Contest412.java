package org.coding.leetcode.weeklyContest;

import java.math.BigInteger;
import java.util.Arrays;

public class Contest412 {
    public static void main(String[] args) {
        Contest412 contest412 = new Contest412();
        System.out.println(contest412.getFinalState1(new int[]{100000,2000}, 9, 1000000));
//        System.out.println(contest412.countPairs(new int[]{123, 231}));
    }

    //https://leetcode.com/contest/weekly-contest-412/problems/final-array-state-after-k-multiplication-operations-i/
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            int minIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            nums[minIndex] *= multiplier;
            k--;
        }
        return nums;
    }

    //https://leetcode.com/contest/weekly-contest-412/problems/count-almost-equal-pairs-i/description/
//You are given an array nums consisting of positive integers.
//We call two integers x and y in this problem almost equal if both integers can become equal after performing the following operation at most once:
//Choose either x or y and swap any two digits within the chosen number.
//Return the number of indices i and j in nums where i < j such that nums[i] and nums[j] are almost equal.
//Note that it is allowed for an integer to have leading zeros after performing an operation.

    public int countPairs(int[] nums) {
        int i, j, count = 0;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (isAlmostEqual(nums[i], nums[j])) {
                    System.out.println(nums[i] + " " + nums[j]);
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isAlmostEqual(int num, int num1) {
        if (num == num1) {
            return true;
        }
        String s1 = String.valueOf(num);
        String s2 = String.valueOf(num1);
        return false;
    }

    //https://leetcode.com/contest/weekly-contest-412/problems/final-array-state-after-k-multiplication-operations-i/
    public int[] getFinalState1(int[] nums, int k, int multiplier) {
        BigInteger[] bigIntegers = Arrays.stream(nums)
                .mapToObj(BigInteger::valueOf)
                .toArray(BigInteger[]::new);
        BigInteger bigMultiplier = BigInteger.valueOf(multiplier);
        while (k > 0) {
            int minIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (bigIntegers[minIndex].compareTo(bigIntegers[i]) > 0) {
                    minIndex = i;
                }
            }
            bigIntegers[minIndex] = bigIntegers[minIndex].multiply(bigMultiplier);
            k--;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = bigIntegers[i].mod(BigInteger.valueOf(1000000007)).intValue();
            System.out.println(nums[i]);
        }
        return nums;
    }
}
