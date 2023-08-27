package com.example.valentina;

import junit.framework.TestCase;

public class calcularrTestB extends TestCase

{
    public void testSubtractVeryLargeNumbers() {
        calcularr calcular = new calcularr();
        float result = calcular.subtract(Float.MAX_VALUE, Float.MAX_VALUE);
        assertEquals(0.0f, result, 0.001f);
    }

    public void testSubtractNaN() {
        calcularr calcular = new calcularr();
        float result = calcular.subtract(Float.NaN, 10.0f);
        assertEquals(Float.NaN, result, 0.001f);
    }

    public void testSubtractZero() {
        calcularr calcular = new calcularr();
        float result = calcular.subtract(0.0f, 0.0f);
        assertEquals(0.0f, result, 0.001f);
    }


    public void testSubtractMixedNumbers() {
        calcularr calcular = new calcularr();
        float result = calcular.subtract(5.0f, -3.0f);
        assertEquals(8.0f, result, 0.001f);
    }
}