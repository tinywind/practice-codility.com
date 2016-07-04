package org.tinywind.codility.lesson5;

import java.util.Arrays;

/**
 * https://codility.com/programmers/task/passing_cars/
 * Count the number of passing cars on the road.
 *
 * @author tinywind
 *         score: 100
 */
public class PassingCars {
    public static void main(String[] args) {
        p(0, 1, 0, 1, 1);
    }

    private static void p(int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") : " + solution(A));
    }

    private static int solution(int[] A) {
        int count = 0;
        int lastCount = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                lastCount++;
                continue;
            }
            count += lastCount;
            if (1000000000 < count) return -1;
        }
        return count;
    }
}
