package org.tinywind.codility.lesson5;

import java.util.Arrays;

/**
 * https://codility.com/programmers/task/min_avg_two_slice/
 * Find the minimal average of any slice containing at least two elements.
 *
 * @author tinywind
 *         score: 100
 */
public class MinAvgTwoSlice {
    public static void main(String[] args) {
        p(4, 2, 2, 5, 1, 5, 8);
        p(5, 6, 3, 4, 9);
    }

    private static void p(int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") : " + solution(A));
    }

    /**
     * refer: https://www.martinkysel.com/codility-minavgtwoslice-solution/
     * !! Every slice must be of size two or three. !!
     */
    private static int solution(int[] A) {
        if (A.length == 2)
            return 0;

        int minIndex = 0;
        double minDev = Double.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            double dev = ((long) A[i] + A[i + 1]) / 2d;
            if (dev < minDev) {
                minDev = dev;
                minIndex = i;
            }

            if (i < A.length - 2) {
                dev = ((long) A[i] + A[i + 1] + A[i + 2]) / 3d;
                if (dev < minDev) {
                    minDev = dev;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }
}
