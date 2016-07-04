/**
 * https://codility.com/programmers/task/perm_missing_elem/
 * Find the missing element in a given permutation.
 *
 * @author devginie
 *         score: 100
 */
function solution(A) {
    // write your code in JavaScript (Node.js 4.0.0)
    if(A.length === 0) {
      return 1;
    }
    var missingSum = A.reduce( (prev, curr) => prev + curr );
    return ((A.length + 2) * (A.length + 1) / 2) - missingSum;
}
