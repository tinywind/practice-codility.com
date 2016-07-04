package org.tinywind.codility.lesson4;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * https://codility.com/programmers/task/perm_check/
 * Check whether array A is a permutation.
 *
 * @author tinywind
 *         score: 100
 */
public class PermCheck {
    public static void main(String[] args) {
        p(4, 1, 3);
        p(4, 1, 3, 2);
        p(1, 1);
    }

    private static void p(int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") : " + solution(A));
    }

    private static int solution(int[] A) {
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < A.length; i++) tree.add(i + 1);

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length)
                return 0;

            if (!tree.remove(A[i]))
                return 0;
        }
        return 1;
    }
}
