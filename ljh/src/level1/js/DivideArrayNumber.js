let arr = [15,5,9,7,10];
let divider = 5;
arr = solution(arr, divider);

console.log(arr);

function solution(arr, divisor) {
	arr = arr.filter((value) => value % divider ===0);
	if(arr.length < 1){
	    arr[0] = -1;
	}else{
	    arr = arr.sort((a, b) => a-b);
	}
    return arr;
}