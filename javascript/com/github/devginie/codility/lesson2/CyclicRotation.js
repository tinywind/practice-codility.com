/**
 * https://codility.com/programmers/task/cyclic_rotation/
 * Rotate an array to the right by a given number of steps.
 *
 * @author devginie
 * score: 100
 * */
function solution(A, K) {
    // write your code in JavaScript (Node.js 4.0.0)
    var i;
    if(A.length === 0) {
        return [];
    }
    for(i = 0; i < K; i += 1) {
        A.unshift(A.pop());
    }
    return A;
}
