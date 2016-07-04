package org.tinywind.codility.lesson3;

/**
 * https://codility.com/programmers/task/frog_jmp/
 * Count minimal number of jumps from position X to Y.
 *
 * @author tinywind
 * score: 100
 */
public class FrogJmp {
    public static void main(String[] args) {
        p(10, 85, 30);
    }

    private static void p(int X, int Y, int D) {
        System.out.println("X(" + X + ") Y(" + Y + ") D(" + D + ") : " + solution(X, Y, D));
    }

    private static int solution(int X, int Y, int D) {
        return (int) Math.ceil(((double)Y - (double)X) / (double)D);
    }
}
