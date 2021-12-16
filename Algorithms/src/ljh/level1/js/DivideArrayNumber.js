let arr = [15,5,9,7,10];
let divider = 5;
solution(arr, divider);

arr = arr.filter((value) => value % divider ===0);
if(arr.length < 1){
    arr[0] = -1;
}else{
    arr.sort((a, b) => a-b);
}

console.log(arr);
function solution(arr, divisor) {
    return arr;
}