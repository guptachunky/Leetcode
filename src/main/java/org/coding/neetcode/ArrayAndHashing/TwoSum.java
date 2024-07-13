package org.coding.neetcode.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        // https://neetcode.io/problems/two-integer-sum
        // Easy
        // Appraoch keep moving to array and store values in map with its value and index
        // , and keep searching for difference between target and current values if found return
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(num, i);
        }
        return null;
    }
}
