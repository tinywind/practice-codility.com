package org.tinywind.codility.lesson3;

import java.util.Arrays;

/**
 * https://codility.com/programmers/task/tape_equilibrium/
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 *
 * @author tinywind
 *         score: 100
 */
public class TapeEquilibrium {
    public static void main(String[] args) {
        p(3, 1, 2, 4, 3);
        p(3, 1);
    }

    private static void p(int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") : " + solution(A));
    }

    private static int solution(int[] A) {
        if (A.length == 2)
            return Math.abs(A[0] - A[1]);

        long min = Integer.MAX_VALUE;

        long lastLeft = 0;
        long lastRight = 0;
        for (int p = 1; p < A.length - 1; p++) {
            long left = 0;
            long right = 0;

            if (p == 1)
                for (int i = 0; i < p; i++) left += A[i];
            else
                left = lastLeft + A[p - 1];

            if (p == 1)
                for (int i = p; i < A.length; i++) right += A[i];
            else
                right = lastRight - A[p - 1];

            long abs = left - right;
            if (abs < 0)
                abs *= -1;

            if (abs < min)
                min = abs;

            lastLeft = left;
            lastRight = right;
        }
        return (int) min;
    }
}
