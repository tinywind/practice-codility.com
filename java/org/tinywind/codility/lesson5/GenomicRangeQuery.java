package org.tinywind.codility.lesson5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://codility.com/programmers/task/genomic_range_query/
 * Find the minimal nucleotide from a range of sequence DNA.
 *
 * @author tinywind
 */
public class GenomicRangeQuery {
    public static void main(String[] args) {
        p("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
    }

    private static void p(String S, int[] P, int[] Q) {
        System.out.println("S(" + S + ") P(" + Arrays.toString(P) + ") Q(" + Arrays.toString(Q) + "): " + Arrays.toString(solution(S, P, Q)));
    }

    // letters A(1) C(2) G(3) T(4)
    /* Correctness(40%) Performance(33%) */
    private static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for (int i = 0; i < P.length; i++) {
            int start, end;
            if (P[i] <= Q[i]) {
                start = P[i];
                end = Q[i];
            } else {
                end = P[i];
                start = Q[i];
            }

            Map<Integer, Integer> map1 = map.get(start);
            if (map1 == null) {
                map1 = new HashMap<>();
                map.put(start, map1);
            }

            Integer value = map1.get(end);
            if (value != null) {
                result[i] = value;
                continue;
            }

            int minChar = 'T';
            for (int j = start; j <= end; j++) {
                if (S.charAt(j) < minChar)
                    minChar = S.charAt(j);
                int min = minChar == 'A' ? 1 : minChar == 'C' ? 2 : minChar == 'G' ? 3 : 4;
                map1.put(j, min);
            }

            result[i] = map1.get(end);
        }

        return result;
    }
}
