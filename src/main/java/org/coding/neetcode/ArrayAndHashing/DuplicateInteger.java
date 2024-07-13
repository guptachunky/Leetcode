package org.coding.neetcode.ArrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {
    public static void main(String[] args) {
//        https://neetcode.io/problems/duplicate-integer
    }

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int num : nums) {
            if (values.contains(num)) {
                return true;
            }
            values.add(num);
        }
        return false;
    }
}
