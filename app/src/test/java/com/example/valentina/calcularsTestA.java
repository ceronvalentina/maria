package com.example.valentina;

import junit.framework.TestCase;

public class calcularsTestA extends TestCase
{

    public void testSum() {
        calculars calcular = new calculars();
        float result = calcular.sum(2.5f, 3.5f);
        assertEquals(6.0f, result, 0.001f);
    }

    public void testSumNegativeNumbers() {
        calculars calcular = new calculars();
        float result = calcular.sum(-2.0f, -3.0f);
        assertEquals(-5.0f, result, 0.001f);
    }

    public void testSumZero() {
        calculars calcular = new calculars();
        float result = calcular.sum(0.0f, 0.0f);
        assertEquals(0.0f, result, 0.001f);
    }

    public void testSumMixedNumbers() {
        calculars calcular = new calculars();
        float result = calcular.sum(2.0f, -3.0f);
        assertEquals(-1.0f, result, 0.001f);
    }
}