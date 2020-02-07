package com.himanshu.practice;

/**
 * Created by himanshubhardwaj on 07/02/20.
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(300,20700));
    }

    public static long gcd(long a, long b) {
        if (a > b) {
            return gcd(b, a);
        }

        if (a == 0) {
            return b;
        }

        if (a == 1) {
            return 1;
        }

        return gcd(b % a, a);
    }
}
