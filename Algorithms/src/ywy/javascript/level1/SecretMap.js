const solution = (n, arr1, arr2) => {
    const answer = [];
    arr1.forEach((el, index) => {
        answer.push(
            (el | arr2[index])
            .toString(2)
            .padStart(n, "0")
            .replace(/[1|0]/g, a =>  +a? "#": " "));
    });
    return answer;
};