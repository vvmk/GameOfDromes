package io.zipcoder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem4Test {

    @Test
    void testIsDromeTrue() {
        String input = "baaab";

        assertTrue(Problem4.isDrome(input));
    }


    @Test
    void testIsDromeFalse() {
        String input = "dbca";

        assertTrue(Problem4.isDrome(input));
    }

    @Test
    void testDoesContainDromeTrue() {
        String input = "abdda";

        assertTrue(Problem4.doesContainDrome(input));
    }


    @Test
    void testDoesContainDromeFalse() {
        String input = "abcdefg";

        assertTrue(Problem4.doesContainDrome(input));
    }
}
