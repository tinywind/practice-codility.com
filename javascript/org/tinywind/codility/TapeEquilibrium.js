/**
 * https://codility.com/programmers/task/tape_equilibrium/
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 *
 * @author tinywind
 *         score: 100
 */
function solution(A) {
    if (A.length == 2)
        return Math.abs(A[0] - A[1]);

    var min = Number.MAX_VALUE;

    var lastLeft = 0;
    var lastRight = 0;
    for (var p = 1; p < A.length - 1; p++) {
        var left = 0;
        var right = 0;

        if (p == 1)
            for (var i = 0; i < p; i++) left += A[i];
        else
            left = lastLeft + A[p - 1];

        if (p == 1)
            for (i = p; i < A.length; i++) right += A[i];
        else
            right = lastRight - A[p - 1];

        var abs = left - right;
        if (abs < 0)
            abs *= -1;

        if (abs < min)
            min = abs;

        lastLeft = left;
        lastRight = right;
    }
    return parseInt(min);
}

function p() {
    var arr = [];
    for (var k in arguments) {
        if (arguments.hasOwnProperty(k))
            arr.push(arguments[k]);
    }
    console.log("A(" + arr + ") : " + solution(arr));
}

function test() {
    p(3, 1, 2, 4, 3);
    p(3, 1);
}