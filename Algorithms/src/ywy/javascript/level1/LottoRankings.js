const solution = (lottos, winNums) => {
    let zero = 0;
    let num = 0;
    lottos.forEach((el) => {
        if (el === 0) {
            zero++;
        } else if (winNums.indexOf(el) > -1){
            num++; 
        }
    });
    return [getRanking(zero + num), getRanking(num)];
}
const getRanking = (no) => no === 6 ? 1 : no === 5 ? 2 : no === 4 ? 3 : no === 3 ? 4 : no === 2 ? 5: 6;  