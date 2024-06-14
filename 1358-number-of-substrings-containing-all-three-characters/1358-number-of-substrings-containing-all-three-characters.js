/**
 * @param {string} s
 * @return {number}
 */
var numberOfSubstrings = function(s) {
    let cnt = 0;
    let a = [-1,-1,-1];
    for(let i = 0; i<s.length; i++) {
        a[s.charCodeAt(i)-'a'.charCodeAt(0)] = i;
        if(a[0]!=-1 && a[1]!=-1 && a[2]!=-1) 
            cnt += (1+ Math.min(a[0], (Math.min(a[1], a[2]))));
    }
    return cnt;
};