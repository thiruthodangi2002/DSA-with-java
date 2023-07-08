package Hashingcpts;

import java.util.*;
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Thiru", 1);
        map.put("Hari", 2);
        map.put("chiru", 3);
        System.out.println(map);
        if (map.containsKey("Thiru")) {
            System.out.println("yes contains:");
        } else {
            System.out.println("doesn't contains:");
        }
        System.out.println(map.get("Hari"));
        System.out.println(map.get("suraj"));
        // iteration
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }

}
