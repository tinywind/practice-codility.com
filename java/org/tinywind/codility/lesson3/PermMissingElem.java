package org.tinywind.codility.lesson3;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * https://codility.com/programmers/task/perm_missing_elem/
 * Find the missing element in a given permutation.
 *
 * @author tinywind
 *         score: 100
 */
public class PermMissingElem {
    public static void main(String[] args) {
        p(3, 1, 2, 4, 3);
        p(3, 1);
        p();
        p(2);
        p(1);
    }

    private static void p(int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") : " + solution(A));
    }

    private static int solution(int[] A) {
        if (A.length == 0)
            return 1;

        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 1; i <= A.length + 1; i++)
            tree.add(i);

        for (int i : A)
            tree.remove(i);

        return tree.first();
    }
}
