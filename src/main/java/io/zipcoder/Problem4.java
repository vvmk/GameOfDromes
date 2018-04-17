package io.zipcoder;

import java.util.HashSet;
import java.util.Set;

public class Problem4 {
    public static boolean isDrome(String input) {
        char[] letters = input.toCharArray();
        for (int i = 0; i < (letters.length / 2); i++) {
            if (letters[i] != letters[letters.length - i - 1])
                return false;
        }
        return true;
    }

    public static boolean doesContainDrome(String input) {
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
