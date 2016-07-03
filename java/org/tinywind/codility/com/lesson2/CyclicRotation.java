package org.tinywind.codility.com.lesson2;

import java.util.Arrays;

/**
 * https://codility.com/programmers/task/cyclic_rotation/
 * Rotate an array to the right by a given number of steps.
 *
 * @author http://tinywind.blog.me/220752085958
 */
public class CyclicRotation {
    public static void main(String[] args) {
        p(2, 1, 2, 3);
        p(10);
        p(10, 1, 2, 3);
    }

    private static void p(int K, int... A) {
        System.out.println("A(" + Arrays.toString(A) + ") K(" + K + ") : " + Arrays.toString(solution(A, K)));
    }

    private static int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        if (A.length == 0) return result;
        K %= A.length;
        System.arraycopy(A, A.length - K, result, 0, K);
        System.arraycopy(A, 0, result, K, A.length - K);
        return result;
    }
}
