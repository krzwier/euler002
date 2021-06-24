package com.github.krzwier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Suite of unit tests for Fibonacci class
 */
class FibonacciTest {

    /**
     * Helper method to create Fibonacci instance and
     * test GetFibonacci method
     */
    void assertFibonacciEquals(long expected, long input){
        Fibonacci myfib = new Fibonacci();
        assertEquals(expected,myfib.GetFibonacci(input));
    }


    /**
     * Helper method to create Fibonacci instance and
     * test AddEvenFibonacci method
     */
    void assertAddEvenFibonacciEquals(long expected, long input){
        Fibonacci myfib = new Fibonacci();
        assertEquals(expected,myfib.AddEvenFibonacci(input));
    }


    @Test
    void GetFibonacci_1_1() {
        assertFibonacciEquals(1, 1);
    }

    @Test
    void GetFibonacci_2_2() {
        assertFibonacciEquals(2, 2);
    }

    @Test
    void GetFibonacci_3_3() {
        assertFibonacciEquals(3, 3);
    }

    @Test
    void GetFibonacci_4_5() {
        assertFibonacciEquals(5,4);
    }

    @Test
    void GetFibonacci_5_8() {
        assertFibonacciEquals(8,5);
    }

    @Test
    void GetFibonacci_6_13() {
        assertFibonacciEquals(13,6);
    }

    @Test
    void GetFibonacci_7_21() {
        assertFibonacciEquals(21,7);
    }

    @Test
    void GetFibonacci_8_34() {
        assertFibonacciEquals(34,8);
    }

    @Test
    void GetFibonacci_9_55() {
        assertFibonacciEquals(55,9);
    }

    @Test
    void GetFibonacci_10_89() {
        assertFibonacciEquals(89,10);
    }

    @Test
    void AddEvenFibonacci_10_10() {
        assertAddEvenFibonacciEquals(10, 10);
    }

    @Test
    void AddEvenFibonacci_100_44() {
        assertAddEvenFibonacciEquals(44, 100);
    }

}
