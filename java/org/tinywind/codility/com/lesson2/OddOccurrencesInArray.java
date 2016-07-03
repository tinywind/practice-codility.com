package org.tinywind.codility.com.lesson2;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * https://codility.com/programmers/task/odd_occurrences_in_array/
 * Find value that occurs in odd number of elements.
 *
 * @author http://tinywind.blog.me/220752072231
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        p(2, 1, 2, 3, 3);
        p(10, 10, 1);
        p(10);
    }

    private static void p(int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") : " + solution(A));
    }

    private static int solution(int[] A) {
        TreeSet<Integer> unpaired = new TreeSet<>();
        for (int i : A) {
            if (unpaired.remove(i)) {
                continue;
            }
            unpaired.add(i);
        }
        return unpaired.first();
    }
}
