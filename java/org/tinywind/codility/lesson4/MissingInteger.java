package org.tinywind.codility.lesson4;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * https://codility.com/programmers/task/missing_integer/
 * Find the minimal positive integer not occurring in a given sequence.
 *
 * @author tinywind
 *         score: 100
 */
public class MissingInteger {
    public static void main(String[] args) {
        p(1, 3, 6, 4, 1, 2);
    }

    private static void p(int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") : " + solution(A));
    }

    private static int solution(int[] A) {
        int index = 0;
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == index + 1) {
                index++;
            } else if (index < A[i]) {
                tree.add(A[i]);
            }

            while (tree.remove(index + 1)) {
                index++;
            }
        }

        return index + 1;
    }
}
