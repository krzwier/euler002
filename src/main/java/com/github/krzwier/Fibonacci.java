package com.github.krzwier;

import java.util.*;

public class Fibonacci {

    private HashMap<Long, Long> fib = new HashMap<>();

    public long GetFibonacci(long n) {
        if (fib.containsKey(n)) {
            return fib.get(n);
        }
        for (long i = 1; i <= n; i++ ) {
            if (i == 1) {
                fib.put(Long.valueOf(1), Long.valueOf(1));
            } else if (i == 2) {
                fib.put(Long.valueOf(2), Long.valueOf(2));
            } else {
                fib.put(i, fib.get(i - 1) + fib.get(i - 2));
            }
        }
        return fib.get(n);
    }

    public long AddEvenFibonacci(long n) {
        long sum = 0;
        long iterator = 1;
        long temp = GetFibonacci(iterator);
        while (temp <= n) {
            if (temp % 2 == 0) {
                sum += temp;
            }
            iterator++;
            temp = GetFibonacci(iterator);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Fibonacci f = new Fibonacci();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(f.AddEvenFibonacci(n));
        }
        in.close();
    }
}


