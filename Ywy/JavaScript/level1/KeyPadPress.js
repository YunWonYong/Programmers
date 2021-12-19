const pad = [
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ],
    [-1, 0, -2]
];
const solution = (numbers, hand) => {
    const answer = [];
    const left = "L";
    const right = "R";
    let leftPos = {x:0, y:3};
    let rightPos = {x:2, y:3};
    let movePos = {x:0, y:0};
    let nearHand;
    let leftMoveCount = -1;
    let rightMoveCount = -1;
    
    numbers.forEach((el) => {
        movePos = posSearch(el);
        if ([1, 4, 7].indexOf(el) > -1) {
            nearHand = left;
            leftPos = movePos;
        } else if ([3, 6, 9].indexOf(el) > -1) {
            nearHand = right;
            rightPos = movePos;
        } else {
            leftMoveCount = moveCount(leftPos, movePos);
            rightMoveCount = moveCount(rightPos, movePos);
            if (leftMoveCount < rightMoveCount || (leftMoveCount === rightMoveCount && hand === "left")) {
                leftPos = movePos;
                nearHand = left;
            } else {
                rightPos = movePos;
                nearHand = right;
            }
        } 
        answer.push(nearHand);
    });
    return answer.join("");
}

const posSearch = (el) =>{
   let range = pad.length;
   let y = 0;
   let x = 0;
   do {
     x = pad[y].indexOf(el);
     if (x > -1) {
        return {y: y, x: x};;
     }
   } while((++y) < range);
    return null;
};


const moveCount = (fromPos, toPos) => {
    return Math.abs(fromPos.x - toPos.x) + Math.abs(fromPos.y - toPos.y);
};

console.log(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], "right")); // LRLLLRLLRRL