package org.tinywind.codility.demo;

import java.util.Arrays;

/**
 * https://codility.com/demo/take-sample-test/
 * http://blog.codility.com/2011/03/solutions-for-task-equi.html
 * Find an index in an array such that its prefix sum equals its suffix sum.
 *
 * @author http://tinywind.blog.me/220752016674
 * score: 100
 */
public class Equi {
    public static void main(String[] args) {
        p(1082132608, 0, 1082132608);
        p(-1, 1, 0);
    }

    private static void p(int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") : " + solution(A));
    }

    private static int solution(int[] A) {
        long lastLeft = 0L;
        long lastRight = 0L;
        int lastP = -1;
        for (int p = 0; p < A.length; p++) {
            long left = 0L;
            long right = 0L;

            if (lastP <= 0)
                for (int i = 0; i < p; i++)
                    left += A[i];
            else
                left = lastLeft + A[lastP];

            if (lastP < 0)
                for (int i = p + 1; i < A.length; i++)
                    right += A[i];
            else if (lastP + 1 < A.length)
                right = lastRight - A[lastP + 1];
            else
                right = 0L;

            if (left == right)
                return p;

            lastP = p;
            lastLeft = left;
            lastRight = right;
        }

        return -1;
    }
}
