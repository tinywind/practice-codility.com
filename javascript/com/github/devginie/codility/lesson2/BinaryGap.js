/**
 * https://codility.com/programmers/task/odd_occurrences_in_array/
 * Find value that occurs in odd number of elements.
 *
 * @author devginie
 * score: 100
 * */
function solution(N) {
    // write your code in JavaScript (Node.js 4.0.0)
    var bitString = (N).toString(2),
        i, max,
        count = 0, answer = 0;
    
    for(i = 0, max = bitString.length; i < max; i += 1){
        
        if((bitString[i] * 1) === 1) {
            answer = count > answer ? count : answer;
            count = 0;
        } else {
            count++; 
        }
    }
    return answer;
}
