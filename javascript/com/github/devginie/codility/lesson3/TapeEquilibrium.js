/**
* https://codility.com/programmers/task/tape_equilibrium/
* Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
*
* @author devginie
*         score: 100
*/
function solution(A) {
    // write your code in JavaScript (Node.js 4.0.0)
    var P, max, i,
    split1 = 0, split2 = 0,
    diff, newDiff;

    // Sum of split2
    for(i = 0, max = A.length; i < max; i += 1) {
        split2 += A[i];
    }

    for(P = 0, max = A.length ; P < max - 1; P += 1) {

        split1 += A[P];
        split2 -= A[P];

        newDiff = Math.abs(split1 - split2);

        if(diff === undefined) {
          diff = newDiff;
        }

        if(newDiff < diff) {
            diff = newDiff;
        }
    }

    return Number(diff);
}
