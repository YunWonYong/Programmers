const solution = (nums) => {
    const answer = [];
    const range = nums.length;
    let one = 0;
    let two = 1;
    let three = 2;
    let temp = 0;
    let index = 0;
    return (() => {
        while(true) {
            if (three === range) {
                two++;
                three = two + 1;
            }
            if (two === range - 1) {
                one++;
                two = one + 1;
                three = two + 1;
            }
            if (one === range -2) {
                break;
            }
            temp = nums[one];    
            temp += nums[two];
            temp += nums[three++];
            if (temp % 2 === 0 || temp % 3 === 0) {
                continue;
            }
            answer[index++] = temp;
        }
        return answer.filter(isPrimeNumber).length;              
    })();
};

const isPrimeNumber = (num) =>{
    let no = 2;
    while(true) {
        if (num % no++ === 0) {
            return false;
        }
        if (no === num) {
            return true;
        }
        if (num % no++ === 0) {
            return false;
        }
    }
};
solution([1,2,3,4], 1);