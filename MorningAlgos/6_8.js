// Binary Search

// Given a sorted array and a value, return whether
//  the array contains that value. Do not sequentially 
//  iterate the array. Instead 'divide and conquer'. 
//  Taking advantage of the fact that array is sorted. 


function binarySearch(arr, value){
    
    return arr[start] === value;
}

function binarySearch(input, target, left = 0, right = input.length - 1) {
    
    if(left > right) {
        return false
    }

    midpoint = Math.floor((right+left)/2)

    if(target == input[midpoint]) {
        return true;
    }

    if(target < input[midpoint]) {
        right = midpoint - 1 ;
        return binarySearch(input,target,left,right);
    }
    else if(target > input[midpoint]) {
        left = midpoint + 1;
        return binarySearch(input,target,left,right)
    }
}

input = [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12]

console.log(binarySearch(input, 1));
console.log(binarySearch(input, 2));
console.log(binarySearch(input, 3));
console.log(binarySearch(input, 4));
console.log(binarySearch(input, 5));
console.log(binarySearch(input, 6));
console.log(binarySearch(input, 7));
console.log(binarySearch(input, 8));
console.log(binarySearch(input, 10));
console.log(binarySearch(input, 11));
console.log(binarySearch(input, 12));

console.log(binarySearch(input, -1));
console.log(binarySearch(input, 24));
console.log(binarySearch(input, 9));

// console.log(binarySearch([1,2,3,4,5,6,7,8,9,10], 9));
// ---> 1 2 3 4 5  |  6 7 8 9 10
// ---> 6 7  |  8 9 10
// ---> 8  [9]  10  (found)

// console.log(binarySearchRecursive([1,2,3,4,5,6,7,8,9,10,12,13], 10))    TRUE
// console.log(binarySearchRecursive([0, 2, 4, 6, 8, 10, 12, 14, 16], 9 ))    FALSE
// console.log(binarySearchRecursive([0, 2, 4, 6, 8, 10, 12, 14, 16], 16 ))    TRUE
// console.log(binarySearchRecursive([0, 2, 4, 6, 8, 12, 14, 16], 8 ))    TRUE
// console.log(binarySearchRecursive([8], 8 ))   TRUE