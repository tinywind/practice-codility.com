package org.tinywind.codility.lesson5;

/**
 * https://codility.com/programmers/task/count_div/
 * Compute number of integers divisible by k in range [a..b].
 *
 * @author tinywind
 *         score: 100
 */
public class CountDiv {
    public static void main(String[] args) {
        p(6, 11, 2);
        p(0, 1, 11);
        p(0, 2000000000, 1);
    }

    private static void p(int A, int B, int K) {
        System.out.println("A(" + A + ") B(" + B + ") K(" + K + ") : " + solution(A, B, K));
    }

    private static int solution(int A, int B, int K) {
        int result = 0;

        if (B > 0)
            result += B / K;
        else if (B == 0)
            result += 1;
        else
            result -= (B + 1) / K;

        if (A > 0)
            result -= (A - 1) / K;
        else if (A == 0)
            result += 1;
        else
            result -= A / K;

        if (A == 0 && B == 0)
            result -= 1;

        return result;
    }
}
