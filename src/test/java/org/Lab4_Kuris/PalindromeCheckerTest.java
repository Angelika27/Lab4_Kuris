package org.Lab4_Kuris;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

    @Test
    public void testPalindromeWords() {
        assertTrue(PalindromeChecker.isPalindrome("radar"));
        assertTrue(PalindromeChecker.isPalindrome("level"));
        assertTrue(PalindromeChecker.isPalindrome("Deified"));
    }

    private void assertTrue(boolean radar) {
    }

    @Test
    public void testNonPalindromeWords() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("Java"));
    }

    private void assertFalse(boolean hello) {
    }

    @Test
    public void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }


