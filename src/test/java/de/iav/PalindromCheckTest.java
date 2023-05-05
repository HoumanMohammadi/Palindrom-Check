package de.iav;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromCheckTest {

    @Test
    public void checkPalindrome_shouldReturnTrue_whenStringIsWhiteSpace(){
        //given
        String stringToCheck= " ";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrom(stringToCheck);
        //then
        assertTrue(isPalindrome);
    }

    @Test
    public void checkPalindrome_whenStringIsEmpty_shouldReturnTrue(){
        String stringToCheck= "";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrom(stringToCheck);
        //then
        assertTrue(isPalindrome);
    }

    @Test
    public void checkPalindrome_whenStringIsAB_shouldReturnTrue(){
        //given
        String stringToCheck= "AB";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrom(stringToCheck);
        //then
        assertFalse(isPalindrome);
    }

    @Test
    public void checkPalindrome_whenStringIsAAA_shouldReturnTrue(){
        //given
        String stringToCheck= "AAA";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrom(stringToCheck);
        //then
        assertTrue(isPalindrome);
    }

    @Test
    public void checkPalindrome_whenStringIsABC_shouldReturnTrue(){
        //given
        String stringToCheck= "ABCdcba";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrom(stringToCheck);
        //then
        assertFalse(isPalindrome);
    }

}