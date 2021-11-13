const solution = (n, lost, reserve) =>{ 
    const arr = Array(n).fill(1);
    arr.forEach((el, index) => {
        let num = index + 1;
        let lostIndex = lost.indexOf(num);
        let reserveIndex = reserve.indexOf(num);
        if (lostIndex == reserveIndex) {
            return;
        }
        if (lostIndex > -1) {
            arr[index]--;
        }
        if (reserveIndex > -1) {
            arr[index]++;
        }
    });
    arr.reduce((prev, next, nextIndex)=>{
        if (prev === 0 && next > 1) {
            arr[nextIndex - 1]++;
            next--;
            arr[nextIndex]--;
        } else if (prev > 1 && next === 0){
            arr[nextIndex - 1]--;
            next++;
            arr[nextIndex]++;
        }
        return next;
    });
    return arr.filter(el => el > 0).length;
};
