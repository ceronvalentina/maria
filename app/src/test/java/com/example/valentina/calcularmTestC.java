package com.example.valentina;

import junit.framework.TestCase;

public class calcularmTestC extends TestCase
{
    public void testMultiplyLargeNumbers() {
        calcularm calcula = new calcularm();
        float result = calcula.multiply(1e20f, 1e10f);
        assertEquals(1e30f, result, 1e20f);
    }


    public void testMultiplyZeroByInfinity() {
        calcularm calcula = new calcularm();
        float result = calcula.multiply(0.0f, Float.POSITIVE_INFINITY);
        assertEquals(Float.NaN, result, 0.001f);
    }


    public void testMultiplyNegativeByZero() {
        calcularm calcula = new calcularm();
        float result = calcula.multiply(-5.0f, 0.0f);
        assertEquals(0.0f, result, 0.001f);
    }
}