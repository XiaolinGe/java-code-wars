package com.code.wars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AtmPinCodesTest {

    @Test
    public void validPins() {
        assertEquals(true, AtmPinCodes.validatePin("1234"));
        assertEquals(true, AtmPinCodes.validatePin("0000"));
        assertEquals(true, AtmPinCodes.validatePin("1111"));
        assertEquals(true, AtmPinCodes.validatePin("123456"));
        assertEquals(true, AtmPinCodes.validatePin("098765"));
        assertEquals(true, AtmPinCodes.validatePin("000000"));
        assertEquals(true, AtmPinCodes.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, AtmPinCodes.validatePin("a234"));
        assertEquals(false, AtmPinCodes.validatePin(".234"));
    }


    @Test
    public void invalidLengths() {
        assertEquals(false, AtmPinCodes.validatePin("1"));
        assertEquals(false, AtmPinCodes.validatePin("12"));
        assertEquals(false, AtmPinCodes.validatePin("123"));
        assertEquals(false, AtmPinCodes.validatePin("12345"));
        assertEquals(false, AtmPinCodes.validatePin("1234567"));
        assertEquals(false, AtmPinCodes.validatePin("-1234"));
        assertEquals(false, AtmPinCodes.validatePin("1.234"));
        assertEquals(false, AtmPinCodes.validatePin("00000000"));
    }


}
