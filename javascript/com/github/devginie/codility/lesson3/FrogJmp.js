/**
 * https://codility.com/programmers/task/frog_jmp/
 * Count minimal number of jumps from position X to Y.
 *
 * @author devginie
 * score: 100
 */

function solution(X, Y, D) {
    // write your code in JavaScript (Node.js 4.0.0)
    return Math.ceil((Y - X) / D);
}
