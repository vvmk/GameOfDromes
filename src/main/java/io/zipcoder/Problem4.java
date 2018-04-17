package io.zipcoder;

import java.util.HashSet;
import java.util.Set;

class Problem4 {
    static boolean doesContainDrome(String input) {
        char[] letters = input.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : letters) {
            if (set.contains(c))
                set.remove(c);
            else
                set.add(c);
        }
        return set.size() <= 1;
    }
}
