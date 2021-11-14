const solution = (left, right) => {
    let answer = 0;
    debugger;
    while(true) {
        if (left > right) {
            return answer;
        }
        answer += plusFlag(left) ? left: (~left) + 1;
        left++;
    }
};

const plusFlag = (num) =>{
    if ( num === 1 ) {
        return false;
    } else if ( num < 4 ) {
        return true;
    }
    let count = 2;
    let left = 2;
    let temp = Math.ceil(num / 2);
    let right = temp;
    while(true) {
        if (left === temp) {
            return count % 2 === 0;
        }
        if (left * right === num) {
            count++;
            if (left != right) {
                count++;
            }
        }
        if (left === right) {
            right = temp;
            left++;
        }
        right--;
    }
};
solution(13, 17);