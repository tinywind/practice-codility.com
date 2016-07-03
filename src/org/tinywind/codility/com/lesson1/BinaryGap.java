package org.tinywind.codility.com.lesson1;

/**
 * https://codility.com/programmers/task/binary_gap/
 * Find longest sequence of zeros in binary representation of an integer.
 *
 * @author http://tinywind.blog.me/220752090983
 */
public class BinaryGap {
    public static void main(String[] args) {
        p(1);
        p(1000);
    }

    private static void p(int N) {
        System.out.println(N + " : " + solution(N));
    }

    private static int solution(int N) {
        int result = 0;
        String s = Integer.toBinaryString(N);
        int iStart = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                int length = i - iStart - 1;
                if (length > result) result = length;
                iStart = i;
            }
        }
        return result;
    }
}