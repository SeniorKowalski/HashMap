package com.kowalski;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static final String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
            " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
            " ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat" +
            " non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                char c = str.toLowerCase().charAt(i);
                int v = 1;
                if (!map.containsKey(c)) {
                    map.put(c, v);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
        }
        System.out.println(map);

        int max = -1;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> kvMap : map.entrySet()) {
            if (kvMap.getValue() > max) max = kvMap.getValue();
            if (kvMap.getValue() < min) min = kvMap.getValue();
        }
        System.out.println(max);
        System.out.println(min);
    }
}
