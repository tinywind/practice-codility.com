/**
 * https://codility.com/programmers/task/odd_occurrences_in_array/
 * Find value that occurs in odd number of elements.
 *
 * @author devginie, tinywind
 * score: 100
 * */
function solution(A) {
    var unpaired = {},
    i, max;
    
    for (i = 0, max = A.length; i < max; i += 1) {
        if (unpaired[A[i]]) {
            unpaired[A[i]] = false;
            continue;
        }
        unpaired[A[i]] = true;
    }
    for (var k in unpaired) {
        if (unpaired.hasOwnProperty(k) && unpaired[k]) {
            return Number(k);
        }
    }
    return -1;
}
