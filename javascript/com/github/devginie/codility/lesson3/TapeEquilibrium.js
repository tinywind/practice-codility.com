/**
* https://codility.com/programmers/task/tape_equilibrium/
* Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
*
* @author devginie
*         score: 66
*/
function solution(A) {
    // write your code in JavaScript (Node.js 4.0.0)
    var P, max, i,
    split1 = 0, split2 = 0,
    diff;

    for(P = 0, max = A.length ; P < max - 1; P += 1) {

        split1 += A[P];

        for(i = P + 1; i < max; i += 1) {
            split2 += A[i];
        }

        if(diff === undefined) {
          diff = Math.abs(split1 - split2);
        }

        if(Math.abs(split1 - split2) < diff && Math.abs(split1 - split2) !== 0) {
            diff = Math.abs(split1 - split2);
        }

        split2 = 0;

    }

    return Number(diff);
}
