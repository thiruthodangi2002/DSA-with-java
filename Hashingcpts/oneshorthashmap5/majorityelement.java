package Hashingcpts.oneshorthashmap5;

import java.util.*;

public class majorityelement {
    public static void majorityelementinarr(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        // if key exists
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            // if not exist
            else {
                map.put(nums[i], 1);

            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 2, 3, 1 };
        majorityelementinarr(nums);

    }

}
