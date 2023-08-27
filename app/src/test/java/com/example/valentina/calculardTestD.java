package com.example.valentina;

import junit.framework.TestCase;

public class calculardTestD extends TestCase
{
    public void testDivideByZero() {
        calculard calcu = new calculard();
        float result = calcu.divide(10.0f, 0.0f);
        assertEquals(Float.POSITIVE_INFINITY, result, 0.001f);
    }


    public void testDivideInfinityByInfinity() {
        calculard calcu = new calculard();
        float result = calcu.divide(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        assertEquals(Float.NaN, result, 0.001f);
    }


    public void testDivideNegativeByPositive() {
        calculard calcu = new calculard();
        float result = calcu.divide(-8.0f, 4.0f);
        assertEquals(-2.0f, result, 0.001f);
    }
}