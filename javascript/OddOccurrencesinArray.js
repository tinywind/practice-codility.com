/**
 * https://codility.com/programmers/task/odd_occurrences_in_array/
 * Find value that occurs in odd number of elements.
 *
 * @author devginie, tinywind
 * */
function solution(A) {
    var unpaired = [];
    for (var i = 0; i < A.length; i++) {
        var index = unpaired.indexOf(A[i]);
        if (index >= 0) {
            unpaired.splice(index, 1);
            continue;
        }
        unpaired.push(A[i]);
    }
    return unpaired[0];
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