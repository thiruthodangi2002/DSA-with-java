package Hashingcpts.oneshorthashmap5;

import java.util.HashMap;

public class sumofsubarrtok {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);// for empty sub array;
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k); /// no of times
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
                // update the freq

            } else { // if it first time
                map.put(sum, 1);
            }
        }
        System.out.println(ans);

    }

}
