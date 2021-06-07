// Finding a balance point

function balancePoint(arr){
    let sumLeft = 0;
    let sumRight = 0;
    for(let i = 0; i < arr.length; i++){
        let j = arr.length - 1;
        sumLeft += arr[i];
        if(sumLeft > arr[j]){
            sumRight += arr[j];
            j--;
        }
        if(i == j - 1 && sumLeft == arr[j] || i == j -1 && sumLeft == sumRight){
            console.log("True -balance point is at arr index of: ", i);
            return i;
        }
        if(i == j - 1 && sumLeft != arr[j] || i == j -1 && sumLeft != sumRight){
            return false;
        }
    }
}

function balanceIndex(arr){
    let j = arr.length - 1;
    let i = 0;
    let sumLeft = arr[i];
    let sumRight = arr[j];
    while(sumLeft == sumRight && i < j){
        console.log("i: ", i, "j: ", j)
        console.log("Sum Left: ", sumLeft, "Sum Right: ", sumRight)
        j--;
        i++;
        sumLeft += arr[i];
        sumRight += arr[j];
    }
    if(sumLeft < sumRight && i <= j){
        i++;
        sumLeft += arr[i];
    }
    if(sumLeft > sumRight && i <= j){
        j--;
        sumRight += arr[j];
    }
    if(i == j && sumRight == sumLeft){
        console.log("reached")
        console.log("Balance index is at arr[", i, "]")
        return i;
    }
    if(i == j && sumRight != sumLeft){
        return false;
    }
}

console.log(balancePoint([1,2,3,4,10]))
console.log(balancePoint([1,2,3,2,1])) // FALSE
console.log(balancePoint([1,2,3,1,2,3,2,1])) // FALSE
console.log(balancePoint([2,2])) // TRUE