const oper = (num, at) => {
    let squared = at === "S" ? 1 
                    : at === "D" ? 2
                        : at === "T" ? 3 
                            : -1;
    return Math.pow(num, squared);
};

const solution = dartResult => {
    const answer = [];
    let num = 0;
    let at = 0;
    const tokens = dartResult.split("");
    while((at = tokens.shift())) {
        if (at === "*") {
            astarCalc(answer);
            continue;
        } else if (at === "#") {
            num = answer[answer.length - 1];
            if (num !== undefined) {
                answer[answer.length - 1] = (~num) + 1;
            }
            num = 0;
            continue;
        }  else if (/[sdt]/i.test(at)) {
            answer.push(oper(num, at));
            num = 0;
            continue;
        } 
        num = parseInt(num + at); 
    }
    return answer.reduce((prev, next) => prev + next);
}

const astarCalc = arr => {
    let index = arr.length - 2;
    let num = 0;
    while(index < arr.length) {
        num = arr[index++];
        if (!num) {
            continue;
        }
        arr[index - 1] = num * 2;
    }
};

const result = [74, 72, 37, 9, 3, 23, 5, -4, 59];
["1S*2D*3T*", "1S2D*3T*", "1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*"].forEach((el, index) => {
    const r = result[index];
    const s = solution(el);
    try{
        if ( r !== s) {
            throw new Error(["solution: ", s,", result: ", r].join(""));
        }
    }catch(e){
        console.log(e);
        throw e;
    }
});
console.log(solution("1S2D*3T"));