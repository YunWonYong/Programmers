const solution = nums => {
    let answer = nums.length / 2;
    let set = [];
    nums.forEach( el => {
        if (set.indexOf(el) == -1) {
            set.push(el);
            return;
        }
    });
    return Math.min(answer, set.length);
};