/* ===== Find index of element ===== */

/* == Step 1 == */

// Are you able to understand the question fully?
// Yes, it seems xD

// Can you restate the problem in your own words
// Yeah, easy, I am given an array of elements, and I need to find position of a given elements

// Would you be able to explain the question to a layman?
// Yes, this I've got this one

// What and how many inputs are required?
// 2 inputs, array and element
// Hey Wait, 
// Here's a catch, what's the type of values that are being stored in the arrray

// Can you separate out some modules or parts from the problem?
// Yeah, let's make a function

// Do you have enough information?
// Yes

/* == Step 2 == */

// arr = [1, 2, 3, 4], element = 2 
// pos = 2

// Use cases? 
// The input array can be a collection of int, float, char, String etc

// arr = [], element = 4
// pos = -1

// arr = [1, 2, 3, 4], element = 'a'
// pos = undefined or -1

/* == Step 3 == */

// Lets create a for loop and iterate over each element

/* == Step 4 == */

function search (arr, n) {
    for (let i=0; i<arr.length; i++)
        if (arr[i] === n)
            return i+1;
    
    return -1;
}

/* == Step 5 == */

function search2 (arr, n) {
    let left = 0,
        right = arr.length - 1, mid;

    while (left <= right) {
        mid = Math.floor((left + right)/2);
        if (arr[mid] === n)  return mid;
        else if (arr[mid] < n)  left = mid+1;
        else right = mid-1;
    }

    return -1;
}

console.log (search ([1, 2, 3, 4, 5, 6, 7, 8, 9], 10)); // 5
console.log (search2 ([1, 2, 3, 4, 5, 6, 7, 8, 9], 10)); // 5