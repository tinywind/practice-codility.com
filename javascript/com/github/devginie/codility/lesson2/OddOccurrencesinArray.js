/**
 * https://codility.com/programmers/task/odd_occurrences_in_array/
 * Find value that occurs in odd number of elements.
 *
 * @author devginie, tinywind
 * score: 100
 * */
function solution(A) {
    var unpaired = {};
    for (var i = 0; i < A.length; i++) {
        if (unpaired[A[i]]) {
            unpaired[A[i]] = false;
            continue;
        }
        unpaired[A[i]] = true;
    }
    for (var k in unpaired) {
        if (unpaired.hasOwnProperty(k) && unpaired[k])
            return parseInt(k);
    }
    return -1;
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
    p(2, 1, 2, 3, 3);
    p(10, 10, 1);
    p(10);
}