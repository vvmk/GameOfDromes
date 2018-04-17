package io.zipcoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem4Test {
    @Test
    void testDoesContainDromeTrue() {
        String input = "abdda";

        assertTrue(Problem4.doesContainDrome(input));
    }


    @Test
    void testDoesContainDromeFalse() {
        String input = "abcdefg";

        assertFalse(Problem4.doesContainDrome(input));
    }
}
