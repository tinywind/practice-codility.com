package org.tinywind.codility.lesson4;

import java.util.Arrays;

/**
 * https://codility.com/programmers/task/max_counters/
 * Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
 *
 * @author tinywind
 *         score: 100
 */
public class MaxCounters {
    public static void main(String[] args) {
        p(5, 3, 4, 4, 6, 1, 4, 4);
    }

    private static void p(int N, int... A) {
        System.out.println("N(" + N + ") A(" + Arrays.toString(A) + ") : " + Arrays.toString(solution(N, A)));
    }

    private static int[] solution(int N, int[] A) {
        int[] result = new int[N];

        int max = 0;
        int adjustMax = 0;
        for (int a : A) {
            if (a > N) {
                adjustMax = max;
            } else {
                int j = a - 1;
                if (result[j] < adjustMax) result[j] = adjustMax + 1;
                else result[j]++;
                if (max < result[j]) max = result[j];
            }
//            System.out.println(Arrays.toString(result));
        }

        for (int j = 0; j < result.length; j++)
            if (result[j] < adjustMax)
                result[j] = adjustMax;

        return result;
    }

    /* Correctness(100%) Performance(60%) Task score(77%)
    private static int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        for (int a : A)
            if (a > N) for (int j = 0; j < result.length; j++) result[j] = max;
            else if (max < ++result[a - 1]) max = result[a - 1];
        return result;
    }*/
}
