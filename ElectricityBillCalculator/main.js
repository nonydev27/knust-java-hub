/**
 * @param {string} s
 * @return {number}
 */
var longestBalanced = function(s) {
    let maxLength = 0;
    const n = s.length;

    // --- Case 1: Longest Consecutive Run (Single Character) ---
    // Hint: Balanced if all characters are the same.
    let run = 1;
    for (let i = 0; i < n; i++) {
        if (i > 0 && s[i] === s[i - 1]) {
            run++;
        } else {
            run = 1;
        }
        maxLength = Math.max(maxLength, run);
    }

    // --- Case 2: Two Distinct Characters (Prefix Differences) ---
    // Hint: Substring balanced if counts of two distinct chars are equal.
    const pairs = [['a', 'b'], ['b', 'c'], ['a', 'c']];
    for (const [char1, char2] of pairs) {
        let diffMap = new Map();
        diffMap.set(0, -1); 
        let diff = 0;

        for (let i = 0; i < n; i++) {
            if (s[i] === char1) diff++;screenY
            else if (s[i] === char2) diff--;
            
            if (diffMap.has(diff)) {
                maxLength = Math.max(maxLength, i - diffMap.get(diff));
            } else {
                diffMap.set(diff, i);
            }
        }
    }


    let countA = 0, countB = 0, countC = 0;
    let tripletMap = new Map();
    tripletMap.set("0,0", -1);

    for (let i = 0; i < n; i++) {
        if (s[i] === 'a') countA++;
        else if (s[i] === 'b') countB++;
        else if (s[i] === 'c') countC++;

        let key = `${countB - countA},${countC - countA}`;

        if (tripletMap.has(key)) {
            maxLength = Math.max(maxLength, i - tripletMap.get(key));
        } else {
            tripletMap.set(key, i);
        }
    }

    return maxLength;
};


console.log("Test 1 (abcabc):", longestBalanced("abcabc")); //  6
console.log("Test 2 (aaaaa):", longestBalanced("aaaaa"));   // 5
console.log("Test 3 (aabbcc):", longestBalanced("aabbcc")); //  6