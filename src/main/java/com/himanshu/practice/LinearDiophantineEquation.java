package com.himanshu.practice;

/**
 * Created by himanshubhardwaj on 10/02/20.
 */
public class LinearDiophantineEquation {
    public static void main(String[] args) {

    }


    bool find_any_solution(int a, int b, int c, int &x0, int &y0, int g) {

        g = (int)gcd(Math.abs(a), Math.abs(b));

        if (c % g ) {
            return false;
        }

        x0 *= c / g;
        y0 *= c / g;
        if (a < 0) x0 = -x0;
        if (b < 0) y0 = -y0;
        return true;
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
