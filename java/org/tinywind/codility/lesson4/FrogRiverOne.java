package org.tinywind.codility.lesson4;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * https://codility.com/demo/take-sample-test/S
 * Find the earliest time when a frog can jump to the other side of a river.
 *
 * @author tinywind
 *         score: 100
 */
public class FrogRiverOne {
    public static void main(String[] args) {
        p(5, 1, 3, 1, 4, 2, 3, 5, 4);
    }

    private static void p(int X, int... A) {
        System.out.println("X(" + X + ") A(" + Arrays.toString(A) + ") : " + solution(X, A));
    }

    private static int solution(int X, int[] A) {
        TreeSet<Integer> tree = new TreeSet<>();

        int frogPos = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == frogPos + 1) {
                frogPos++;
                if (X == frogPos)
                    return i;
            }

            tree.add(A[i]);

            while (tree.remove(frogPos + 1)) {
                frogPos++;
                if (X == frogPos)
                    return i;
            }

            if (X == frogPos)
                return i;
        }

        return -1;
    }
}
